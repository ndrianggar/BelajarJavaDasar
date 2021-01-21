package com.belajarjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // switch case

        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        input = inputUser.next();


     /*   switch(ekspresi1){
            case pilihan1:
                    statement

          definisi :
          a/ switch case ekspresinya berupa satuan
          (int, long, byte, short), String atau enum

        keterangan :
        1. switch adalah fungsion untuk menampung data
        2. case adalah kondisi dari data
        3. statement adalah output yang diinginkan

        }*/

        switch (input){
            case "ucup":
                System.out.println("saya hadir");
                break; // ini untuk menghentikan pengecekan pada kode berikutnya
            case "doni":
                System.out.println("saya hadr bos");
                break;
            default:
                System.out.println(input + " tidak hadir bos");
        }
    }
}
