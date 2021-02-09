package com.BelajarJava;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayAngka1 = {1, 2, 3, 4, 5};
        int[] arrayAngka2 = new int[5];

        System.out.println(Arrays.toString(arrayAngka1));

        arrayAngka2 = arrayAngka1;
        System.out.println("array 1 ==> " + Arrays.toString(arrayAngka2));

        arrayAngka2[2] = 45;
        System.out.println("array 2 ==> " + Arrays.toString(arrayAngka2));

        arrayAngka1[1] = 90;
        System.out.println("array 1 ==> " + Arrays.toString(arrayAngka1));
        System.out.println("array 2 ==> " + Arrays.toString(arrayAngka2));

/*

        jika ingin ditambahkan kode ini harus buat fungsi return = 0
        System.out.println(Ubahdata(arrayAngka2));
*/

        Ubahdata(arrayAngka1);
        System.out.println("Array 1 dengan method ==> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 dengan method ==> " + Arrays.toString(arrayAngka2));
    }

    // method yang argumentnya adalah reference, pass by reference
    // bukan pass by value = selain array / tipe data lain

    private static void Ubahdata(int[] dataArray) {
        for (int data: dataArray) {
            System.out.println(data);
        }
        // kalau mau mengontrol looping pada array
        // harus disertakan indexnya
        /*if(dataArray [4] == 5 ){
            return 0; berkaitan dengan baris 24
        }*/
        dataArray[3] = 900;
        for (int data: dataArray) {
            System.out.println(data);
        }
//jika ingin menggunakan rekursif
//        return Ubahdata(dataArray);
        // java: missing return statement error ini menunjukkan pada method yg dibuat tipe datanya int
    }
}

