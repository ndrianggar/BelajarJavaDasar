package com.BelajarJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*

        int panjang, lebar;
        panjang = 6;
        lebar = 4;
*/
        do {
            Scanner inputUser = new Scanner(System.in);
            System.out.print("Masukkan panjang = ");
            int inputPanjang = inputUser.nextInt();

            System.out.print("Masukkan lebar = ");
            int inputLebar = inputUser.nextInt();
            gambar(inputLebar, inputPanjang);

            System.out.println("Luas = " + luas(inputLebar,inputPanjang));
            System.out.println("Keliling = " + keliling(inputLebar,inputPanjang));

        } while (true);



    }


    private static int luas( int lebar, int panjang){
        int hasil = lebar*panjang;
        return hasil;
    }

    private static int keliling (int lebar, int panjang){
        int hasil = (lebar + panjang) * 2;
        return hasil;
    }
    public static void gambar(int lebar, int panjang){

        for (int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
