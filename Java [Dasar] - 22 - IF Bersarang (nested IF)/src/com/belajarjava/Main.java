package com.belajarjava;

public class Main {
    public static void main(String[] args){

        // Nested if (If bersarang)
        int a = 2;
        int b = 10;

        /*if(ekspresi 1){
            if(ekspresi 2){
                statment 2;
            }else{
                statement default;
            }
        }else{
            statement default;
        }*/
        System.out.println("ini adalah awal program");
        if(a == 5){

            if(b == 10){

                System.out.println("ini adalah a = 5 dan b = 10");

                }else{

                    System.out.println("ini adalah a = 5 dan b bukan 10 ");;
                }
        }else{
            System.out.println("ini adalah a dan b salah atau kondisi ata tidak terpenuhi");
        }
        System.out.println("ini adalah akhir program");
    }
}
