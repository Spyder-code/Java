/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanetworking;

/**
 *
 * @author HP
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyServer {
public static void main(String[] args) {
try {
ServerSocket ss = new ServerSocket(5136);
Socket s = ss.accept();
InputStream is = s.getInputStream();
OutputStream os = s.getOutputStream();
String respon = "Saya Fariz\r\n";
int c;
while(true)
{
c=is.read();
System.out.print((char)c);
if((char)c=='\n')
break;
}
os.write(respon.getBytes());
os.flush();
os.close();
is.close();
s.close();
} catch (IOException ex) {
Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
}

}
}
