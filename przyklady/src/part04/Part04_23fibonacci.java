package part04;


import java.util.Arrays;

public class Part04_23fibonacci {

    public static void main(String[] args) {

        // Specyfikacja: chcemy otrzymać 10 pierwszych elementów ciągu Fibonacciego zdefiniowanego jak poniżej
        // 1: 1
        // 2: 1
        // 3: 2
        // 4: 3
        // 5: 5
        // 6: 8
        // 7: 13
        // ...
        // 10: 55

        int f[] = new int[10];

        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < 10; i++) {
            f[i] = f[i-2] + f[i-1];
        }
        System.out.println(Arrays.toString(f));

    }

}