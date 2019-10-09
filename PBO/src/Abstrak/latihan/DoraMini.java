/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstrak.latihan;

/**
 *
 * @author HP
 */
public class DoraMini extends robot{
    public void sayDora(){
        System.out.println("Halo, Saya Dora mini!");
    }

    @Override
    public void setNama(String nama) {
        super.nama = nama;
    }

    @Override
    public void displayData() {
        System.out.println("nama : "+nama);
        System.out.println("pemilik : "+pemilik);
        System.out.println("tahun : "+tahun);
    }
}
