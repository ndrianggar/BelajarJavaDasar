package com.BelajarJava;

import java.util.*;

public class Main {
    public static void main(String[] args){

        // angka deret fibbonacci

        // 1 2 3 4 5 6 7   8   9   10
        // 1 1 2 3 5 8 13  21  34   55

        Scanner InputUser = new Scanner(System.in);
        int f_n,f_n_1, f_n_2, n;

        System.out.print("Ambil nilai fibbonacci ke -");
        n = InputUser.nextInt();

        f_n_1 = 1;
        f_n_2 = 0;
        f_n = 1;


        for(int i = 1; i <= n; i++){
            System.out.println("Nilai ke - " + i + " Adalah " + f_n);
            f_n = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = f_n;

        }




    }
}
