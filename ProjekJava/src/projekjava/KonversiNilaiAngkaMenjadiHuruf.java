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
public class KonversiNilaiAngkaMenjadiHuruf {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.print("masukan nilai : ");
        int n = input.nextInt();
        if (n<=100&&n>=90){
            System.out.println("Grade 'A'");
        }
        else if (n<=89&&n>=80){
            System.out.println("Grade 'B'");
        }
        else if (n<=79&&n>=70){
            System.out.println("Grade 'C'");
        }
        else if (n<=69){
            System.out.println("Grade 'D'");
        }
        else {
            System.out.println("Nilai yang anda masukan tidak sesuai");
        }
    }
}
