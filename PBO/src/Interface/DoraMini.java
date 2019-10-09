/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author HP
 */
public class DoraMini implements Robot,Doraemon {
    private String nama;
    private String pemilik;
    private int tahun;

    /**
     * @return the pemilik
     */
    public String getPemilik() {
        return pemilik;
    }

    /**
     * @param pemilik the pemilik to set
     */
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Override
    public void setNama(String nama) {
       this.nama = nama;
    }

    @Override
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    @Override
    public void displayData() {
        System.out.println("Nama : "+this.getNama());
        System.out.println("Pemilik : "+this.getPemilik());
        System.out.println("Tahun : "+this.getTahun());
        
    }

    @Override
    public void sayDora() {
        System.out.println("Halo !! Saya Dora mini ");  
    }

    @Override
    public void displayKantongAjaib() {
        System.out.println("Saya juga seperti Doraemon memiliki kantung ajaib");
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the tahun
     */
    public int getTahun() {
        return tahun;
    }
}
