package com.BelajarJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        // MEMBUAT STRING
        String kataString = "Hello";

        char[] kataChart = {'H','a','l','l','o'};

        // CARA MENAMPILKAN STRING

        // cara print out string
        System.out.println(kataString);
        // cara print out chart
        System.out.println(Arrays.toString(kataChart));

        // CARA MENGAKSES KOMPONEN STRING / CHART

        // chart[]
        System.out.println("Komponen perkata dari chart[] = " + kataChart[4]);

        // string
        System.out.println("Komponen perkata dari string = " + kataString.charAt(4));


        // MENGUBAH KOMPONEN STRING
        kataChart[0] ='C';
        System.out.println(Arrays.toString(kataChart));

        // merubah komponen dari string
        // itu tidak bisa..kenapa? karena di java String sifatnya Immutable
        // kenapa Immutable ? jawabnya karena String di java hanya :
        // 1. untuk membaca input user
        // 2. untuk mengcompare
        // 3. untuk multi trading lebih aman

      //  kataString[0] = 'C' <---------- ini tidak bisa
      //  kataString.charAt(0)='c' <--------- ini tidak bisa
        // kita bisa merubah string dengan cara substring (merubah secara tidak langsung)
        printAddress("kataString ",  kataString);

        kataString = "J" + kataString.substring(1,5);

        System.out.println(kataString);

        printAddress("kataString ",  kataString);


        // String Pool (Method Literal)
        String str_1 = "hello";
        String str_2 = "test";
        String str_3 = "testing";

        printAddress("str_1",str_1);
        printAddress("str_2", str_2);
        printAddress("str_3", str_3);

        str_3 = str_3.substring(0,4);
        printAddress("str_3", str_3);

        String str_4 = "Jello";
        printAddress("str_4", str_4);

        kataString = "Jello";
        printAddress("kataString", kataString);

        // 1.String di java itu Immutable
        // 2.String berada di String Pool  itu akan reusable, memorynya lebih efesien
        // 3. Membuat String dengan method baru, maka dia akan ditaruh di memory lain
        // bukan di string pool

        // Liat lebih dalam

        String a = new String("Hallo");
        printAddress("a", a);



    }

    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " +  data + "\t|| " + "address = " + Integer.toHexString(address));

    }
}
