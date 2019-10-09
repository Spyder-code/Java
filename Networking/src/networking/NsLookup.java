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
public class NsLookup {
public static void main(String args[]) {
if (args.length == 0) {
System.out.println("Pemakaian: java NsLookup <hostname>");
System.exit(0);
}
String host = args[0];
InetAddress address = null;
try {
address = InetAddress.getByName(host);
} catch(UnknownHostException e) {
System.out.println("Unknown host");
System.exit(0);
}
byte[] ip = address.getAddress();
for (int i=0; i<ip.length; i++) {
if (i > 0) System.out.print(".");
System.out.print((ip[i]) & 0xff);
}
System.out.println();
}
}