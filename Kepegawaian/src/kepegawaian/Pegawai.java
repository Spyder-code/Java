/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kepegawaian;

/**
 *
 * @author HP
 */
public class Pegawai {
    private String nama;
    
    public Pegawai(){
        
    }
    public Pegawai(String nama){
        this.nama = nama;
    }
    
    public void printNama(){
        System.out.println("Nama : "+this.getNama());
    }
    public int getGaji(){
        return 2000000;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}
