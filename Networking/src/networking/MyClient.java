/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;

/**
 *
 * @author HP
 */


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class MyClient {
public static void main(String[] args) {
try{	
Socket s = new Socket("localhost",6666);
DataInputStream dis=new DataInputStream(s.getInputStream());	
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
Scanner input = new Scanner(System.in);
for(int i=0;i<=10;i++){ 
    System.out.print("masukkan pesan ke server : ");
    String n = input.nextLine();
dout.writeUTF(n);
 dout.flush();   
 String	str=(String)dis.readUTF();
System.out.println("message from server = "+" "+str);
}
dout.close();
s.close();

}catch(Exception e){System.out.println(e);}
}
}
