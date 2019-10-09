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
public class BilanganGanjil {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.print("masukan bilangan : ");
        int n = input.nextInt();
       if (n%2==0){
           System.out.println(n+" merupakan bilangan genap");
       }
       else {
           System.out.println(n+" merupakan bilangan ganjil");
       }
            
        
    }
}
