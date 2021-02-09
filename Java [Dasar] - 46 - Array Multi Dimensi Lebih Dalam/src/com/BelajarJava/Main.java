package com.BelajarJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[][] array_2D = {
                {1,2,3},
                {4,5,6}
        };
        System.out.println("==========ini cara print dan konsep array int============");
        System.out.println(array_2D + " ==> ini adalah address header dari array int 2 dimensi");
        System.out.println(Arrays.toString(array_2D) + " ==> ini adalah addres yang ada di dalam headernya");
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);
        System.out.println(Arrays.deepToString(array_2D) + " ==> ini untuk mengecek array kedalam headernya dengan perintah deep.ToString");

        System.out.print("\n");


        char[] array_char1 = {'a','b','c'};
        char[] array_char2 = {'d','e','f'};

        char[][] array_campur = {
                array_char1,
                array_char2
        };

        System.out.println("==========ini cara print dan konsep array char============");
        System.out.println(" Ketentuan array 2 dimensi : 1. tipe datanya harus sama, 2. dan length dari 2 buah array tidak ditentukan \n");
        System.out.println(array_char1 + " ==> ini hanya dengan print biasa");
        System.out.println(array_char2 + " ==> ini hanya dengan print biasa");
        System.out.println(array_campur + " ==> ini adalah header address array char 2 dimensi ");
        System.out.println(Arrays.toString(array_campur) + " ==> ini adalah addres yang ada di dalam headernya");
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)) + " ==> ini cara print out string dengan Integer.toHexString(System.identityHashCode ");
        System.out.println(Arrays.deepToString(array_campur) + " ==> ini cara print out string dengan Arrays.deepToString");
    }
}