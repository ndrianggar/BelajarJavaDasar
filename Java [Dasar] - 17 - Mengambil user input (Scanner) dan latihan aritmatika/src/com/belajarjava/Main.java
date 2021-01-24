package com.belajarjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner InputUser = new Scanner(System.in);

        int luas, lebar, panjang;
        int volume, tinggi;


        System.out.println("==========MENGHITUG LUAS");
        System.out.print("Panjang = ");
        panjang = InputUser.nextInt();
        System.out.print("lebar = ");
        lebar = InputUser.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas =" + luas + "\n");

        System.out.println("===========MENGHITUNG VOLUME");
        System.out.print("Tinggi = ");
        tinggi = InputUser.nextInt();
        volume = InputUser.nextInt();
        System.out.println("Volume = " + volume);
        System.out.println("Tinggi = " + tinggi);

    }
}


// Aritmatika dengan inputan user
        /* kode awal tutorial
        Scanner InputUser = new Scanner(Sytem.in);


        int input = InputUser.nextInt();
        System.out.print("input" + input);
        int input2 = InputUser.nextInt();
        System.out.print("input2" + input2);

      System.out.print("Panjang = ");
        int panjang = InputUser.nextInt();
        System.out.print("lebar = ");
        int lebar = InputUser.nextInt();

        int luas = panjang * lebar;
        System.out.println("Luas = " + luas);


        // Penjelasan kode
        1. Setiap ingin mengambil input dari user harus menggunakan library
           import java.util.Scanner

           java = folder
           util = folder
           Scanner = Kelas (library)

           Scanner userInput = new Scanner(System.in);

           Scanner = type data
           userInput = variable Scanner
           new Scanner = kelas baru (objek scanner)
           System.in = method untuk ambil string dari layar

        */
