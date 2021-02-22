package com.BelajarJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;

        Boolean isLanjutkan = true;

        while (isLanjutkan) {
            clearScreen();
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh data buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();

            switch (pilihanUser) {
                case "1":
                    System.out.println("LIST SELURUH DATA BUKU");
                    // tampilkan data
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("CARI DATA BUKU");
                    // cari data
                    cariData();
                    break;
                case "3":
                    System.out.println("TAMBAH DATA BUKU");
                    // tambah data
                    break;
                case "4":
                    System.out.println("UBAH DATA BUKU");
                    // ubah data
                    break;
                case "5":
                    System.out.println("HAPUS DATA BUKU");
                    // hapus data
                    break;
                default:
                    System.err.println("Data tidak ditemukan\n Silahkan pilih menu [1-5] \n\n");
            }

            isLanjutkan = getYesOrNo("Apakah anda ingin melanjutkan");

        }

    }

    private static void cariData(){

        // Mengecek database ada atau tidak
        try {
            File file = new File("database.txt");

        }catch (Exception e){
            System.err.println("Database tidak ditemukan");
            return;
        }

        // Ambil Keywoard dari user
            Scanner terminalInput = new Scanner(System.in);
        System.out.print("Masukkan kata kunci untuk mencari buku: ");
        String cariString = terminalInput.next();
        System.out.println(cariString);

        String[] keywords = cariString.split("\\s");
        System.out.println(keywords[0]);



        // Cek Keywoard di database


    }

    private static void tampilkanData() throws IOException{

        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch (Exception e){
            System.err.println("Database tidak ditemukan");
            System.err.println("silahkan buat database terlebih dahulu");
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis              |\tPenerbit       |\tJudul Buku ");
        System.out.println("---------------------------------------------------------------------------");


        String data = bufferInput.readLine();
//        System.out.println(data); untuk cek database

        int noData =0;

        while (data !=null) {

            StringTokenizer stringToken = new StringTokenizer(data, ",");
            noData++;
            stringToken.nextToken();
            System.out.printf("| %2d ", noData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s ", stringToken.nextToken());
            System.out.printf("|\t%-14s ", stringToken.nextToken());
            System.out.printf("|\t%s", stringToken.nextToken());
            System.out.print("\n");

           data = bufferInput.readLine();

        }
        System.out.println("---------------------------------------------------------------------------");

    }

    private static void clearScreen(){
        try {
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.println("\033\143");
            }
        }catch (Exception e){
            System.err.println("tidak bisa clearScreen");
        }
    }

    private static boolean getYesOrNo(String message){

        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n ");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();

        }

        return pilihanUser.equalsIgnoreCase("y");
    }


    // cara merunning ialah masuk ke folder out/production/namafolderaplikasi

}


// menit 18