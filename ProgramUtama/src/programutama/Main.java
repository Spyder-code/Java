/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programutama;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner iinput = new Scanner (System.in);
        Dosen d = new Dosen();
        String nama;
        int sks;
        System.out.print("masukan nama dosen : ");
        nama = iinput.nextLine();
        d.setNama(nama);
        System.out.print("jumlah sks : ");
        sks = input.nextInt();
        d.setSKS(sks);
   
        
        System.out.println("Rekap gaji pegawai : ");
        System.out.println("nama : "+d.getNama());
        System.out.println("Gaji : "+d.getGaji());
   } 
}
