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
public class Menabung {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.print("masukkan target uang yang ingin di tabung :Rp. ");
        double tujuan = input.nextInt();
        System.out.print("masukan uang yang ingin di tabung :RP. ");
        double modal = input.nextInt();
        double hasil =0 ;
        int n =0;
        double i;
        for ( i=1;i<=tujuan;i++){
            hasil =hasil+modal;
            n++;
            if(hasil>=tujuan){
                i=tujuan;
            }
        }
        System.out.println("dengan modal Rp."+modal+" akan memenuhi target tabungan selama "+n+" kali menabung");
    }
}
