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
public class MenghitungHurufVocal {
    public static void main(String []args){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan kata atau kalimat : ");
        String kalimat=input.nextLine();
        int a =0;
        int b =0;
        int c =0;
        int d =0;
        int e =0;
        String kata =kalimat.toLowerCase();
        for (int i=0;i<kata.length();i++){
            if (kata.charAt(i)=='a'){
                a++;
            }
            else if (kata.charAt(i)=='i'){
                b++;
            }
           else if (kata.charAt(i)=='u'){
                c++;
            }
           else if (kata.charAt(i)=='e'){
                d++;
            }
           else if (kata.charAt(i)=='o'){
                e++;
            } 
        }
            int jumlah = a+b+c+d+e;
            System.out.println("Jumlah huruf vocal = "+jumlah);
            System.out.println("jumlah 'A' : "+a);
            System.out.println("jumlah 'I' : "+b);
            System.out.println("jumlah 'U' : "+c);
            System.out.println("jumlah 'E' : "+d);
            System.out.println("jumlah 'O' : "+e);
    }
}
