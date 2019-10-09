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
public class Gaji {
     private Pegawai [] list_pegawai;
    private int jmlh_pegawai =0;
    
    public Gaji(int jmlh_pegawai){
        list_pegawai = new Pegawai [jmlh_pegawai];
    }

    
    public void addPegawai(Pegawai p){
        list_pegawai[jmlh_pegawai] = p;
        jmlh_pegawai++;
    }
    
    public void print(){
        int a = 0;
        System.out.println("Rekap Gaji Pegawai UINSA ");
        for(int i=0;i<jmlh_pegawai;i++){
            System.out.println(list_pegawai[i].getNama()+" :"+list_pegawai[i].getGaji());
            
            a = a+list_pegawai[i].getGaji();
        }
        System.out.println("Total : "+a);
    }
}
