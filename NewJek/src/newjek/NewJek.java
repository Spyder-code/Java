/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjek;



/**
 *
 * @author HP
 */
public class NewJek {
int jarak;
int nilai;
int bayar;
String posisi;
String tujuan;
   
    public void pembayaran(){
        bayar = nilai*jarak;
        System.out.println("Uang yang harus dibayar : Rp "+bayar);
    }
    
}
