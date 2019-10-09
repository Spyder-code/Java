/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPbo.ipMahasiswa;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Scanner iinput = new Scanner(System.in);
        String nama;
        String jadwal;
        String dosen;
        int sks;
        String matkul;
        int nilai;
        int nim;
        int jmlhMatkul;
        System.out.print("Nama mahasiswa : ");
        nama = iinput.nextLine();
        System.out.print("NIM : ");
        nim = input.nextInt();
        System.out.print("Jumlah Mata Kuliah yang diambil : ");
        jmlhMatkul = input.nextInt();
          mahasiswa mhs = new mahasiswa(nama,nim,jmlhMatkul);
        for(int i=0;i<jmlhMatkul;i++){
        System.out.println("Daftar mata kuliah : ");
        System.out.println("( 1. Mata Kuliah Kelas, 2. Mata Kuliah Praktikum, 3.Mata Kuliah Seminar )");
        System.out.print("Mata Kuliah ke-"+(i+1)+"  (pilih angka 1-3) : ");
        int j = input.nextInt();
        switch(j){
            case 1:{
                System.out.print("Nama Mata Kuliah : ");
                matkul = iinput.nextLine();
                System.out.print("jumlah SKS : ");
                sks = input.nextInt();
                System.out.print("Masukan jadwal : ");
                jadwal = iinput.nextLine();
                System.out.print("Nama Dosen : ");
                dosen = iinput.nextLine();
                System.out.print("nilai performance : ");
                 int p = input.nextInt();
                System.out.print("nilai tugas : ");
                 int t = input.nextInt();
                System.out.print("nilai uts : ");
                 int uts = input.nextInt();
                System.out.print("nilai uas ");
                 int uas = input.nextInt();
                 mkKelas kelas = new mkKelas(jadwal,dosen,matkul,sks);
                kelas.setNilai(p, uts, t, uas);
                mhs.addMatkul(kelas);
                break;}
            
            case 2:{
                System.out.print("Nama Mata Kuliah : ");
                matkul = iinput.nextLine();
                System.out.print("jumlah SKS : ");
                sks = input.nextInt();
                System.out.print("Masukan jadwal : ");
                jadwal = iinput.nextLine();
                System.out.print("Nama Dosen : ");
                dosen = iinput.nextLine();
                System.out.print("jumlah modul praktikum : ");
                int jumlahModul = input.nextInt();
                int modul [] = new int[jumlahModul];
                for(int k =0;k<jumlahModul;k++){
                    System.out.print("nilai modul ke-"+(k+1)+" : ");
                    modul[k]=input.nextInt();
                }
                mkPraktikum praktik = new mkPraktikum(jadwal,dosen,matkul,sks);
                praktik.setJumlahModul(jumlahModul);
                praktik.setNilaiModul(jumlahModul, modul);
                mhs.addMatkul(praktik);
                break;}
            
            case 3:{
                 System.out.print("Nama Mata Kuliah : ");
                matkul = iinput.nextLine();
                System.out.print("jumlah SKS : ");
                sks = input.nextInt();
                System.out.print("Masukan jadwal : ");
                jadwal = iinput.nextLine();
                System.out.print("Nama Dosen : ");
                dosen = iinput.nextLine();
                System.out.print("nilai pembimbing : ");
                int p = input.nextInt();
                System.out.print("nilai artikel : ");
                int a = input.nextInt();
                System.out.print("nilai presentasi : ");
                int pres = input.nextInt();
                mkSeminar seminar = new mkSeminar(jadwal,dosen,matkul,sks);
                seminar.setNilai(p, a, pres);
                mhs.addMatkul(seminar);
                break;}
            
            default : System.out.println("inputan mata kuliah salah");     
        }
        }
        System.out.println("=================");
        System.out.println("");
        mhs.printAll(); 

    }
}
