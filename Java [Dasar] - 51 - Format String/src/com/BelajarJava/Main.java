package com.BelajarJava;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String nama = "jodi";
        int umur = 17;

        // output nama saya adalah udin, umur saya adalah 17

        System.out.println("nama saya adalah " + nama + ", umur saya adalah " + umur);

        System.out.printf("umur saya adalah %s, umur saya adalah %d",nama,umur);

        // % = tempat menampung format
        // s = tempat variable string
        // d = tempat variable int
        //https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html

        //conversion : f = floating point, d = integer, c = character, s = string, b= boolean
        // struktur format = %[argumen_index$] [flags] [width] [.precession] conversion
        // referensi :

        //[argumen_index$]
        System.out.println("\n[argumen_index$]");

        // jodi, wahai jodi, kemana saja kamu jodi
        System.out.printf("%1$s, wahai %1$s, kemana saja kamu %1$s \n",nama);

        //umur jodi berapa?, jodi menjawab: 17, wah masih muda ya umurnya 17?
        System.out.printf("umur %1$s berapa?, %1$s menjawab: %2$d, wah masih muda ya umurnya %2$d", nama,umur);


        //[flags]
        System.out.println("[flags]");
        int int1 = 5;
        int int2 = 8;
        int hasil = int1 - int2;
        System.out.printf("\n %d + %d = %+d",int1,int2, hasil);

        //[width]
        System.out.println("INTEGER");
        int int3 =1000;
        System.out.printf("%d\n",int3);
        System.out.printf("%5d\n",int3);
        System.out.printf("%-5d\n",int3); // flags = "-", artinya rata kiri
        System.out.printf("%+5d\n",int3); // flags = "+", artinya tambah flag
        System.out.printf("%+-5d",int3); // flags = "+-", artinya bisa digabungkan
        System.out.printf("\n%10d", int3);
        System.out.printf("\n% 10d", int3);
        System.out.printf("\n%010d", int3); // flags = "0", kita menambahkan leading "0" di depan
        System.out.printf("\n%+010d", int3);
        System.out.printf("\n%,10d", int3);
        int int4 = 1000000000;
        System.out.printf("\n%-,10d", int4);

        System.out.println("\nFLOATING POINT");
        float float1 = 1.543f;
        System.out.printf("%f",float1);
        System.out.printf("\n%+9f\n",float1);

        //precision
        System.out.println("[.precession]");
        float float2 = 15.678f;
        System.out.printf("%f\n",float2);
        System.out.printf("%.1f\n",float2);
        System.out.printf("%.2f\n",float2);
        System.out.printf("%.3f\n",float2);
        System.out.printf("%08.2f\n",float2); // gabungkan dengan width

        // contoh
        String nama2 = "ucup";
        float IPK = 3.7853234234f;

        System.out.printf("\nIPK %1$s berapa?,\n%1$s: saya dapat %2$+5.2f",nama2,IPK);
        System.out.println();
        // Kesimpulan

        String info_biasa = "nama: " + nama2 + ", IPK = " + IPK;
        System.out.println("String biasa --> " + info_biasa);

        String info_format =String.format("nama: %s, IPK = %2$+5.2f",nama2,IPK);
        System.out.println("String format --> " + info_format);

        StringBuilder builder_info = new StringBuilder();
        Formatter formatBuilder = new Formatter(builder_info);

        formatBuilder.format("nama: %s, IPK = %2$+2.2f", nama2,IPK);
        System.out.println("Format Builder --> " + formatBuilder);

    }
}
