package com.belajarjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner inputUser = new Scanner(System.in);
        float a,b,hasil;
        String operator;

        System.out.println("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.println("Operator = ");
        operator = inputUser.next();
        System.out.println("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("Hasilnya = " + a + operator + " " + b );

        switch (operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasilnya = " + hasil);
            break;
            case "-":
                hasil = a - b;
                System.out.println("Hasilnya = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasilnya = " + hasil);
                break;
            default:
                System.out.println("operator" + operator + "tidak ditemukan");
        }
    }
}
