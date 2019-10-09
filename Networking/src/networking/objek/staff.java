/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking.objek;

/**
 *
 * @author HP
 */
import java.io.*;
public class staff implements Serializable{
String nama;
String divisi;
int umur;

public staff(String nama, String divisi, int umur)
{
this.nama=nama;
this.divisi=divisi;
this.umur= umur;
}
public void print()
{
System.out.println("Data Staff: ");
System.out.println("Nama : " + nama);
System.out.println("Divis: " + divisi);
System.out.println("Umur : "+ umur);
}
}