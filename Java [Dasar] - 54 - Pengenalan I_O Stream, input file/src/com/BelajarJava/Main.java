package com.BelajarJava;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       /* try {
            FileInputStream filInput = new FileInputStream("input.txt");
        }catch (Exception e){
            System.err.println(e);
        }*/

        FileInputStream fileInput = new FileInputStream("file.txt");

        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
        System.out.println((char)fileInput.read());
    }
}


// kesimpulan
// jika ingin menjalankan aplikasi dari main maka file.txtnya harus selefel dengan package src
// jika ingin menjalankan aplikasi dari cmd productuion maka harus selevel dengan com