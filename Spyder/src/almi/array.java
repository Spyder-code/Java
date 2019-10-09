/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almi;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class array {

public static void main (String args[]){
    Scanner input = new Scanner (System.in);
    System.out.print("masukkan jumlah array : ");
    int n=input.nextInt();
    int [] angka = new int [n];
for (int i=0;i<n;i++){
    System.out.print("index ke "+i+" =  ");
    angka [i]=faktorial(input.nextInt());
}
for (int i=0;i<n;i++){
    System.out.print(angka[i]);
}
}
public static int faktorial (int angka){ 
   int a=1;
for (int i=1;i<=angka;i++){
    a=a*i;
    
}
System.out.println(a+" ");
return a;
}
}