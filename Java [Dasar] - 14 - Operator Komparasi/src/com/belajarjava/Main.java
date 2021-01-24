package com.belajarjava;

public class Main {
    public static void main(String[] args) {

        // operator comparasi..akan menghasilkan nilai dalam bentuk boolean

        int cth1, cth2;
        boolean hasilkomparasi;
        // pengantar penjelasan
        cth1 = 10;
        cth2 = 10;
        hasilkomparasi = (cth1 == cth2);
        System.out.printf("%d apakah sama dengan %d ? %s \n", cth1, cth2, hasilkomparasi);



        float cth3, cth4;
        cth3 = 10.0f;
        cth4 = 9.0f;
        hasilkomparasi = (cth3 == cth4);
        System.out.printf("%f apakah sama dengan %f ? %s \n", cth3, cth4, hasilkomparasi);
        System.out.println("===========Contoh============ \n");


        // dibuat sederhana dengan contoh yang rapih penulisan

        // Operator equal  atau persamaan

        System.out.println("---------PERSAMAAN---------");
        int a, b;
        a = 19;
        b = 19;
        hasilkomparasi = (a == b);
        System.out.printf("%d == %d ---> %s \n",a,b, hasilkomparasi);
        a = 19;
        b = 19;
        hasilkomparasi = (a == b);
        System.out.printf("%d == %d ---> %s \n",a,b, hasilkomparasi);

        // Operator not equal  atau pertidaksamaan

        System.out.println("---------PERTIDAKSAMAAN---------");
        a = 19;
        b = 17;
        hasilkomparasi = (a != b);
        System.out.printf("%d != %d ---> %s \n",a,b, hasilkomparasi);

        a = 19;
        b = 19;
        hasilkomparasi = (a != b);
        System.out.printf("%d != %d ---> %s \n",a,b, hasilkomparasi);

        // Operator less  atau kurang dari

        System.out.println("---------KURANG DARI SAMA DENGAN---------");
        a = 19;
        b = 17;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d ---> %s \n",a,b, hasilkomparasi);

        a = 18;
        b = 20;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d ---> %s \n",a,b, hasilkomparasi);


        // Operator greater than  atau LEBIH dari

        System.out.println("---------LEBIH dari---------");
        a = 19;
        b = 17;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d ---> %s \n",a,b, hasilkomparasi);

        a = 18;
        b = 20;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d ---> %s \n",a,b, hasilkomparasi);


        // Operator less than equal  atau kurang dari sama dengan

        System.out.println("---------KURANG DARI SAMA DENGAN---------");
        a = 19;
        b = 23;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b, hasilkomparasi);

        a = 23;
        b = 23;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b, hasilkomparasi);

        a = 18;
        b = 20;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d ---> %s \n",a,b, hasilkomparasi);


        // Operator greater than equal  atau LEBIH dari sama dengan

        System.out.println("---------KURANG DARI SAMA DENGAN---------");
        a = 24;
        b = 19;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b, hasilkomparasi);

        a = 24;
        b = 24;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b, hasilkomparasi);

        a = 18;
        b = 20;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d ---> %s \n",a,b, hasilkomparasi);


    }
}
