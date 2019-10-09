/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversihari;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class tes {
 public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan Angka : ");
        int a=input.nextInt();
        int hari =86400;
        int jam =3600;
        int menit =60;
        int detik =1;
        
        int harii =a/hari;
        int jamm =(a-(hari*harii))/jam;
        int menitt = (a-((hari*harii)+(jam*jamm)))/menit;
        int detikk = (a-((hari*harii)+(jam*jamm)+(menit*menitt)))/detik;
        
        if (a%hari==0){
            System.out.println(a+" Setara dengan "+harii+" hari");
        }
        else if(menitt==0){
            System.out.println(a+" Setara dengan "+harii+" hari "+jamm+" jam");
        }
        else if (detik==0){
             System.out.println(a+" Setara dengan "+harii+" hari "+jamm+" jam "+menitt+" menit");
        }
        else {
              System.out.println(a+" Setara dengan "+harii+" hari "+jamm+" jam "+menitt+" menit "+detikk+" detik");
        }
    }
}
