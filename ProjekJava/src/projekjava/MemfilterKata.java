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
public class MemfilterKata {
    public static void main (String[]args){
        Scanner kalimat = new Scanner (System.in);
        Scanner kata = new Scanner (System.in);
        System.out.println("Kalimat : ");
        String str=kalimat.nextLine();
        System.out.println("Kata yang di cari dan dihapus : ");
        String str1=kata.nextLine();
        int jumlah =0;
        int index = str.indexOf(str1);//untuk mencari kata yang dicari pada kalimat
        while (index>=0){ 
            ++jumlah; //
            index+=str1.length();
            index=str.indexOf(str1, index);            
        }
        str = str.replace(str1, "");
        System.out.println(str);
        System.out.println("kata "+str1+" Sebanyak "+jumlah);
    }
}
