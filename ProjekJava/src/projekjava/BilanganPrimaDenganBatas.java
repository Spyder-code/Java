/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekjava;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BilanganPrimaDenganBatas {
    public static void main(String[] args) {
        int c;
        int hasil=0;
        int n;
      Scanner input = new Scanner (System.in);
        System.out.print("masukan batas bilangan : ");
        int b =input.nextInt();
             System.out.println("bilangan prima dari 1-"+b+" adalah :");
        for (int a=2;a<=b;a++){
            n=a;
        for (int i=1;i<=n;i++){
            c = n%i;
            if (c==0){
            hasil++;
        }
        }
        if (hasil == 2){
            System.out.println(n);
            hasil=0;
        }
        else {
            hasil=0;
        }
        }
    
    }
}
