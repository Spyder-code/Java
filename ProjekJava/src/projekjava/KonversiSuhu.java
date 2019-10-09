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
public class KonversiSuhu {
 public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("1.Celsius  2.Reamur  3.Fahrenheit  4.Kelvin  ");
        System.out.print("pilih satuan yang akan di konversi (pilih angka 1-4): ");
         int suhu=input.nextInt();
        System.out.print("masukan nilai : ");
        double nilai=input.nextDouble();
             switch (suhu){
                 case 1:
                    celsius(nilai);
                     break;
                 case 2:
                 reamur(nilai);
                   break;
                     case 3:
                 fahrenheit(nilai);
                   break;
                         case 4:
                 kelvin(nilai);
                   break;
                           
             }
             }
                public static void celsius(double nilai){
                     double c =1*nilai;
                     double r =(0.8*nilai);
                     double f =(1.8*nilai)+32;
                     double k = 273+nilai;
                     System.out.println(nilai+" Celsius = ");
                     System.out.println(r+" Reamur");
                     System.out.println(f+" Fahrenheit");
                     System.out.println(k+" Kelvin");
                    
                }
                public static void reamur(double nilai){
                    double c =(1.25*nilai);
                     double r =1*nilai;
                     double f =(2.25*nilai)+32;
                     double k = (1.25*nilai)+273;
                     System.out.println(nilai+" Reamur = ");
                     System.out.println(c+" Celsius");
                     System.out.println(f+" Fahrenheit");
                     System.out.println(k+" Kelvin");
                }
                public static void fahrenheit(double nilai){
                     double c =0.55*(nilai-32);
                     double r =0.44*(nilai-32);
                     double f =1*nilai;
                     double k = 0.55*(nilai-32)+273;
                     System.out.println(nilai+" Fahrenheit = ");
                     System.out.println(c+" Celsius");
                     System.out.println(r+" Reamur");
                     System.out.println(k+" Kelvin");
                }
                public static void kelvin(double nilai){
                     double c =nilai-273;
                     double r =0.8*(nilai-273);
                     double f =1.8*(nilai-273)+32;
                     double k = 1*nilai;
                     System.out.println(nilai+" Kelvin = ");
                     System.out.println(c+" Celsius");
                     System.out.println(r+" Reamur");
                     System.out.println(f+" Fahrenheit");
               
                }
}
