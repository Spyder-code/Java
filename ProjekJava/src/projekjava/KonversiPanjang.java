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
public class KonversiPanjang {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("1.km  2.hm  3.dam  4.m  5.dm  6.cm  7.mm");
        System.out.print("pilih satuan yang akan di konversi (pilih angka 1-7): ");
         int panjang=input.nextInt();
        System.out.print("masukan nilai : ");
        double nilai=input.nextDouble();
             switch (panjang){
                 case 1:
                    km(nilai);
                     break;
                 case 2:
                 hm(nilai);
                   break;
                     case 3:
                 dam(nilai);
                   break;
                         case 4:
                 m(nilai);
                   break;
                             case 5:
                 dm(nilai);
                   break;
                                 case 6:
                 cm(nilai);
                   break;
                                     case 7:
                 mm(nilai);
                   break;
             }
             }
                public static void km(double nilai){
                     double km =1*nilai;
                     double hm =10*nilai;
                     double dam =100*nilai;
                     double m = 1000*nilai;
                     double dm =10000*nilai;
                     double cm =100000*nilai;
                     double mm=1000000*nilai;
                     System.out.println(nilai+" km = ");
                     System.out.println(hm+" hm");
                     System.out.println(dam+" dam");
                     System.out.println(m+" m");
                     System.out.println(dm+" dm");
                     System.out.println(cm+" cm");
                     System.out.println(mm+" mm");
                }
                public static void hm(double nilai){
                     double km =0.1*nilai;
                     double hm =1*nilai;
                     double dam =10*nilai;
                     double m = 100*nilai;
                     double dm =1000*nilai;
                     double cm =10000*nilai;
                     double mm=100000*nilai;
                     System.out.println(nilai+" hm = ");
                     System.out.println(km+" km");
                     System.out.println(dam+" dam");
                     System.out.println(m+" m");
                     System.out.println(dm+" dm");
                     System.out.println(cm+" cm");
                     System.out.println(mm+" mm");
                }
                public static void dam(double nilai){
                     double km =0.01*nilai;
                     double hm =0.1*nilai;
                     double dam =1*nilai;
                     double m = 10*nilai;
                     double dm =100*nilai;
                     double cm =1000*nilai;
                     double mm=10000*nilai;
                     System.out.println(nilai+" dam = ");
                     System.out.println(km+" km");
                     System.out.println(hm+" hm");
                     System.out.println(m+" m");
                     System.out.println(dm+" dm");
                     System.out.println(cm+" cm");
                     System.out.println(mm+" mm");
                }
                public static void m(double nilai){
                     double km =0.001*nilai;
                     double hm =0.01*nilai;
                     double dam =0.1*nilai;
                     double m = 1*nilai;
                     double dm =10*nilai;
                     double cm =100*nilai;
                     double mm=1000*nilai;
                     System.out.println(nilai+" m = ");
                     System.out.println(km+" km");
                     System.out.println(hm+" hm");
                     System.out.println(dam+" dam");
                     System.out.println(dm+" dm");
                     System.out.println(cm+" cm");
                     System.out.println(mm+" mm");
                }
                public static void dm(double nilai){
                     double km =0.0001*nilai;
                     double hm =0.001*nilai;
                     double dam =0.01*nilai;
                     double m = 0.1*nilai;
                     double dm =1*nilai;
                     double cm =10*nilai;
                     double mm=100*nilai;
                     System.out.println(nilai+" dm = ");
                     System.out.println(km+" km");
                     System.out.println(hm+" hm");
                     System.out.println(dam+" dam");
                     System.out.println(m+" m");
                     System.out.println(cm+" cm");
                     System.out.println(mm+" mm");
                }
                public static void cm(double nilai){
                     double km =0.00001*nilai;
                     double hm =0.0001*nilai;
                     double dam =0.001*nilai;
                     double m = 0.01*nilai;
                     double dm =0.1*nilai;
                     double cm =1*nilai;
                     double mm=10*nilai;
                     System.out.println(nilai+" cm = ");
                     System.out.println(km+" km");
                     System.out.println(hm+" hm");
                     System.out.println(dam+" dam");
                     System.out.println(m+" m");
                     System.out.println(dm+" dm");
                     System.out.println(mm+" mm");
                }
                public static void mm(double nilai){
                     double km =0.000001*nilai;
                     double hm =0.00001*nilai;
                     double dam =0.0001*nilai;
                     double m = 0.001*nilai;
                     double dm =0.01*nilai;
                     double cm =0.1*nilai;
                     double mm=1*nilai;
                     System.out.println(nilai+" mm = ");
                     System.out.println(km+" km");
                     System.out.println(hm+" hm");
                     System.out.println(dam+" dam");
                     System.out.println(m+" m");
                     System.out.println(dm+" dm");
                     System.out.println(cm+" cm");
                }
        }
    
 