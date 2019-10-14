/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPbo.ipMahasiswa;

/**
 *
 * @author HP
 */
public class MataKuliah {
    private String jadwal;
    private int sks;
    private String dosenPengampu;
    private int nilai;
    private String mataKuliah;

    
    public MataKuliah(String jadwal,String dosenPengampu,String mataKuliah, int sks){
        this.jadwal = jadwal;
        this.dosenPengampu = dosenPengampu;
        this.sks = sks;
        this.mataKuliah = mataKuliah;
    }

    /**
     * @return the jadwal
     */
    
    public String getJadwal() {
        return jadwal;
    }

    /**
     * @param jadwal the jadwal to set
     */
    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    /**
     * @return the sks
     */
    public int getSks() {
        return sks;
    }

    /**
     * @param sks the sks to set
     */
    public void setSks(int sks) {
        this.sks = sks;
    }

    /**
     * @return the dosenPengampu
     */
    public String getDosenPengampu() {
        return dosenPengampu;
    }

    /**
     * @param dosenPengampu the dosenPengampu to set
     */
    public void setDosenPengampu(String dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }

    /**
     * @return the nilai
     */
    public int getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(int nilai) {
        this.nilai = nilai;
        
    }

    /**
     * @return the mataKuliah
     */
    public String getMataKuliah() {
        return mataKuliah;
    }

    /**
     * @param mataKuliah the mataKuliah to set
     */
    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    double angka;
    public double getIp(){
       String huruf;
       if(getNilai()>=91&&getNilai()<=100){
           huruf="A+";
           angka=4.00;
           System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()>=86&&getNilai()<=90){
           huruf="A";
           angka=3.75;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()>=81&&getNilai()<=85){
           huruf="A-";
           angka=3.5;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()>=76&&getNilai()<=80){
           huruf="B+";
           angka=3.25;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       } else if(getNilai()>=71&&getNilai()<=75){
           huruf="B";
           angka=3.00;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()>=66&&getNilai()<=70){
           huruf="B-";
           angka=2.75;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()>=61&&getNilai()<=65){
           huruf="C+";
           angka=2.5;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()>=56&&getNilai()<=60){
           huruf="C";
           angka=2.25;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()>=51&&getNilai()<=55){
           huruf="C-";
           angka=2.00;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()>=40&&getNilai()<=50){
           huruf="D";
           angka=1.75;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }else if(getNilai()<=39){
           huruf="E";
           angka=0;
            System.out.println("nilai akhir : "+getNilai());
           System.out.println("nilai abjad : "+huruf);
           System.out.println("nilai konversi : "+angka);
       }
       return angka;
   }
    
}
