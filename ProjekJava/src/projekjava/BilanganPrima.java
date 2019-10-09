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
public class BilanganPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        int hasil=0;
      Scanner input = new Scanner (System.in);
        System.out.print("masukan bilangan : ");
        int n =input.nextInt();
        for (int i=1;i<=n;i++){
            c = n%i;
            if (c==0){
            hasil++;
        }
        }
        if (hasil == 2){
            System.out.println(n+" merupakan bilangan prima");
        }
        else {
            System.out.println(n+" bukan bilangan prima");
        }
    }
    
}
