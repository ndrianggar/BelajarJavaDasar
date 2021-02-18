package com.BelajarJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//
//        Scanner inputUser = new Scanner(System.in);
//
//        String input = inputUser.next();
//        System.out.println(input);
//
//        input = inputUser.next();
//        System.out.println("input kedua " + input);

        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        Scanner scanner = new Scanner(bufferedReader);

        // ini untuk mengecek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext()); // true

        // untuk membaca kata, dengan pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); // false


        // menggunakan delimeter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");

//        System.out.println(scanner.hasNext()); ini untuk mengecek benar atau tidak code

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        // Menggunakan String tokenizer

        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(data, ",");

        while (stringToken.hasMoreTokens()){
            System.out.println(stringToken.nextToken());
        }

        data = bufferedReader.readLine();
        System.out.println(data);

        stringToken = new StringTokenizer(data,",");

            while (stringToken.hasMoreTokens()) {
                System.out.println(stringToken.nextToken());
        }


    }
}
