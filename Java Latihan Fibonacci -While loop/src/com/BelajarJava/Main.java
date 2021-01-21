package com.BelajarJava;

import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner InputUser = new Scanner(System.in);

        int f_n_1, f_n_2, n,no, f_n;
        boolean kondisi = true;

        System.out.print("Masukkan nilai fibbonacci = ");
        n = InputUser.nextInt();

        no =0;
        f_n_1 = 1;
        f_n_2 = 0;
        f_n = 1;

        while (kondisi){
            no++;
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;
            System.out.println(" Fibbonacci ke = " + no + " adalah " + f_n);


            if(no == 10){
                kondisi = false;

            }
       }

    }
}
