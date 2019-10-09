/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class kalkulator {

    

 public void total(){
      operasi saya = new operasi();
     Scanner input = new Scanner(System.in);
     System.out.print("angka 1 : ");
     saya.a =input.nextInt();
System.out.print("angka 2 : ");
     saya.b =input.nextInt();
    saya.kurang();
    saya.tambah();
    
 }
}