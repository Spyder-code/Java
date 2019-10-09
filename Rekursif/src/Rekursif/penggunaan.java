/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;

/**
 *
 * @author HP
 */
public class penggunaan {
    public static long faktorial(int n){
        if(n==0){
            return 1;
        }
            else {
                    return n*faktorial(n-1);
                    }
        }
    public static void main (String[]args){
        for(int i = 0; i<11;i++){
            System.out.println("hasil faktorial "+i+"adalah "+faktorial(i));
        }
    }
}
