package com.BelajarJava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[][] matrix_a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[][] matrix_b = {
                {11,12,13},
                {14,15,16},
                {17,18,19}
        };

        int[][] matrix_kali1 = {
                {3,4},
                {5,6}
        };
        int[][] matrix_kali2 = {
                {1,2},
                {2,9},
                {5,4}
        };



        printArray(matrix_a);
        printArray(matrix_a);
/*        System.out.println(matrix_a[1][0]);HASILNYA 4 */

        /*
        int baris_a = matrix_a.length;
        int kolom_a = matrix_a[0].length;

        int[][] hasil = new int[baris_a][kolom_a]; // ini membuat int array kosong untuk tempat hasil
        for(int i =0; i< baris_a; i++){
            for(int j=0; j<kolom_a; j++){
                hasil[i][j] = matrix_a[i][j] + matrix_b[i][j];
            }
        }
                ini adalah pola ketika ingin membuat fungsi
        */
//        int[][] hasiltambah = tambah(matrix_a,matrix_b);
/*bisa dengan print seperti ini
    printArray(hasiltambah);*/
    printArray(tambah(matrix_a,matrix_b));
    printArray(perkalian(matrix_kali1,matrix_kali2));
        Scanner inputUser = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan baris: ");
            int row = inputUser.nextInt();
            System.out.print("Masukkan Kolom: ");
            int column = inputUser.nextInt();

     int[][] array_1 = new int[7][6];
            for(int i=0; i<row; i++){
                System.out.print("[");
                for (int j=0; j<column; j++){
//                    array_1[i][j] = inputUser.nextInt();
                  System.out.print(i+j);
                    if(j < (column -1 )){
                        System.out.print(",");
                    }else{
                        System.out.println("]");
                    }

                }
//                System.out.print("\n");
            }
        }

    }




    private static int[][] tambah(int[][] matrix_1, int[][] matrix_2){
        int baris_a = matrix_1.length;
        int kolom_a = matrix_1[0].length;

        //buat kondisi jika array tidak sama antara baris dan kolom
        int baris_b = matrix_2.length;
        int kolom_b = matrix_2[0].length;
        int[][] hasil = new int[baris_a][kolom_a]; // ini membuat int array kosong untuk tempat hasil

        if(baris_a == baris_b && kolom_a == kolom_b){
            for(int i =0; i< baris_a; i++){
                for(int j=0; j<kolom_a; j++){
                    hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
                }
            }
        }else{
            System.out.println("baris atau kolom tidak sama");
        }
        return hasil;
    }

    private static int[][] perkalian(int[][] matrix_1, int[][] matrix_2){
    int baris_a = matrix_1.length;
    int kolom_a = matrix_2.length;

        int baris_b = matrix_1.length;
        int kolom_b = matrix_2.length;
    int buffer;
    // jika a.b maka jumlah baris mengikuti matrix a.
        // kolom mengikuti matrix b.
    int[][] hasil = new int[baris_a][kolom_b];

    if(baris_a == baris_b && kolom_a == kolom_b) {
        for (int i = 0; i < baris_a; i++) {
            for (int j = 0; j < kolom_b; j++) {
                buffer = 0;
                for (int k = 0; k < kolom_a; k++) {
                    buffer += matrix_1[i][k] * matrix_2[k][j];
                }
                hasil[i][j] = buffer;
            }
        }
    }else {
        System.out.println("Perkalian batal");
    }

    return hasil;

    }

    private static void printArray(int[][] dataArray) {

        int baris = dataArray.length;
        int kolom = dataArray[0].length;
//        System.out.println(baris); HASILNYA 3
//        System.out.println(kolom);  IDEM 3

        // syaratnya untuk menambahkan 2 buah matrix harus sama jumlahnya

        for(int i =0; i < baris; i++){
            System.out.print("[");
            for (int j=0; j<kolom; j++){
                System.out.print(dataArray[i][j]);
                if(j < (kolom -1)){
                    System.out.print(",");
                }else{
                    System.out.print("]");
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
