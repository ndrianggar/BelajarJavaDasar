package com.belajarjava;

public class Main {
    public static void main(String[] args){
//
//        do{
//            aksi
//        }while (kondisi);
        int a = 0;
        boolean kondisi = true;

        do{
            a++;
            System.out.println("while loop ke- " + a);

            if(a == 10){
                kondisi = false;
            }

        }while (kondisi);
//        System.out.println("Akhir program");
    }
}
