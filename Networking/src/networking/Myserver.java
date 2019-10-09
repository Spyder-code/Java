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

public class Myserver {
public static void main(String[] args){
try{
ServerSocket ss=new ServerSocket(6666);
Socket s=ss.accept();//establishes connection 

DataInputStream dis=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
Scanner input = new Scanner(System.in);
for(int i=0;i<=10;i++){
String	str=(String)dis.readUTF();
System.out.println("message from client = "+" "+str);
System.out.print("masukkan pesan ke client : ");
    String n = input.nextLine();
dout.writeUTF(n);
 dout.flush();   
}
ss.close();

}catch(Exception e){System.out.println(e);}
}
}

