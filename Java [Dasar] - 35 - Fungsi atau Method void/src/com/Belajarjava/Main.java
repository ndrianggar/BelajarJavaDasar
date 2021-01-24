package com.Belajarjava;

public class Main {
    public static void main(String[] args) {

        // tutorial tentang fungsi void
        // secara bahasa void = hampa / kosong (tidak melakukan apapun)

        System.out.println(Simpel());
        FungsiVoid("Aku bisa bikin fungsi loh");

    }

    private static void FungsiVoid(String input){
        System.out.println(input);
    }

    // fungsi atau method dengan mengembalikan
    // sebuah nilai
    // dengan bantuan method return
    private static float Simpel(){
        return 10.0f;
    }
}
