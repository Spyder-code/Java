package almi;

import java.util.*;

public class game_1 {

    public static void main(String[] args) {

        Random angka = new Random();
        int f = angka.nextInt(100);
        int a = 6;
        for (int i = 1; i <= a; i++) {
            System.out.println("masukkan angka : ");
            Scanner masuk = new Scanner(System.in);
            int b = masuk.nextInt();
            if (i == a) {
                System.out.println("you loose");
                System.out.println("Jawabannya adalah " + f);

            } else if (b == f) {
                System.out.println("Selamat jawaban anda benar");
                System.out.println("anda telah menjawab " + i + " kali");
                i = a;
            } else if (b > f) {
                System.out.println("jawaban anda terlalu besar");
                System.out.println("anda telah menjawab " + i + " kali");
            } else {
                System.out.println("jawaban anda terlalu kecil");
                System.out.println("anda telah menjawab " + i + " kali");
            }
        }
    }
}
