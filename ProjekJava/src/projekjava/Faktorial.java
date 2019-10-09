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
public class Faktorial {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("masukan bilangan : ");
        int n = input.nextInt();
        int hasil=1;
        for (int i=1;i<=n;i++){
        hasil=hasil*i;
    }
        System.out.println("nilai faktorial dari "+n+" adalah "+hasil);
    }
}
