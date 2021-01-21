package com.belajarjava;

public class Main {
    public static void main(String[] args){


        // While loop
//
//        while (kondisi){
//            pengulangan
//        }

        int a = 0;
        boolean kondisi = true;

        while(kondisi){
          /* jika a++ ditaruh disni hasilnya

            ini angka ke- 1
            ini angka ke- 2
            ini angka ke- 3
            ini angka ke- 4
            ini angka ke- 5
            ini angka ke- 6
            ini angka ke- 7
            ini angka ke- 8
            ini angka ke- 9
            ini angka ke- 10
          */
//            System.out.println("ini angka ke- " + a);
             /* jika a++; disini hasilnya
              ini angka ke- 0
                ini angka ke- 1
                ini angka ke- 2
                ini angka ke- 3
                ini angka ke- 4
                ini angka ke- 5
                ini angka ke- 6
                ini angka ke- 7
                ini angka ke- 8
                ini angka ke- 9
                */
            System.out.println("ini angka ke- " + a);
            if(a == 10){
                kondisi = false;
            }
            a++; /* jika a++; ditaruh disini hasilnya
            ini angka ke- 0
            ini angka ke- 1
            ini angka ke- 2
            ini angka ke- 3
            ini angka ke- 4
            ini angka ke- 5
            ini angka ke- 6
            ini angka ke- 7
            ini angka ke- 8
            ini angka ke- 9
            ini angka ke- 10
            */

        }

    }
}
