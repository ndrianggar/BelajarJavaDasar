package com.BelajarJava;

public class Belajar_Rekursif_Array {

    static String mahasiswa [] = {"Heru", "Boyke", "Tomi" , "Fahri", "Bagus", "Bayu", "Dian"};

    public static void main(String[] args){
    getMahasiswa(1);

        System.out.println(mahasiswa.length);

    }

    private static void getMahasiswa(int absensi){
        if(absensi < mahasiswa.length){
            System.out.println("Absensi no-"+absensi+ " Bernama: "+mahasiswa[absensi]);
            if(absensi == 4){
                System.out.println("siapa no urut 4 - " + "urutan 4 adalah : " + mahasiswa[absensi]);

            }
            getMahasiswa(++absensi);
        }
    }

}
