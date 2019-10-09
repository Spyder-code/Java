/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.Tugas;

/**
 *
 * @author HP
 */
public class Dosen extends Pegawai{
    private int jmlh_sks;
    private final int harga_sks = 250000;
    
    public Dosen (){
        
    }

    public Dosen(String nama, int nip, String email, int pangkat,int jmlh_sks,int harga_sks) {
        super(nama, nip, email, pangkat);
        this.jmlh_sks = jmlh_sks;
    }
    /**
     * @param jmlh_sks the jmlh_sks to set
     */
    public void setJmlh_sks(int jmlh_sks) {
        this.jmlh_sks = jmlh_sks;
    }
    public int jmlh_dosen(int n){
    return n; 
    }
     public int getGaji() {
        int total = jmlh_sks*harga_sks;
        return total+super.getGaji();
    }
    
}
