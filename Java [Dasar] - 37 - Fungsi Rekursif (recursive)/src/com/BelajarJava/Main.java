package com.BelajarJava;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.print(" masukkan nilai: ");
            int nilai = userInput.nextInt();
            System.out.println(" nilainya = " + nilai);

            PrintNilai(nilai); // memasukkan nilai ke parameter fungsi
            int hasilPenjumlahan = Penjumlahan(nilai);
            System.out.print("\n");
            System.out.println(" Hasil Rekursif Penj = " + hasilPenjumlahan);

            int hasilFaktorial = Faktorial(nilai);
            System.out.print("\n");
            System.out.println(" Hasil Rekursif Fakto = " + hasilFaktorial);
        }
    }

    // membuat printnilai rekursif
    private static void PrintNilai(int parameter) {

//        if (parameter <= 10) { ini pembuka if cara 1
        System.out.println(" Parameter Print Nilai = " + parameter);

        if (parameter == 0){
            return;
        }
        parameter--;
        PrintNilai(parameter);
//            Penjumlahan(++parameter); bisa dengan ini

        // } // ini penutup if cara 1
    }

    // membuat rekursif penjumlahan rekursif
   private static int Penjumlahan(int parameter){
        System.out.print("\n");
        System.out.print(" Parameter Penjumlahan = " + parameter);
        if (parameter == 0){
            return parameter;
        }
        return parameter + Penjumlahan(parameter -1);
    }


    // membuat faktorial rekursif
    private static int Faktorial(int parameter){
        System.out.print("\n");
        System.out.print(" Parameter Faktorial = " + parameter);
        if (parameter == 1){
            return parameter;
        }
        return parameter * Faktorial(parameter -1);
    }
}
