package com.belajarjava;

public class Main {
    public static void main(String[] args) {
        // Latihan nested if

        int a = 0;
        int b = 0;

/*   if (ekspresi 1){
       statement 1;
    }else if(eksepresi 2){
       statement 2;
    }else if(ekspresi 3){
       statement 3;
    }else{
       statement default
    }*/


        if (a == 10) {
            System.out.println("Ini adalah a = 10");
        } else if (b == 20) {
            System.out.println("ini adalah jika a bukan 10 b = 20");
        } else if (a != 10 && b != 20) {
            System.out.println("ini adalah a bukan 10 b bukan 20");
        }else{
            System.out.println("tidak ada nilai");
        }
    }
}