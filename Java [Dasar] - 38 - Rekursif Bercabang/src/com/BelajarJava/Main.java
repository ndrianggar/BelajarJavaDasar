package com.BelajarJava;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = inputUser.nextInt();
        int hasilFibonacci = Fibbonacci(nilai, "atas");
        System.out.println("hasil fibbonaco ke-5 adalah " + hasilFibonacci);
    }

    private static int Fibbonacci(int n, String daun) {
        System.out.println("daun" + daun);
        // untuk menguji tambahkan kode sout
        System.out.println("fibbonacci ke-" + n);

//        if(n == 0 ){
//            return 0;
//        }else if(n == 1){
//            return 1;
//        } bisa dengan if ini cara 1

        if (n == 0 || n == 1) {
            return n;
        } else {
            // ini recursive nested
            // rumusnya

           // f(n) = f(n - 1) + f(n - 2)
            return Fibbonacci(n - 1, " kiri") + Fibbonacci(n - 2, " kanan");
        }
    }
}


/*
        keterangan
        return Fibbonacci (n- 1);
        akan mencetak :
        fibbonacci ke-4
        fibbonacci ke-3
        fibbonacci ke-2
        fibbonacci ke-1
        fibbonacci ke-0





 */
