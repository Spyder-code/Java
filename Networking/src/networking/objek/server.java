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
import java.net.*;
import java.io.*;
public class server {

public static void main(String argv[]) throws Exception{
try{
ServerSocket ss= new ServerSocket(6666);
Socket s= ss.accept();
//membuat stream untuk baca obyek
ObjectInputStream is= new ObjectInputStream(s.getInputStream());
//menunggu dan membaca obyek yang dikirimkan
staff pegawai= (staff) is.readObject();
System.out.println("Server menerima data Pegawai");
pegawai.print();
s.close();
}catch(IOException | ClassNotFoundException e){System.out.println(e);}
}
}
