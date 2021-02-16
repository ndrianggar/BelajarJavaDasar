package com.BelajarJava;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String kalimat = "Saya suka baca Buku";

        // mengambil komponen dari string
        System.out.println(kalimat.charAt(10));

        // Substring
        String kata = kalimat.substring(10,15);
        System.out.println(kata);

        // concatenation (concat)
        String kalimat2 = kata + "Quran";
        System.out.println(kalimat2);

        kata = kata + "Tafsir";
        System.out.println(kata);

        //concat dengan non string
        int jumlah = 20;
        String kalimat3 = kata + " " + jumlah + " Kali"; // casting
        System.out.println(kalimat3);

        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());

        //replace
        System.out.println(kalimat.replace("buku", "kitab"));

        // equality (persamaan)
        String kataInput = "test"; // ini ada di string pool
//        String kataInputt = new String("test"); // ini bukan string literal dan tidak ada di string pool
        String kataTest = "test"; // ini ada di string pool

        // compare
        String quran_1 = "Mushaf Madinah";
        String quran_2 = "Iqra ebta"; // akan menghitung alphabet dari i ke m = 4


        System.out.println(quran_1.compareTo(quran_2));


        System.out.println("persamaan pada lokas string pool");
        if(kataInput == kataTest){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }

        System.out.println("persamaan pada lokas string pool");
        Scanner userInput = new Scanner(System.in);
        kataInput = userInput.next();
        System.out.println("ini adalah input user: " + kataInput);

        // untuk mengecek sebuah string dengan string yg lain bisa
        // bisa menggunakan equals

        if(kataInput.equals(kataTest)){
            System.out.println("sama");
        }else{
            System.out.println("tidak sama");
        }
    }
}
