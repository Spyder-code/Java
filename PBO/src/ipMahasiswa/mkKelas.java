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
public class mkKelas extends MataKuliah {
    private int performance;
    private int uts;
    private int tugas;
    private int uas;

    public mkKelas(String jadwal, String dosenPengampu, String mataKuliah, int sks) {
        super(jadwal, dosenPengampu, mataKuliah, sks);
    }



    public void setNilai(int performance, int uts, int tugas, int uas){
        this.performance = performance;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;               
    }
    @Override
    public int getNilai(){
        int nilaiTotal = ((performance*10)+(uts*20)+(tugas*30)+(uas*40))/100;
        return nilaiTotal;
    }
    
}
