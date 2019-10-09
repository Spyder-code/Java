/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        Scanner iinput = new Scanner (System.in);
        DoraMini dora = new DoraMini();
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Pemilik : ");
        String pemilik = input.nextLine();
        System.out.print("Tahun : ");
         int tahun = iinput.nextInt();
        System.out.println("");
        dora.setNama(nama);
        dora.setPemilik(pemilik);
        dora.setTahun(tahun);
         System.out.println("Data :");
        dora.displayData();
        System.out.println("");
        System.out.println("Pilih fungsi Dora Mini : ");
        System.out.println("1. Say Dora");
        System.out.println("2. Display kantong ajaib");
        System.out.print("pilih (1-2) : ");
        int c = iinput.nextInt();
        System.out.println("");
       
        switch(c){
            case 1:{
                dora.sayDora();
                break;
            }
            case 2:{
                dora.displayKantongAjaib();
                break;
            }
            default :
                System.out.println("fungsi tidak ditemukan");
            
        }
        
    }
}
