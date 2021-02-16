package com.BelajarJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {0,1,2,3};

        Scanner inputUser = new Scanner(System.in);
        System.out.print("nilai array ke:");
        int index = inputUser.nextInt();

        // Exception Handling (try, catch, finally)
        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println();
        // Runtime error jika file tidak ada
        FileInputStream fileInput = null;
        /*FileInputStream  fileInput = new FileInputStream("file.txt");*/ // karena file tidak ada maka akan ada exception
        System.out.print("Handling file not found");
        try {
            fileInput = new FileInputStream("file.txt");
        }catch (IOException e){
            System.err.println(e);
        }
        System.out.println();

        // menggabungkan dua exception
        System.out.println("Menggabungkan 2 buah exception");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("file.txt");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yang dimasukkan tidak sesuai dengan jumlah array");
        }catch (IOException e){
            System.err.println("file tidak ditemukan");
        }

        //finally
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("index yang dimasukkan tidak sesuai dengan jumlah array");
        }finally {
            System.out.println("finally");
        }

        System.out.println("\nini akhir dari program");
    }
}
