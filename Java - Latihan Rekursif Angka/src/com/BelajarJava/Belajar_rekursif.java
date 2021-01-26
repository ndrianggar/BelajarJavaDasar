package com.BelajarJava;

public class Belajar_rekursif {

        public static void main(String[] args) {
            cetakAngka(0);
        }
    private static void cetakAngka(int angka){
        if(angka <=10){
            System.out.println(angka);
            cetakAngka(++angka);
        }
    }
}

