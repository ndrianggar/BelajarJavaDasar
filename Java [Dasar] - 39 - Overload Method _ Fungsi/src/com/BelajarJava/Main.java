package com.BelajarJava;


/*
       Overload Method ialah membuat fungsi berulang dengan type data yang dinginnkan
       formatnya : accesModifier static(instanclass) typeData
       public static double tambah/kali/bagi (Tipe data Paramater1 & 2){
                   
       }
       


*/
public class Main {
    public static void main(String[] args){

        int hasil;
        hasil = tambah(4,5);

        float hasilFloat;
        hasilFloat = tambah(11.5f,4.9f);


        double hasilDouble;
        hasilDouble = tambah(34.33d,43.22d);

        printAngka(hasil);
        printAngka(hasilFloat);
        printAngka(hasilDouble);


        printAngka(1);
        printAngka(4.2f);
        printAngka(56.9d);
        }


    private static double tambah(double angkaDouble1, double angkaDouble2){
        return angkaDouble1 + angkaDouble2;
    }

    private static int tambah(int angkaInt1, int angkaInt2){
       return angkaInt1 + angkaInt2;
    }

    private static float tambah(float angkaFloat1, float angkaFloat2){
        return angkaFloat1 + angkaFloat2;
    }

    private static void printAngka(int angkaInteger){
        System.out.println("Angka ini adalah Integer dengan nilai = " + angkaInteger);
    }

    private static void printAngka(float angkaFloat){
        System.out.println("Angka ini adalah Float dengan nilai = " + angkaFloat);
    }


    private static void printAngka(double angkaDouble) {
        System.out.println("Angka ini adalah Double dengan nilai = " + angkaDouble);
    }
}
