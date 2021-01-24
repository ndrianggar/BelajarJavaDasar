package com.belajarjava;

public class Main {
    public static void main(String[] args){

        // unary = operasi yang dilakukan pada satu variable

        // unary + dan -

        int angka = 1;
        System.out.printf("unary '-' %d menjadi %d\n",angka, -angka);
        System.out.printf("unary '+' %d menjadi %d\n",angka, +angka);

        // unary increment dan decrement
        int angka2 = 5;
        angka2++; // increment
        System.out.println("nilai dengan increment '++' menjadi = " + angka2);

        int angka3 = 5;
        angka3--; // decrement
        System.out.println("nilai dengan increment '--' menjadi = " + angka3);


        // postfix dan prefix
        int a = 5;
        a++;
        System.out.printf("nilai dengan increment  prefix '++' menjadi = %d \n",++a); // ini artinya sebelum ditampilkan sudah ditambahkan

        int b = 5;
        System.out.printf("nilai dengan increment postfix '++' menjadi = %d \n", b++);
        System.out.printf("nilai dengan increment postfix '++' menjadi = %d \n", b);

        // unary boolean dengan ! untuk negasi

        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);

        // kesimpulannya negasi tanda "!" hanya bisa dipakai di boolean sebab nilainya hanya mengandung false / true

    }
}
