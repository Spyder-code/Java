/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Scanner iinput = new Scanner (System.in);
        Permainan a = new Arcade();
        Permainan s = new Strategi();
        String nama;
        int level;
        System.out.print("nama : ");
        nama = input.nextLine();
        System.out.println("Jenis permainan : ");
        System.out.println("1. Arcade");
        System.out.println("2. Strategi");
        System.out.print("pilih (1-2) : ");
        int c = iinput.nextInt();
        System.out.print("level : ");
        level = iinput.nextInt();
        System.out.println("");
        System.out.println("===================================");
       
  
        switch(c){
            case 1:{
                 a.setNamaPemain(nama);
                 a.setLevelPemain(level);
                System.out.print("Hit : ");
                int hit = iinput.nextInt();
                System.out.print("miss : ");
                int miss = iinput.nextInt();
                a.hitungScore(hit, miss);
                a.jalankan();
                break;
            }
            case 2:{
                 s.setNamaPemain(nama);
                 s.setLevelPemain(level);
                 System.out.print("Hit : ");
                int hit = iinput.nextInt();
                s.hitungScore(hit, 0);
                s.jalankan();
                break;
            }
        }
        
    }
}
