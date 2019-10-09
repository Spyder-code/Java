/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.Tugas;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GajiPegawai {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Scanner iinput = new Scanner(System.in);
        Staff s = new Staff();
        Dosen dos = new Dosen();
        System.out.print("Masukan jumlah Dosen : ");
        int m = input.nextInt();
        System.out.print("Masukan jumlah Staff : ");
        int n =input.nextInt();
       
        
        
        for(int i=0;i<dos.jmlh_dosen(m);i++){             
            System.out.println("Pegawai Dosen ke-"+i);
            System.out.print("Masukan nama : ");
            String a = iinput.nextLine();
            dos.setNama(a);
            System.out.print("Masukan nip : ");
            int b = input.nextInt();
            dos.setNip(b);
            System.out.print("Masukan Email : ");
            String c = iinput.nextLine();
            dos.setEmail(c);
            System.out.print("Masukan Pangkat : ");
            int d = input.nextInt();
            dos.setPangkat(d);
            System.out.print("Masukan jumlah SKS : ");
           int e = input.nextInt();
            dos.setJmlh_sks(e);
            System.out.println("gaji yg diperoleh "+dos.getGaji());
        }       
            Gaji g = new Gaji(2);
            g.addPegawai(dos);
            g.print();
        
    }
}
