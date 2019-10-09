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
public class Dosen extends Pegawai {
    int jmlhSks;
    int hargaSks = 200000;
    
    public Dosen(){
        
    }
    public Dosen(String nama, int sks) {
        super(nama);
    }
    @Override
    public void printNama(){
        System.out.println("Nama Dosen S: "+super.getNama());
    }
    public int getGaji(){
         int total = jmlhSks * hargaSks;
         return total+super.getGaji();
     }
    
}
