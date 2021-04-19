package com.BelajarJavaOOP;


// membuat class sebagai template 

// (keywoard) class    || (identifier) NamaKelas      

class Kamus{
    String namaKamus;
    String isbn;
    int tahun;
    String pengarang;
    String penerbit;
    
}

// class Quran{
//     String namaQuran;
//     String isbn;
//     String cetakan;
//     String penerbit;
//     String jenisMushaf;
    
// }

public class Main{

    public static void main(String[] args) throws Exception{

        // instansiasi / membuat objek

        Kamus kamus1 = new Kamus();
        kamus1.namaKamus = "Munawir";
        kamus1.isbn = "23424034";
        kamus1.pengarang = "KH Mahmud Tohan";
        kamus1.penerbit = "Pustaka Sunnah";
        kamus1.tahun = 2019;
        
        System.out.println("\n");
        System.out.println("1 Class 2 Objek ================");
        
        System.out.println("\n");
        System.out.println("========== Objek Pertama ==========");
        System.out.println(kamus1.namaKamus);
        System.out.println(kamus1.isbn);
        System.out.println(kamus1.pengarang);
        System.out.println(kamus1.penerbit);
        System.out.println(kamus1.tahun);
      

        System.out.println("\n");

        Kamus kamus2 = new Kamus();
        kamus2.namaKamus = "Muhith";
        kamus2.isbn = "23424034";
        kamus2.pengarang = "Syaikh Qomuus";
        kamus2.penerbit = "Dar";
        kamus2.tahun = 1999;
        
        System.out.println("========== Objek Kedua ==========");
        System.out.println(kamus2.namaKamus);
        System.out.println(kamus2.isbn);
        System.out.println(kamus2.pengarang);
        System.out.println(kamus2.penerbit);
        System.out.println(kamus2.tahun);
       
        // Quran quran = new Quran();
        // quran.namaQuran = "Munawir";
        // quran.isbn = "23424034";
        // quran.cetakan = "KH Mahmud Tohan";
        // quran.penerbit = "Pustaka Sunnah";
        // quran.jenisMushaf = "Madinah";
        
        // System.out.println(quran.namaQuran);
        // System.out.println(quran.isbn);
        // System.out.println(quran.cetakan);
        // System.out.println(quran.penerbit);
        // System.out.println(quran.jenisMushaf);
        

    }

}