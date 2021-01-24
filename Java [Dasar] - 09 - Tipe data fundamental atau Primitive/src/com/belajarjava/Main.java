package com.belajarjava;

public class Main {

    public static void main(String[] args){

        // byte (satuan)
        byte b =13;
        System.out.println("=========BYTE========");
        System.out.println("nilai byte b = " + b);
        System.out.println("Batas Max = " + Byte.MAX_VALUE); // Byte.MAX_VALUE = helper
        System.out.println("Batas Min = " + Byte.MIN_VALUE);
        System.out.println("Besar byte dalam Bytes = " + Byte.BYTES + " Bytes");
        System.out.println("Besar byte dalam Bit = " + Byte.SIZE + " bit");


        // short (satuan)
        short s =13;
        System.out.println("=========SHORT========");
        System.out.println("nilai short s = " + s);
        System.out.println("Batas Max = " + Short.MAX_VALUE); // Short.MAX_VALUE = helper
        System.out.println("Batas Min = " + Short.MIN_VALUE);
        System.out.println("Besar Short dalam Bytes = " + Short.BYTES + " Bytes");
        System.out.println("Besar Short dalam Bit = " + Short.SIZE + " bit");

        // integer / satuan
        int i =13;
        System.out.println("=========INTEGER========");
        System.out.println("nilai integer i = " + i);
        /*
        kasus jika data integer lebih dari batas maximum maka yang terjadi :
        tercetak nilai : -2147483648. Hasilnya ialah minus disebabkan nilai integer
        tidak dapat melebihi kapasitas
        */
        System.out.println("Batas Max = " + Integer.MAX_VALUE); // Integer.MAX_VALUE = helper
        System.out.println("Batas Min = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer dalam Bytes = " + Integer.BYTES + " Bytes");
        System.out.println("Besar Integer dalam Bit = " + Integer.SIZE + " bit");



        // Long (satuan)
        long l =13L;
        System.out.println("=========LONG========");
        System.out.println("nilai long l = " + l);
        System.out.println("Batas Max = " + Long.MAX_VALUE); // Long.MAX_VALUE = helper
        System.out.println("Batas Min = " + Long.MIN_VALUE);
        System.out.println("Besar long dalam Bytes = " + Long.BYTES + " Bytes");
        System.out.println("Besar long dalam Bit = " + Long.SIZE + " bit");


        // double (koma, bilangan real)
        double d =-15.7d;
        System.out.println("=========DOUBLE========");
        System.out.println("nilai double d = " + d);
        System.out.println("Batas Max = " + Double.MAX_VALUE); // Double.MAX_VALUE = helper
        System.out.println("Batas Min = " + Double.MIN_VALUE);
        System.out.println("Besar Double dalam Bytes = " + Double.BYTES + " Bytes");
        System.out.println("Besar Double dalam Bit = " + Double.SIZE + " bit");

        // float (koma, bilangan real)
        float f =-13.5f;
        System.out.println("=========FLOAT========");
        System.out.println("nilai float i = " + f);
        System.out.println("Batas Max = " + Float.MAX_VALUE); // Float.MAX_VALUE = helper
        System.out.println("Batas Min = " + Float.MIN_VALUE);
        System.out.println("Besar Float dalam Bytes = " + Float.BYTES + " Bytes");
        System.out.println("Besar Float dalam Bit = " + Float.SIZE + " bit");



        // char (karakter) berdasarkan ASCII
        char c ='c';
        System.out.println("=========CHAR========");
        System.out.println("nilai char c = " + c);
        System.out.println("Batas Max = " + Character.MAX_VALUE); // CHARACTER.MAX_VALUE = helper
        System.out.println("Batas Min = " + Character.MIN_VALUE);
        System.out.println("Besar Char dalam Bytes = " + Character.BYTES + " Bytes");
        System.out.println("Besar Char dalam Bit = " + Character.SIZE + " bit");


        // boolean (koma, bilangan real) berdasarkan ASCII
        boolean val =true;
        System.out.println("=========BOOLEAN========");
        System.out.println("nilai boolean VAL = " + val);
        System.out.println("Batas Max = " + Boolean.TRUE); // BOOLEAN.MAX_VALUE = helper
        System.out.println("Batas Min = " + Boolean.FALSE);

    }
}
