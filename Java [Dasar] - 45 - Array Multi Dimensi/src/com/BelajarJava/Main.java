package com.BelajarJava;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // cara membuat array 1 dan 2 dimensi dengan asigment
        int[] array_1D = {1,3,4,5,6}; // array 1 dimensi
        int[][] array_2D = {
                {1,2,4,5,6},
                {2,4,5,6}
        };
        System.out.println(Arrays.toString(array_1D)); // cara print jika 1 dimensi array
        printArray2D(array_2D);

        // cara membuat array 1 dan 2 dimensi dengan deklarasi
        int [] Array_1D = new int[5];
        System.out.println(Arrays.toString(Array_1D));

        // int [baris] [kolom]
        int [] [] Array_2D = new int[5][4];

        // untuk mengetahui panjangnya array_2D dengan print length
        System.out.println("ini panjang length pada array 2 dimensi : " + Array_2D.length + " Baris");


        // buat looping array 2D cara manual
        System.out.println("menggunakan manual loop");
        for(int i=0; i< Array_2D.length;i++){
            System.out.print("[");
            for (int j=0; j< Array_2D[i].length;j++){
                System.out.print(Array_2D[i][j] + ",");
            }
            System.out.print("]\n");
        }
        System.out.println("menggunakan foreach");
        // buat looping array 2D cara for each
        for (int[] baris: Array_2D) {
            System.out.print("[");
            for (int angka:baris) {
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }

        // array sudah membuatkan fungsi bahwa array bisa diakses walaupun berbeda baris dan kolom
        int[][] array_pembuktian = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        System.out.println("menggunakan method");
        printArray2D(array_pembuktian);

        // array ragged java (maksudnya bisa diakses walaupun baris dan colom berbeda)
        int [][] array_ragged = {
                {1,2,3},
                {4,5},
                {6}
        };

        printArray2D(array_ragged);
    }
    private static void printArray2D (int[][] dataArray){
        for (int[] baris: dataArray) {
            System.out.print("[");
            for (int angka:baris) {
                System.out.print(angka + ",");
            }
            System.out.print("]\n");
        }
        /*

        System.out.println(Arrays.deepToString(dataArray)); // cara print jika 2 dimensi array
*/
    }
}
