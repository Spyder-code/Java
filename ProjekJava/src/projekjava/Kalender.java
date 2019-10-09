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
public class Kalender {
    public static void main (String []args){
        int hari;
int bulan;
int tahun;
System.out.print("masukan bulan dalam angka : ");
Scanner input = new Scanner(System.in);
bulan = input.nextInt();
System.out.print("masukan tahun : ");
tahun = input.nextInt();
switch (bulan){
case 1:
    System.out.print("bulan januari tahun "+tahun+ " adalah 31 hari");
    break;
case 3:
    System.out.print("bulan maret tahun " +tahun+ " adalah 31 hari");
    break;
case 5:
    System.out.print("bulan mei tahun "+tahun+ " adalah 31 hari");
    break;
case 7:
    System.out.print("bulan july tahun "+tahun+ " adalah 31 hari");
    break;
case 8:
    System.out.print("bulan agustus tahun "+tahun+ " adalah 31 hari");
    break;
case 10:
    System.out.print("bulan oktober tahun "+tahun+ " adalah 31 hari");
    break;
case 12:
    System.out.print("bulan desember tahun "+tahun+ " adalah 31 hari");
    break;
case 4:
    System.out.print("bulan april tahun "+tahun+" adalah 30 hari");
    break;
case 6:
    System.out.print("bulan juni tahun "+tahun+" adalah 30 hari");
    break;
case 9:
    System.out.print("bulan september tahun "+tahun+" adalah 30 hari");
    break;
case 11:
    System.out.print("bulan november tahun "+tahun+" adalah 30 hari");
    break;
case 2:
    System.out.print("bulan februari");
if ((tahun % 4 == 0) && !(tahun % 100 == 0))
System.out.print(" tahun "+ tahun +" adalah 29 hari ");
else
System.out.print(" tahun "+tahun+" adalah 28 hari ");
break;
default:
System.out.println(" anda memasukkan bulan yang salah");
break;
}
    }
}
