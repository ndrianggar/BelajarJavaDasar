package com.BelajarJava;

import java.util.Scanner;

public class belajar_rekursif_gambar {

    static int baris = 5;

    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jumlah baris = ");
            baris = inputUser.nextInt();
            printPiramida(0);
        }
    }

    static void printPiramida(int i){
        printSpasi(0, i);
        printBintang(baris,i);
        System.out.println();

        if(++i < baris){
            printPiramida(i);
        }
    }

    static void printSpasi(int j, int i){
        if(j < baris - i - 1){
            System.out.print(" ");
            printSpasi(j + 1, i);
        }

    }
    static void printBintang(int k, int i){
        if(k > baris - i - 1){
            System.out.print("* ");
            printBintang(k - 1, i);
        }
    }

}
