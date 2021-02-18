package com.BelajarJava;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //Membaca file
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        bufferedReader.mark(200);

        //Membaca ke string
        String dataString =bufferedReader.readLine();
        System.out.println(dataString);

        //Membaca ke char
        bufferedReader.reset();
        char[] dataChar = new char[29];
        bufferedReader.read(dataChar,0,29);
        System.out.println(Arrays.toString(dataChar));

        //Membaca baris
        bufferedReader.reset();
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        //Menulis file
        FileWriter fileOutput = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileOutput);

        bufferedReader.reset();
        String baris1 = bufferedReader.readLine();

        bufferedWriter.write(baris1,0,baris1.length());
        bufferedWriter.flush();

        // menambah new line, enter;
        bufferedWriter.newLine();

        String baris2 = bufferedReader.readLine();
        bufferedWriter.write(baris2,0,baris2.length());
        bufferedWriter.flush();

        fileInput.close();
        fileOutput.close();
        bufferedReader.close();
        bufferedWriter.close();


    }
}
