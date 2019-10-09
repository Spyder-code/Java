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
import java.net.*;
public class GetName {
    
public static void main(String args[]) throws Exception {
InetAddress host = null;
host = InetAddress.getLocalHost();
System.out.println("Nama komputer Anda: " +
host.getHostName());

host = InetAddress.getLocalHost();
byte ip[] = host.getAddress();
for (int i=0; i<ip.length; i++) {
if (i > 0) {
System.out.print(".");
}
System.out.print(ip[i] & 0xff);
}
System.out.println();
}
}