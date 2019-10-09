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
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyClient {
public static void main(String[] args) {
try {
Socket s = new Socket("localhost", 5136);
InputStream is = s.getInputStream();
OutputStream os = s.getOutputStream();
String pesan = "Siapa anda ?? \r\n";
os.write(pesan.getBytes());
int c;
while(true)
{
c=is.read();
System.out.print((char)c);
if((char)c=='\n')
break;
}
is.close();
os.close();
s.close();
} catch (UnknownHostException ex) {
Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
} catch (IOException ex) {
Logger.getLogger(MyClient.class.getName()).log(Level.SEVERE, null, ex);
}
}
}