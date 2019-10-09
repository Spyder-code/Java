/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;


public class pemilu {
  public static int suara(){
        int n;
        int max=0;
        Scanner input = new Scanner(System.in);
           System.out.print("masukkan jumlah calon : ");
        n = input.nextInt();
        int data[] = new int[n];
        for (int i = 1; i < n+1; i++) {
            System.out.print("Calon ke "+i+" : ");
            data[i] = input.nextInt();
              if (data[i]>max){
              max = data[i];
          }       
    }
        return max;  
}
    public static void main(String args[]){
      int hasil=suara();
        System.out.println("suara terbanyak adalah : "+hasil);
    
    }
}
    

