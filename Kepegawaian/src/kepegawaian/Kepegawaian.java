/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kepegawaian;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Kepegawaian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner iinput = new Scanner(System.in);
        System.out.print("Masukan jumlah Dosen : ");
        int n = input.nextInt();
        System.out.print("Masukan jumlah Staff : ");
        int m = input.nextInt();
       
        Staff [] s = new Staff[m];
        Staff ss = new Staff();
        Dosen[] d = new Dosen[n];
         String nama;
         int kehadiran;
         int sks;
     
        for(int i =0;i<m;i++){
            System.out.print("Masukan nama Staff : ");
           nama = iinput.nextLine();
            System.out.println("Masukan Jumlah Kehadiran : ");
            kehadiran = input.nextInt();
            s[i]= new Staff(nama,kehadiran);
        }
        //for(int i =0;i<n;i++){
            //System.out.print("Masukan nama Dosen : ");
            //nama = iinput.nextLine();
            //System.out.println("Masukan Jumlah Sks : ");
           // sks = input.nextInt();
          //  d[i]= new Dosen(nama,sks);
        //}
       Gaji g = new Gaji(m);
      g.addPegawai(s[0]);
      g.addPegawai(s[1]);
      g.print();
    }
    
}
