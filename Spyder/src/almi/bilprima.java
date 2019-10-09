package almi;
import java.util.Scanner;



public class bilprima {
       public static void main(String[] args) {
           boolean cek;
           int i;
           int hasil=0; 
         Scanner input = new Scanner (System.in);
           System.out.print("masukkan batas minimal : ");
           int min=input.nextInt();
           System.out.print("masukkan batas maksimal : ");
           int max=input.nextInt();
           System.out.println("bilangan prima-prima dari "+min+" sampai "+max+" adalah ");
           for (int a=min;a<max;a++){
               for (int b=min;b<max;b++){
                   i =2;
                 cek = true;
                   if (cek){
                       while(cek){
                           if(a%i==0){
                               cek=false;
                           }
                           else {
                               i++;
                           }
                       }
                       if (i==a){
                            i=2;
                          int t=a;
                         cek = true;
                         if (cek){
                             while(cek){
                                 if(b%i==0){
                                     cek=false;
                                 }
                                 else {
                                     i++;
                                 }
                             }
                                if (i==b){
                                    System.out.println(b);
                                }
                            }
                         }
                           
                       }
                   }
               }
           }
       }
