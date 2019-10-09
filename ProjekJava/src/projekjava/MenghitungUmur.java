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
public class MenghitungUmur {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.print("masukan tanggal sekarang : ");
        int a=input.nextInt();
        System.out.print("masukan bulan sekarang (1-12): ");
        int b=input.nextInt();
        System.out.print("masukan tahun sekarang : ");
        int c=input.nextInt();
        System.out.println("========================");
        System.out.print("masukan tanggal lahir : ");
        int h=input.nextInt();
        System.out.print("masukan bulan lahir (1-12): ");
        int i=input.nextInt();
        System.out.print("masukan tahun lahir : ");
        int j=input.nextInt();
        System.out.println("========================");
        int tahun =365;
        int bulan =30;
        int hari =1;
        
        int th = c*tahun;
        int bln = b*bulan;
        int tgl = a*hari;
        int hasil =th+bln+tgl;
        
        int th1 = j*tahun;
        int bln1 = i*bulan;
        int tgl1 = h*hari;
        int hasil1 =th1+bln1+tgl1;
        
        int total = hasil-hasil1;
        int tahunn = total/tahun;
        int sisa = total%tahun;
        int bulann = sisa/bulan;
        int sisa1 = sisa%bulan;
        int harii = sisa1;
        
        System.out.println("Tanggal lahir : "+h+"-"+i+"-"+j);
        System.out.println("Tanggal sekarang : "+a+"-"+b+"-"+c);
        System.out.println("========================");
        if (total%tahun==0){
            System.out.println("Maka usia anda "+tahunn+" tahun");
        }
        else if(sisa%bulan==0){
            System.out.println("Maka usia anda "+tahunn+" tahun "+bulann+" bulan");
        }
        else {
            System.out.println("Maka usia anda "+tahunn+" tahun "+bulann+" bulan "+harii+" hari");
        }
    }
}
