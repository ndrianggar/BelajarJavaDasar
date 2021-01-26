package com.BelajarJava;

import java.util.Scanner;

public class AlgoHanoi {
    public static void main(String[] args){

        // deklarasi variable
        int a,b,c;

        // fungsi input
        Scanner inputUser = new Scanner(System.in);

        // Ambil inputan user
        System.out.println("Masukkan nilai a = " );
        a = inputUser.nextInt();

        // Ambil inputan user
        System.out.println("Masukkan nilai b = " );
        b = inputUser.nextInt();


        c = a; // Isikan nilai a ke c
        a = b; // Isikan nilai b ke a
        b = c; // Isikan nilai c ke b

        System.out.printf("Nilai a = %d, b = %d \n",a,b);
    }

}
