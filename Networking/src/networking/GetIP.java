/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking;
     import java.net.*;
/**
 *
 * @author HP
 */
public class GetIP {

    /**
     * @param args the command line arguments
     */
 
public static void main(String args[]) throws Exception {
InetAddress host = null;
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
    
    

