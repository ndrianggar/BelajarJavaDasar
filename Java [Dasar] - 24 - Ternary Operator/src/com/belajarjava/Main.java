package com.belajarjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ternary operator


        int input, x1;
        int x2 = 0;
        boolean isEven = true;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai : ");
        input = inputUser.nextInt();

        x1 = (input == 10) ? (input*input) : (input/2);
        x2 = isEven ? 4 : 7;


        System.out.println("ini hasil x " + x1);
//        jika menggunakan if
//        if(input == 10){
//           x = (input*input);
//        }else{
//        x  = (input/2);
//        }
        System.out.println("hasilnya : " + x2);


    }
}
