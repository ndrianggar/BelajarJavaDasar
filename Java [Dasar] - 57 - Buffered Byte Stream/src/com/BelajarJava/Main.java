package com.BelajarJava;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        long waktuStart, waktuFinish;

        // Membaca dari file
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        //Menghitung waktu
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        long bufferd1 = waktuFinish-waktuStart;
        System.out.println("waktu = " + (bufferd1));
        byteInput.close();

        // Membaca dari Memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);


        // Membatasi memory
        bufferedInput.mark(200);

        //Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        long bufferd2 = waktuFinish-waktuStart;
        System.out.println("waktu = " + (bufferd2));

        //Menghitung selisih waktu
//        long hasilBufferd = bufferd2-bufferd1;
//        try{
//        System.out.printf("%d - %d = %+d",bufferd1,bufferd2,hasilBufferd);
//        }catch (Exception e){
//            System.err.println("format tidak sesuai");
//        }

        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String stringData = new String(data);
        System.out.println(stringData);
        bufferedInput.close();



        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOut = new BufferedOutputStream(byteOutput);

        // write
        bufferedOut.write(data, 0,data.length);
        bufferedOut.flush();
        byteOutput.close();
        bufferedOut.close();


    }
}
