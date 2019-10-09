/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programutama;

/**
 *
 * @author HP
 */
public class Dosen extends Pegawai{
 
    private int jumlahSKS;
    private final int harga_sks = 250000;
    
    public Dosen(){
        
    }
  
 
    public Dosen(int nip, String nama, String email,int pangkat) {
        super(nip, nama, email,pangkat);
    }
    
    public void setSKS(int SKS){
        this.jumlahSKS = SKS;
    }
    
  
    public int getGaji(){
        int total_gaji = jumlahSKS*harga_sks;
        return total_gaji;
    }
}
