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
public class Staff extends Pegawai {
    private int jmlh_kehadiran;
    private final int harga_kehadiran = 100000;

  
    public Staff(){
        
    }
    public Staff(String nama, int nip, String email, int pangkat,int jmlh_kehadiran,int harga_kehadiran) {
        super(nama, nip, email, pangkat);
        this.jmlh_kehadiran = jmlh_kehadiran;
    }

    

    public void setJmlh_kehadiran(int jmlh_kehadiran) {
        this.jmlh_kehadiran = jmlh_kehadiran;
    }
    
    public int getGaji(){
        int total = jmlh_kehadiran*harga_kehadiran;
        return total+super.getGaji();
    }
    public int jmlh_staff(int n){
    return n; 
    }
}
