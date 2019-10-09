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
public class smtpClient{
public static void main (String[] argv)
{
Socket smtpSocket=null;
DataOutputStream os=null;
BufferedReader is=null;
try
{
smtpSocket= new Socket("mail.uajy.ac.id",25);
os=new DataOutputStream(smtpSocket.getOutputStream());
is=new BufferedReader(new
InputStreamReader(smtpSocket.getInputStream()));
}catch(UnknownHostException e){
System.err.println("Nama komputer tidak dikenali");
}catch(IOException e){
System.err.println("Tidak dapat melakukan operasi io");
}
if(smtpSocket!=null && os!=null && is!=null)
{
try{
//mengirim dan mencetak pesan
System.out.println(is.readLine());
os.writeBytes("HELO\r\n");
System.out.print("HELO\n");
System.out.println(is.readLine());
os.writeBytes("MAIL From:any@mail\r\n");
System.out.print("MAIL From:any@mail\n");
System.out.println(is.readLine());
os.writeBytes("RCPT To:kusnadi@mail.uajy.ac.id\r\n");
System.out.print("RCPT To:kusnadi@mail.uajy.ac.id\n");
System.out.println(is.readLine());
os.writeBytes("DATA\r\n");
System.out.print("DATA\n");
System.out.println(is.readLine());
os.writeBytes("From: any@mail\r\n");
System.out.print("From: any@mail\n");
System.out.println(is.readLine());
os.writeBytes("Subject: testing\r\n");
System.out.print("Subject: testing\n");
System.out.println(is.readLine());
os.writeBytes("Hi, ini percobaan kirim email.\r\n");
System.out.print("Hi, ini percobaan kirim email.\n");
System.out.println(is.readLine());
os.writeBytes("\r\n.\r\n");
System.out.print(".\n");
System.out.println(is.readLine());
os.writeBytes("QUIT\r\n");
System.out.print("QUIT\n");
System.out.println(is.readLine());
//menutup semua object
os.close();
is.close();
smtpSocket.close();
} catch(UnknownHostException e){
System.err.println("Nama komputer tidak dikenali");
}catch(IOException e){
System.err.println("Tidak dapat melakukan operasi io");
}
}
}
}
