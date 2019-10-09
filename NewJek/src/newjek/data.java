/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjek;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class data {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        NewJek cus = new NewJek();
        cus.nilai=780;
        System.out.print("Masukan posisi : ");
        cus.posisi=input.nextLine();
        System.out.print("Masukan tujuan : ");
        cus.tujuan=input.nextLine();
        System.out.print("Masukan jarak (km) : ");
        cus.jarak=input.nextInt();
        cus.pembayaran();
        
    }
}
