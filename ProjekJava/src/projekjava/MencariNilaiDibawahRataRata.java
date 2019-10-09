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
public class MencariNilaiDibawahRataRata {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan banyaknya angka : ");
        int n = input.nextInt();
        int data[] = new int[n];
        int nilai =0;
        for (int i = 0; i < n; i++) {
            System.out.print("angka ke " + (i + 1) + " : ");
            data[i] = input.nextInt();
             nilai = nilai+data[i];
        }
        int rata2 = nilai/n;
        for (int i=0;i<n;i++){
       if (data[i]<rata2){
           System.out.println("angka yang di bawah rata-rata adalah angka ke-"+(i+1)+" dengan jumlah "+data[i]);
       }
    }
    }
    }

