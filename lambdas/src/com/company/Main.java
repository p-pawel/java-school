package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    private final static int LOG_LEVEL = 10;

	public static void main(String[] args) {
		ChildAnimal childAnimal = new ChildAnimal();

		List<Mammable> mammables = new ArrayList<>();
		mammables.add(new ChildAnimal());
		mammables.add(new ChildAnimal());
		mammables.add(new ChildAnimal());

		for (Mammable mammable : mammables) {
			isSmallAnimal(mammable);
		}

		mammables.forEach(mammable -> isSmallAnimal(mammable));


		Consumer<Mammable> function = (Mammable m) -> {
			System.out.println(m.isStillDrinkingMilk());
		};


		long x = ourAbs(100L);
		System.out.println(x);

		Function<Long, Long> f = Math::abs;
		System.out.println(f.apply(100L));

		isBiggerThan100(1001L);


		Predicate<Long> predicate2 = new IsBiggerThan100Predicate();
		System.out.println(predicate2);

		Predicate<Long> predicate3 = new Predicate<Long>() {
			@Override
			public boolean test(Long aLong) {
				return Main.isBiggerThan100(aLong);
			}
		};
		System.out.println(predicate3);

		Predicate<Long> predicate3a = new Predicate<Long>() {
			@Override
			public boolean test(Long aLong) {
				return Main.isBiggerThan100(aLong);
			}
		};
		System.out.println(predicate3a);

		Predicate<Long> predicate1 = Main::isBiggerThan100;
		System.out.println(predicate1);

		Main main = new Main();
		// method references
		Predicate<Long> ref1 = Main::isBiggerThan100; // ref to static method
		Supplier<Main> ref2 = Main::new; // ref to constructor
		Predicate<Long> ref3 = main::instanceMethod; // ref to instance method of specific object
		BiFunction<Main, Long, Boolean> ref4 = Main::instanceMethod; // ref to instance method of any object of this type

		ref1.test(100L);
		ref2.get();
		ref3.test(200L);
		ref4.apply(main, 100L);

		List<Mammable> list = mammables.stream()
				.filter(new Predicate<Mammable>() {
					@Override
					public boolean test(Mammable ma) {
						return ma.isStillDrinkingMilk();
					}
				})
				.collect(Collectors.toList());

		List<Mammable> list2 = mammables.stream()
				.filter(mm -> mm.isStillDrinkingMilk())
				.collect(Collectors.toList());

		System.out.println(list);

		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		};

		List<Integer> integers = IntStream.range(0, 10).boxed().collect(Collectors.toList());
		System.out.println(integers);

		for (Integer i : integers) {
			System.out.println(comparator.compare(i, 5));
		}

		integers.forEach(i -> {
			System.out.println(comparator.compare(i, 5));
		});


		debug(list.toString());
		debug(() -> list.toString());
		debug(list::toString);


	}

    private static void debug(String toString) {
        if (LOG_LEVEL > 100) {
            System.out.println(toString);
        }
    }

    private static void debug(Supplier <String> messageSupplier) {
        if (LOG_LEVEL > 100) {
            System.out.println(messageSupplier.get());
        }
    }

    public static void isSmallAnimal(Mammable mammable) {
		System.out.println(mammable.isStillDrinkingMilk());
	}

	public static long ourAbs(long l) {
		return Math.abs(l);
	}

	public static boolean isBiggerThan100(long l) {
		return l > 100L;
	}

	public void hello() {

	}

	public boolean instanceMethod(long l) {
		return true;
	}
}
