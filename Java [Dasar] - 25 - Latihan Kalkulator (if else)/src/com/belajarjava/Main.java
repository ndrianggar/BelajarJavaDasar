package com.belajarjava;

import java.util.*;

public class Main {
    public static void main(String[] args){
        /* 5 + 6
           a operator b
        */

        Scanner inputUser = new Scanner(System.in);
        float a,b, hasil;
        char operator;

        System.out.print(" masukkan nilai a : ");
        a = inputUser.nextFloat();
        System.out.print(" masukkan operator : ");
        operator = inputUser.next().charAt(0);
        System.out.print(" masukkan nilai b : ");
        b = inputUser.nextFloat();

        System.out.println("hasil penjumlahan nilai : " + a + " " + operator + " " + b );

        if(operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println(" Hasilnya " + hasil);
        }else if(operator == '-'){
            // pengurangan
            hasil = a - b;
            System.out.println(" Hasilnya " + hasil);
        }else if(operator == '*'){
            // pengkalian
            hasil = a * b;
            System.out.println(" Hasilnya " + hasil);
        }else if(operator == '/'){
            // pembagian
            if(b == 0 ){
                System.out.println("Pembagi nol tak terhingga");
            }else{
                hasil = a / b;
                System.out.println(" Hasilnya " + hasil);
            }
        }else {
            System.out.println("Operator tidak ditemukan!");
        }

    }
}
