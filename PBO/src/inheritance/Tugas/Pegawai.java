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
public class Pegawai {
    private String nama;
    private int nip;
    private String email;
    private int pangkat;
  
  
    public Pegawai (){
        
    }
    public Pegawai(String nama,int nip,String email, int pangkat){
        this.nama = nama;
        this.nip = nip;
        this.email = email;
        this.pangkat = pangkat;
}


public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @return the gaji
     */
    public int getGaji() {
        return 2000000;
    }

    /**
     * @param nama the nama to set
     */
    

    /**
     * @return the nip
     */
    public int  getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(int nip) {
        this.nip = nip;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pangkat
     */
    public int getPangkat() {
        return pangkat;
    }

    /**
     * @param pangkat the pangkat to set
     */
    public void setPangkat(int pangkat) {
        this.pangkat = pangkat;
    }

}
