package com.BelajarJava;

public class Main {
    public static void main(String[] args){

        int [] arrayAngka  = {11,12,13,14,15,16,17,18,19,20};

        // looping standar

        System.out.println("ini adalah looping Standar");
        for(int i =0; i < 10; i++){
            System.out.println("ini adalah array ke-" +i+ " adalah = " + arrayAngka[i]);
        }

        // looping dengan properties length
        System.out.println("ini adalah looping dengan properties length");
        for(int i =0; i < arrayAngka.length; i++){
            System.out.println("ini adalah array ke-" + i + " adalah = " + arrayAngka[i]);
        }

        // looping dengan for each
        System.out.println("ini adalah looping dengan for each");
        for(int cetakangka : arrayAngka){
            System.out.println("ini loping pada " + cetakangka);
        }


    }
}
