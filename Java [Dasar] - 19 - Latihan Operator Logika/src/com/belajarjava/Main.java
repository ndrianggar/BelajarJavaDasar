package com.belajarjava;

import java.util.*;


public class Main {

    public static void main(String[] args){

        // membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkah nilai tebakan anda : ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah " + nilaiTebakan);

        statusTebakan = nilaiBenar == nilaiTebakan;

        System.out.println("Tebakan anda adalah .." + statusTebakan);

        // PROGRAM SEDERHANA
        System.out.print("Masukkan nilai antara 10 sd 20 ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah " + nilaiTebakan);

        // Operasi aljabar boolean and / or
        statusTebakan = nilaiBenar > 4 && nilaiBenar < 20;

        System.out.println("Tebakan anda adalah " + statusTebakan);

    }

}

/*
       a | b | c
       0   0   0
       0   1   0
       1   0   0
       1   1   1

 */
