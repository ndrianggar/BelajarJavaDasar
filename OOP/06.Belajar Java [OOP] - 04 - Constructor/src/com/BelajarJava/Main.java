package com.BelajarJava;

// kelas tanpa constructor / polos
class tanpaConstructor{
    String dataString;
    int dataInteger;
}

// kelas dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    //  constructor adalah sebuah fungsi yang akan dipanggil pertama x
    // buat constructor harus sama dengan nama kelas
    // constructor akan dicetak ketika pertama kali objek dibuat
    // bisa diberikan parameter dan tidak ada batasan penulisan dan jumlah parameter
    // contoh :
    // Mahasiswa(){
    //     System.err.println("ini ");
    // }

    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
        
    }
}

public class Main{

    public static void main(String[] args)throws Exception {
        
        // ini adalah pembuatan objek
        Mahasiswa mahasiswa1 = new Mahasiswa("Maman", "2234234", "Biologi");
        Mahasiswa mahasiswa2 = new Mahasiswa("Isa", "2234234", "B.Arab");

        // bisa dicetak di main
        // akan tetapi kekurangannya akan repeat penulisan
        // lebih baik dibuat di constructor
        // System.out.println(mahasiswa.nama);

    }
}