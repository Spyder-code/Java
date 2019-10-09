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
public class Staff extends Pegawai{
    
    private int jumlah_kehadiran[];
    private final int harga_kehadiran = 100000;
    
    public Staff(){
        
    }

 
    public Staff(int nip[], String nama[], String email[],int pangkat[]) {
        super(nip, nama, email,pangkat);
    }    
    
    public void setKehadiran(int hadir[]){
        this.jumlah_kehadiran = hadir;
    }
    

    public int getGaji(int i){
        int total_gaji = jumlah_kehadiran[i]*harga_kehadiran;       
        return total_gaji+super.getGaji(i);
    }
}
