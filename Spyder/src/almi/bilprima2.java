package almi;

import java.util.*;

public class bilprima2 {

    public static void main (String args[]) {
        int min;
        int max;
        int c = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas min : ");
        min = input.nextInt();
        System.out.print("Masukkan batas max : ");
        max = input.nextInt();
        System.out.println("");
        System.out.println("Bilangan Prima : ");
        for (int a = min; a <= max; a++) {
            for (int b = min; b <= max; b++) {
                if (b < 10) {
                    c = (a * 10) + b;
                } else if (b >= 10 & b < 100) {
                    c = (a * 100) + b;
                } else if (b >= 100 & b < 1000) {
                    c = (a * 1000) + b;
                } else if (b >= 1000 & b < 10000) {
                    c = (a * 10000) + b;
                }

                int i = 2;
                boolean cek = true;
                if (cek) {
                    while (cek) {
                        if (c % i == 0) {
                            cek = false;
                        } else {
                            i++;
                        }
                    }
                    if (i == c) {                    
                     
                        System.out.println(c);
                    }
                }
                
            }
        }
      
    }

   
}
