package com.BelajarJava;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // tipedata [] nama = {komponen-komponen}
        //             index = 0 1 2 3
        // Array Asigment      | | | |
        int [] arrayInteger = {2,4,5,6};

        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);

        float [] arrayFloat = {19.7f};
        System.out.println(arrayFloat[0]);
        System.out.println();

        // Array Deklarasi

        float [] ContohFloat = new float[5];
        ContohFloat [1] = 56.77f;
        ContohFloat [0] = 5; // mengcasting otomatis dengan array
        System.out.println(ContohFloat[0]);
        System.out.println(ContohFloat[1]);
        System.out.println(ContohFloat[2]);
        System.out.println(ContohFloat[3]);

        System.out.println(Arrays.toString(ContohFloat));
        System.out.println(Arrays.toString(arrayInteger));
    }

}
