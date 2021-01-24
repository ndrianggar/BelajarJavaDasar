package com.BelajarJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print(" masukkan nilai fibbo = ");
        int inputFibbo1 = userInput.nextInt();

/*
        System.out.print(" masukkan nilai fibbo = ");
        int inputFibbo2 = userInput.nextInt();
*/

      Fibbonacci(inputFibbo1);

    }

    private static int Fibbonacci(int input){
//        int hasil = f_n_1 * f_n_2;
//        return hasil
        int userInput;

        int f_n_1 = 1;
        int f_n_2 = 0;
        int fn = 1;


        for (int i = 0; i<= input; i++){
            System.out.println(" nilai ke - " + i + " adalah " + fn );

            fn = f_n_1 + f_n_2;
            f_n_2 = f_n_1;
            f_n_1 = fn;
        }
        return fn;

    }

}
