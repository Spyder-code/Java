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
public class mkSeminar extends MataKuliah {
    private int pembimbing;
    private int artikel;
    private int presentasi;

    public mkSeminar(String jadwal, String dosenPengampu, String mataKuliah, int sks) {
        super(jadwal, dosenPengampu, mataKuliah, sks);
    }


     public void setNilai(int pembimbing, int artikel, int presentasi){
     this.pembimbing = pembimbing;
     this.artikel = artikel;
     this.presentasi = presentasi;           
 }
 @Override
 public int getNilai(){
     int nilaiTotal = ((pembimbing*20)+(artikel*50)+(presentasi*30))/100;
     return nilaiTotal;
 }


}
