package com.BelajarJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //0  1  2  3  4  5  6  7   8  9  10
        //0  1  1  2  3  5  8  13  21 34 55

        Scanner InputUser = new Scanner(System.in);

        int fn, f_n_1, f_n_2, n, no;
        boolean kondisi = true;

        System.out.println("Masukkan Fibbonacci = ");
        n = InputUser.nextInt();

        f_n_1 = 1;
        f_n_2 = 0;
        fn = 1;
        no = 0;

        do{
            no++;
            System.out.println("Fibbonacci ke = " + no +  " adalah " + fn);
            fn = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = fn;

            if(no == 10){
                kondisi = false;
            }

        }while (kondisi);

    }
}
