/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPbo.ipMahasiswa;

import inheritance.Tugas.Pegawai;

/**
 *
 * @author HP
 */
public class mahasiswa {
    private String nama;
    private int nim;
   private MataKuliah [] matkul;
   private int jmlhMatkul =0;
   
  public mahasiswa (String nama, int nim, int jmlhMatkul){
      matkul = new MataKuliah[jmlhMatkul];
      this.nama = nama;
      this.nim = nim; 
  }
  public void addMatkul(MataKuliah m){
      matkul[jmlhMatkul] = m;
      jmlhMatkul++;
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

    /**
     * @return the nim
     */
    public int getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(int nim) {
        this.nim = nim;
    }
    public void printAll(){
        double ip =0;
        int sks =0;
        double totalIp;
        System.out.println("nama : "+nama);
        System.out.println("NIM  : "+nim);
        System.out.println("");
       for(int i=0;i<jmlhMatkul;i++){
           System.out.println((i+1)+". "+matkul[i].getMataKuliah());
           System.out.println("SKS : "+matkul[i].getSks()); 
           ip = ip+(matkul[i].getIp()*matkul[i].getSks());
           sks = sks+matkul[i].getSks();
           System.out.println("");
       }
       totalIp = ip/sks;
        System.out.println("IP Mahasiswa : "+totalIp);
    }
    
}
