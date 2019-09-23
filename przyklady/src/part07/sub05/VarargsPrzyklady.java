package part07.sub05;

public class VarargsPrzyklady {

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }

    public static void main(String... args) {

        walk(1);            /// → 0
        walk(1, new int[]{});            /// → 0


        walk(1, 2);    // 1

        walk(1, 2, 3);  // 2

        walk(1, new int[]{4, 5} );  // 2

//        walk(1, new int[]{4, 5}, 9);  // nie kompiluje się
//        walk(1, new int[]{4, 5, 7}, new int[]{9});  // nie kompiluje się

        walk(1, null);


    }


}
