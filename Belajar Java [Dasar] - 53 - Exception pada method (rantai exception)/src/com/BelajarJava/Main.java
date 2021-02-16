package com.BelajarJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] arrayData = {0, 1, 2, 3};

        Scanner userInput = new Scanner(System.in);
        System.out.print("data array ke-");
        int indexInput = userInput.nextInt();

        // exception biasa
        System.out.println("Exception biasa");
        try {
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } catch (Exception e) {
            System.err.println(e);
        }

        // exception dalam fungsi
        System.out.println("Exception dalam fungsi");
        int data = ambilDataArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data);


        // exception throws by method
        System.out.println("Exception Throws by method");
        int data2 = 0 ;
        try {
            data2 = ambilData(arrayData, indexInput);
        }catch (Exception e){
            System.err.println(e);
        }
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);

        System.out.println("\n\nini akhir program");

    }

    private static int ambilData(int[] array, int index) throws Exception{
        int hasil = array[index];
        return hasil;
    }
    private static int ambilDataArray(int[] array, int index) {
        int hasil = 0;
        try {
            hasil = array[index];
        } catch (Exception e) {
            System.err.print(e);
        }
        return hasil;
    }
}
