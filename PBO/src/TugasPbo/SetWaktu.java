/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPbo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SetWaktu {
    public static void main(String []args){
        waktu a = new waktu();
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jam : ");
        a.jam = input.nextInt();
        System.out.print("masukan menit : ");
        a.menit = input.nextInt();
        System.out.print("masukan detik : ");
        a.detik = input.nextInt();
        a.time();
    }
}
