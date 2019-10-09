/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking.objek;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Client{


public static void main(String argv[]) throws Exception{
    Scanner input = new Scanner(System.in);
try{
//membuat soket client
Socket s = new Socket("localhost",6666);
//membuat stream untuk pengiriman obyek
ObjectOutputStream os= new
ObjectOutputStream(s.getOutputStream());
    System.out.print("nama : ");
String a = input.nextLine();
    System.out.print("divisi : ");
String b = input.nextLine();
    System.out.print("Umur : ");
    int c = input.nextInt();
staff pegawai= new staff(a,b,c);
os.writeObject(pegawai);
System.out.println("Client mengirim data pegawai:");
pegawai.print();
}
catch(Exception e){
}
}
}
