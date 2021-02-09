package com.BelajarJava;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayAngka1 = {1,2,3,4,5};
    //    System.out.println(Arrays.toString(arrayAngka1)); ini awal print ketika belum pakai fungsi


        System.out.println("\n << Merubah array menjadi >>");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);

        // Mengkopi array
        System.out.println("\n<< Mengkopi array dengan loop >>");
        for(int i =0; i< arrayAngka1.length; i++){
            arrayAngka2 [i] = arrayAngka1 [i];
        }
        printArray(arrayAngka1);
        // cara menguji metode kopi array by value ini berhasil yaitu dengan cara :
        // melakukan print dan memanggil variable array tersebut
        System.out.println(arrayAngka1 + " ==> ini address array 1");
        printArray(arrayAngka2);
        System.out.println(arrayAngka2  + " ==> ini address array 2");

        System.out.println("\n<< Mengkopi array dengan CopyOf >>");
        int[] arrayAngka3 = new int[5];
        arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        printArray(arrayAngka1);
        printArray(arrayAngka3);

        System.out.println("\n << Mengkopi array dengan CopyOfRange >> ");
        int[] arrayAngka4 = new int[5];
        arrayAngka4 = Arrays.copyOfRange(arrayAngka1,3,5);
        printArray(arrayAngka1);
        printArray(arrayAngka4);

        // Fill array
        System.out.println("\n << Fill array >> ");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 4);
        printArray(arrayAngka5);

        // Komparasi array
        System.out.println("\n << Komparasi array >> ");
        int[] arrayAngka6 = {1,2,3,4,5,6};
        int[] arrayAngka7 = {1,2,3,4,7,6};

        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        // hasilnya boolean
        // hasilnya beda karena yang dicek adalah adressnya bukan by value
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("array ini sama");
        }else{
            System.out.println("array ini beda");
        }

        System.out.println("\n mengecek mana array yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));

        /*
            hasilnya integer
            hasilnya :
            0 ==> jika tidak ada yang lebih besar pada array yang dibandingkan
            1 ==> jika array yg pertama lebih besar dari array yang kedua pada index array pertama
            -1 ==> jika array yang kedua lebih besar dari array yang pertama pada index array kedua
         */

        System.out.println("\n mengecek mana array yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));
   /*
            hasilnya integer
            hasilnya :
            -1 ==> jika array yang keduanya tidak ada yang berbeda
            jika ada yang berbeda maka yang ditampilkan index yang berbeda tsb
         */

        //sort array
        System.out.println("\n Sort array");
        int[] arrayAngka8 = {1,4,3,5,2,4,6,7,8,9,10};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);

        //search array
        System.out.println("\n Search array");
        int angka =3;
       int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index ke-" + posisi);

    }


    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }


}

