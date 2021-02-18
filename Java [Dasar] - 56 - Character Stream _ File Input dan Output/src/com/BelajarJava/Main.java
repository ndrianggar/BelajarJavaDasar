package com.BelajarJava;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // Membuka file
        // jika byte stream --> FileInputStream
        // jika Character stream --> FileReader
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput= new FileReader("input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("output1.txt");
        FileWriter charFileOutput= new FileWriter("output2.txt");

        FileReader bacaFileWord = new FileReader("artikel.txt");
        FileWriter keluarFileWord = new FileWriter("salin.txt");


        // Membaca file
        int buffer = byteFileInput.read();
        while (buffer!= -1){
            System.out.print((char) buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }

        System.out.println();

        // Membaca file
        buffer = charFileInput.read();
        while (buffer!= -1){
            System.out.print((char) buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }

        System.out.println();

        //Membaca file Word
        int bufferWord = bacaFileWord.read();
        while (bufferWord !=-1){
            System.out.print((char)bufferWord);
            keluarFileWord.write(bufferWord);
            bufferWord = bacaFileWord.read();
        }


        // Menutup file
        byteFileInput.close();
        charFileInput.close();

        byteFileOutput.close();
        charFileOutput.close();

        bacaFileWord.close();
        keluarFileWord.close();

        // kesimpulannya
        // pada aplikasi ini yang dilakukan adalah :
        // 1. pengaksesan file ke file dalam satu disk
        // 2. harusnya pengaksesan dilakukan dari file disimpan di memori agar lebih cepat
    }

}
