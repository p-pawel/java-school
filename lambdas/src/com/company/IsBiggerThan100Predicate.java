package com.company;

import java.util.function.Predicate;

public class IsBiggerThan100Predicate implements Predicate<Long> {

	@Override
	public boolean test(Long aLong) {
		return aLong > 100;
	}
}
