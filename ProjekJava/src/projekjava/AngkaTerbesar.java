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
public class AngkaTerbesar {
    public static void main (String[] args){
        int max = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan banyaknya angka : ");
        int n = input.nextInt();
        int data[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("angka ke " + (i + 1) + " : ");
            data[i] = input.nextInt();
            if (data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("angka terbesar adalah " + max);
    }
}
