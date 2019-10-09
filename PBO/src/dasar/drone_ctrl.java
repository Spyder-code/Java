/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author HP
 */
public class drone_ctrl {
    public static void main(String[]args){
        drone a = new drone();
        a.energi = 100;
        a.kecepatan = 2;
        a.ketinggian =0;
        a.merek = "Hitech";
                a.terbang();
        a.belok();
        a.maju();
        a.mundur();
        a.turun();
        a.matikanMesin();
    }
}
