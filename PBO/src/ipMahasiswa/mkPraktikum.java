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
public class mkPraktikum extends MataKuliah{
    private int jmlhModul;
    private int nilaiModul[];
    private int jumlahNilai=0;

    public mkPraktikum(String jadwal, String dosenPengampu, String mataKuliah, int sks) {
        super(jadwal, dosenPengampu, mataKuliah, sks);
    }


    
    public void setJumlahModul(int jmlhModul){
        this.jmlhModul = jmlhModul;
    }
    public void setNilaiModul(int jmlh, int data[]){
         nilaiModul  = new int[jmlh];
     for(int i=0;i<jmlh;i++){
         nilaiModul[i]=data[i];
         jumlahNilai = data[i]+jumlahNilai;
     }    
    }
   
   
    @Override
    public int getNilai(){
       
        int nilaiTotal = jumlahNilai/jmlhModul;
        return nilaiTotal;
    }

    @Override
    public void nilai() {
        super.nilai(); //To change body of generated methods, choose Tools | Templates.
    }
   
   
}
