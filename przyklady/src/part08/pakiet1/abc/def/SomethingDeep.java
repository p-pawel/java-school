package part08.pakiet1.abc.def;

import part08.pakiet1.abc.def.ghi.SpecialMath;

import java.lang.System;   // tego nie musimy robić, bo klasy z tego pakietu java.lang będą (niejawnie) zaimportowane za nas
import java.util.Random;

import static java.lang.Math.abs;

public class SomethingDeep {

    public static void main(String[] args) {
        Random random = new Random();

        java.util.Date date1 = new java.util.Date();
        java.sql.Date date2 = new java.sql.Date(00L);

        System.out.println();

        Byte b = Byte.valueOf((byte) 0);

        int[] x = new int[]{1,2,3};

        System.out.println(Math.abs(12.0));
        System.out.println(SpecialMath.abs(12.0));
    }
}


