package com.belajarjava;

public class Main {
    public static void main(String[] args){
        // Operator Bitwise --> operator untuk melakukan operasi pada nilai bit

        byte a = 3;
        byte b, c;
        String a_bits, b_bits, c_bits;
        System.out.println("=============awal penjelasan");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); // kelas helper format (untuk menampilkan 8 karakter)
        System.out.printf("%s = %d \n", a_bits, a);
//       a_bits = String.format() // ini maksdnya sama seperti system.out.printf dan tidak dicetak ke konsol, melainkan dicetak ke variable


        // Operator Bitwise SHIFT RIGHT <<
        System.out.println("=======SHIFT LEFT <<");
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); // kelas helper format (untuk menampilkan 8 karakter)
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte) (a << 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ', '0'); // kelas helper format (untuk menampilkan 8 karakter)
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator Bitwise SHIFT RIGHT >>
        System.out.println("=======SHIFT RIGHT >>");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(  ' ',  '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte) (a >> 3);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(  ' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        // Operator Bitwise OR |
        System.out.println("=======BITWISE OR |");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(  ' ',  '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(  ' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(  ' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator Bitwise AND &
        System.out.println("=======BITWISE AND &");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(  ' ',  '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(  ' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(  ' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator Bitwise XOR
        System.out.println("=======BITWISE XOR ^");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(  ' ',  '0');
        System.out.printf("%s = %d \n", a_bits, a);

        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(  ' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(  ' ', '0');
        System.out.printf("%s = %d \n", c_bits, c);

        // Operator Negasi Not/
        System.out.println("=======NEGASI NOT ~");
        a = 12;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte) (~a);
        b_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
        System.out.printf("%s = %d \n", b_bits,b);



    }

}

// kalau bitwise or for byte symbol (|) else for boolean (||)