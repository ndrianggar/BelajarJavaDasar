package com.BelajarJava;

public class Main {
    public static void main(String[] args){

//        for(inisiasi; kondisi; stepnilai){
//
//        }
        int nilai;

        System.out.println("For looping pertama");
        for (nilai = 0; nilai<=10; nilai++){
            System.out.println("For ke- " + nilai);
        }


        System.out.println("For looping kedua");
        for (nilai = 0; nilai<10; nilai++){
            System.out.println("For ke- " + nilai);
        }


        System.out.println("For looping ketiga");
        for (nilai = 10; nilai>5; nilai--){
            System.out.println("For ke- " + nilai);
        }

        System.out.println("For looping keempat");
        nilai = 0; // inisiasi bisa diluar
        for (; nilai<=10; nilai++){
            System.out.println("For ke- " + nilai);
        }

//        System.out.println("For looping kelima");
//        nilai = 0; // inisiasi bisa diluar
//        nilai++;  // tanpa set nilai
//        for (; nilai<=10; ){
//            System.out.println("For ke- " + nilai);
//        }

    }
}
