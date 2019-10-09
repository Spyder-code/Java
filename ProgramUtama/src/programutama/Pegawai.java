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
public class Pegawai {

    private int nip;
    private String nama ;
    private String email;
    private int Pangkat;
    
     
 public Pegawai(){
     
 }
 
    public Pegawai(int nip, String nama, String email,int pangkat) {
        this.nip = nip;
        this.nama = nama;
        this.email = email;
        this.Pangkat = pangkat;
    }
    
  
    
    public String getNama(){
        return nama;
    }
    
   public int getGaji(){
       return 20000;
   }
    
    public void setNama(String nama) {
        this.nama = nama;
        }
    }

 
