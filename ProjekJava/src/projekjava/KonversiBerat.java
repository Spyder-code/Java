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
public class KonversiBerat {
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("1.kg  2.hg(ons)  3.dag  4.g  5.dg  6.cg  7.mg");
        System.out.print("pilih satuan yang akan di konversi (pilih angka 1-7): ");
         int berat=input.nextInt();
        System.out.print("masukan nilai : ");
        double nilai=input.nextDouble();
             switch (berat){
                 case 1:
                 kg(nilai);
                   break;
                 case 2:
                 hg(nilai);
                   break;
                 case 3:
                 dag(nilai);
                   break;
                 case 4:
                 g(nilai);
                   break;
                 case 5:
                 dg(nilai);
                   break;
                 case 6:
                 cg(nilai);
                   break;
                  case 7:
                 mg(nilai);
                   break;
             }
             }
                public static void kg(double nilai){
                     double kg =1*nilai;
                     double hg =10*nilai;
                     double dag =100*nilai;
                     double g = 1000*nilai;
                     double dg =10000*nilai;
                     double cg =100000*nilai;
                     double mg=1000000*nilai;
                     System.out.println(nilai+" kg = ");
                     System.out.println(hg+" hg");
                     System.out.println(dag+" dag");
                     System.out.println(g+" g");
                     System.out.println(dg+" dg");
                     System.out.println(cg+" cg");
                     System.out.println(mg+" mg");
                }
                public static void hg(double nilai){
                     double kg =0.1*nilai;
                     double hg =1*nilai;
                     double dag =10*nilai;
                     double g = 100*nilai;
                     double dg =1000*nilai;
                     double cg =10000*nilai;
                     double mg=100000*nilai;
                     System.out.println(nilai+" hg(ons) = ");
                     System.out.println(kg+" kg");
                     System.out.println(dag+" dag");
                     System.out.println(g+" g");
                     System.out.println(dg+" dg");
                     System.out.println(cg+" cg");
                     System.out.println(mg+" mg");
                }
                public static void dag(double nilai){
                     double kg =0.01*nilai;
                     double hg =0.1*nilai;
                     double dag =1*nilai;
                     double g = 10*nilai;
                     double dg =100*nilai;
                     double cg =1000*nilai;
                     double mg=10000*nilai;
                     System.out.println(nilai+" dag = ");
                     System.out.println(kg+" kg");
                     System.out.println(hg+" hg");
                     System.out.println(g+" g");
                     System.out.println(dg+" dg");
                     System.out.println(cg+" cg");
                     System.out.println(mg+" mg");
                }
                public static void g(double nilai){
                     double kg =0.001*nilai;
                     double hg =0.01*nilai;
                     double dag =0.1*nilai;
                     double g = 1*nilai;
                     double dg =10*nilai;
                     double cg =100*nilai;
                     double mg=1000*nilai;
                     System.out.println(nilai+" g = ");
                     System.out.println(kg+" kg");
                     System.out.println(hg+" hg");
                     System.out.println(dag+" dag");
                     System.out.println(dg+" dg");
                     System.out.println(cg+" cg");
                     System.out.println(mg+" mg");
                }
                public static void dg(double nilai){
                     double kg =0.0001*nilai;
                     double hg =0.001*nilai;
                     double dag =0.01*nilai;
                     double g = 0.1*nilai;
                     double dg =1*nilai;
                     double cg =10*nilai;
                     double mg=100*nilai;
                     System.out.println(nilai+" dg = ");
                     System.out.println(kg+" kg");
                     System.out.println(hg+" hg");
                     System.out.println(dag+" dag");
                     System.out.println(g+" g");
                     System.out.println(cg+" cg");
                     System.out.println(mg+" mg");
                }
                public static void cg(double nilai){
                     double kg =0.00001*nilai;
                     double hg =0.0001*nilai;
                     double dag =0.001*nilai;
                     double g = 0.01*nilai;
                     double dg =0.1*nilai;
                     double cg =1*nilai;
                     double mg=10*nilai;
                     System.out.println(nilai+" cg = ");
                     System.out.println(kg+" kg");
                     System.out.println(hg+" hg");
                     System.out.println(dag+" dag");
                     System.out.println(g+" g");
                     System.out.println(dg+" dg");
                     System.out.println(mg+" mg");
                }
                public static void mg(double nilai){
                     double kg =0.000001*nilai;
                     double hg =0.00001*nilai;
                     double dag =0.0001*nilai;
                     double g = 0.001*nilai;
                     double dg =0.01*nilai;
                     double cg =0.1*nilai;
                     double mg=1*nilai;
                     System.out.println(nilai+" mg = ");
                     System.out.println(kg+" kg");
                     System.out.println(hg+" hg");
                     System.out.println(dag+" dag");
                     System.out.println(g+" g");
                     System.out.println(dg+" dg");
                     System.out.println(cg+" cg");
                }
}
