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
public class Staff extends Pegawai{
    
int JmlhKehadiran;
int hargaKehadiran = 100000;

public Staff(){
    
}
    public Staff(String nama,int gaji) {
        super(nama);
    }
    public void setJmlhKehadiran(int JmlhKehadiran){
        this.JmlhKehadiran = JmlhKehadiran;
    }
    
    @Override
     public void printNama(){
        System.out.println("Nama Staff : "+super.getNama());
    }
@Override
     public int getGaji(){
         int total = JmlhKehadiran * hargaKehadiran;
         return total+super.getGaji();
     } 
    
    
}
