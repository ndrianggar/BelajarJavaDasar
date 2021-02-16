package com.BelajarJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {

        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

        //membuka file
        fileInput = new FileInputStream("file.txt");
//
//            while (fileInput.read() != -1) {
//                System.out.println((char) fileInput.read());
//            }
        /**
         * outputnya
         * n
         *
         * d
         * l
         * h
         * c
         * n
         * o
         *
         * a
         * i
         * b
         * t
         *
         * t
         * a
         * ￿
         * sebab kita melakukan pembacaan 2x
         */

        // Membaca File
        int data = fileInput.read();
        while (data != -1){
            System.out.print((char)data);
            data = fileInput.read();
        }
        // Menutup File
        fileInput.close();

        // Salah satu contoh skenario program pembukaan file

        try {
            //Membuka file
            fileInput = new FileInputStream("input.txt");
            fileOutput = new FileOutputStream("output.txt");
        }finally {


                // Membaca file
                int buffer = fileInput.read();
                while (buffer !=-1){
                    fileOutput.write(buffer);
                    buffer = fileInput.read();
                }

            if (fileInput != null) {
                    fileInput.close();
                } else if (fileOutput != null) {
                    fileOutput.close();
                }
            }

            try(
                    FileInputStream in = new FileInputStream("input.txt");
                    FileOutputStream out = new FileOutputStream("output2.txt")
                ){

                // apakah bisa membuat output file di try yg tanpa close?
                // jawabnya bisa

                //Membaca File
                int data2 = in.read();
                while(data2 !=-1){
                    out.write((char) data2);
                    System.out.print((char)data2);
                    data2 = in.read();
                }
            }
    }
}
