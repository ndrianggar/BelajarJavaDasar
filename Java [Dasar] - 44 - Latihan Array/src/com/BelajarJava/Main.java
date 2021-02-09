package com.BelajarJava;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // menggabungkan 2 buah array
        // tugas -> sort kebalikannya
        // operasi tambah 2 array


        // <<< Penjumlahan 2 buah array >>>

        System.out.println(" <<< Penjumlahan 2 buah array >>> ");
        int[] arrayAngka1 = {1,3,2,4,5,3,1,3,5,6,7};
        int[] arrayAngka2 = {2,3,4,5,6,6,7,8,8,8,9};

        // cara pertama ketika ingin menampung array 1 pada hasilArray
        /*int[] hasilArray = new int[arrayAngka1.length];
        printArray(hasilArray, "array angka");*/

        // INI HASIL PENJUMLAHAN
        int[] Hasiltambah = tambahArray(arrayAngka1,arrayAngka2);
        printArray(arrayAngka1,"ini array 1");
        printArray(arrayAngka2,"ini array 2");
        printArray(Hasiltambah,"ini HasilTambah");


        // INI HASIL PERKALIAN
        int[] Hasilkali = kaliArray(arrayAngka1,arrayAngka2);
        System.out.println("\n <<< Perkalian 2 buah array >>> ");
        printArray(arrayAngka1,"ini array 1");
        printArray(arrayAngka2,"ini array 2");
        printArray(Hasilkali,"ini HasilKali");

        // Menggabungkan 2 buah aray (Menempelkan 2 buah array)
        int[] HasilTempelan = new int[arrayAngka1.length + arrayAngka2.length];

        for(int i =0; i< arrayAngka1.length; i++){
            HasilTempelan[i] = arrayAngka1[i];
        }

        for(int i =0; i<arrayAngka2.length;i++){
            HasilTempelan[i + arrayAngka1.length] = arrayAngka2[i];
        }

        System.out.println("\n <<< Menggabungkan 2 buah array >>> ");
        printArray(arrayAngka1,"ini array 1");
        printArray(arrayAngka2,"ini array 2");
        printArray(HasilTempelan,"ini HasilPenggabungan");

        // Sorting revers, Mengurutkan array dengan format descending
        System.out.println("\n <<< Sorting revers, Mengurutkan array dengan format descending >>> ");
        printArray(arrayAngka1,"ini array 1");

        Reverse(arrayAngka1);
        // bikin format panjang array yang ingin disorting dan didescending
//        int[] arrayBuffer = Arrays.copyOf(arrayAngka1, arrayAngka2.length);
//
//        for(int i =0; i<arrayAngka1.length;i++){
//            arrayAngka1[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
//        }
//        printArray(arrayAngka1,"reverse");

        // arrayBuffer = variable array yg mengcopy arrayAngka2 dengan mengambil rangenya
        // arrayAngka1[i] = variable tampungan yang akan dilooping
        // arrayBuffer[-i] = memasukkan arrayBuffer pada arrrayAngka1
        // (arrayBuffer.length -1) = ini menjadikan index terakhir menajadi pertama

        System.out.println("\n <<< Sorting revers, Mengurutkan array dengan format descending Cara k-2>>> ");
        printArray(arrayAngka2,"ini array 2");
        Reverse2(arrayAngka2);
    }


        // Keuntungan dengan reverse2 lebih cepat karena hanya melooping setengah dari panjang data array
        // Dan tidak membuat array baru, hanya menampung pada variable
        private static void Reverse2(int[] dataArray){
         Arrays.sort(dataArray);
            int Buffer;
            for(int i =0; i<dataArray.length/2;i++){
                Buffer = dataArray[i];
             dataArray[i]=dataArray[(dataArray.length-1)-i];
             dataArray[(dataArray.length-1)-i] = Buffer;
         }


        }
        // membuat array baru pada reverse1 ini, dan membuat array baru
        private static void Reverse(int[] dataArray){
            Arrays.sort(dataArray);
            printArray(dataArray, "sorted");
            // bikin format panjang array yang ingin disorting dan didescending
            int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);

            for(int i =0; i<dataArray.length;i++){
                dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
            }
            printArray(dataArray,"reverse");

        }

        private static int[] kaliArray(int[] arrayInt1, int[] arrayInt2){
        int[] hasilArray = new int[arrayInt1.length];
        // perkalian 2 buah array
            for(int i = 0; i< arrayInt1.length; i++){
                hasilArray[i] = arrayInt1[i] * arrayInt2[i];
            }
            return hasilArray;
        }

        private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2){
        int[] hasilArray = new int[arrayInt1.length];
            // Penjumlahan 2 buah array
            for(int i = 0; i < arrayInt1.length; i++){
                hasilArray[i] = arrayInt1[i] + arrayInt2[i];
            }
            return hasilArray;
        }

        private static void printArray(int[] dataArray, String message){
            System.out.println(message + " = " + Arrays.toString(dataArray));
        }
}
