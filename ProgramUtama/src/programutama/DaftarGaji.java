/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programutama;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class DaftarGaji {
    
    private Pegawai[] listPegawai;
    private int jumlahPegawaiSekarang = 0;
    
    public DaftarGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }
    
    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }
    
    public void printSemuaGaji(){
        for (int i=0;i<1;i++){
            System.out.print(listPegawai[i].getNama(i)+" mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji(i));
        }
        
    }
}
