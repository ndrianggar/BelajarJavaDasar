package com.belajarjava;

public class Main {
    public static void main(String[] args){

        // program untuk konversi data

        int nilaiInt = 255; //450; // 32 Bit
        System.out.println("ini nilai int =" + nilaiInt);

        // memperluas rentang nilai int ke type data yang lebih besar
        long nilaiLong = nilaiInt;
        System.out.println("ini nilai Long = " + nilaiLong);
        // memperkecil rentang nilai int ke type data yang lebih kecil

        byte nilaiByte = (byte) nilaiInt;
        System.out.println("ini nilai  Byte =" + nilaiByte);
        System.out.println("nilai max dari byte = " + Byte.MAX_VALUE);
        System.out.println("nilai max dari byte = " + Byte.MIN_VALUE);

        // casting pembagian

        int a = 10;
        int b = 4;
        // float b = 4;


        float c = (float)a / b;
        System.out.printf("%d / %d = %f \n",a,b,c);
        // hasilnya 10 / 4 = 2.000000. hasil tidak sesuai maka harus dilakukan perubahan data :
        /*
            1.Bisa dengan merubah salah satu type data variable kepada type data yang lebih tinggi (float)
            2.Bisa dengan merubah type data pada variable yang terdapat operator matematik : (float c = (float) a/b)

         */

    }
}

/*

==============Hasil======================
"C:\Program Files\Java\jdk1.8.0_251\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.2\lib\idea_rt.jar=50492:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.1.2\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_251\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_251\jre\lib\rt.jar;C:\learn java\youtube-praktek java\Java [Dasar] - 11 - Konversi tipe data numeric\out\production\Java [Dasar] - 11 - Konversi tipe data numeric" com.belajarjava.Main
ini nilai int =255
ini nilai Long = 255
ini nilai  Byte =-1
nilai max dari byte = 127
nilai max dari byte = -128

Process finished with exit code 0

Kesimpulan :
            1. Memperkecil rentang ke type data yang lebih kecil menhilangkan nilai asli
 */