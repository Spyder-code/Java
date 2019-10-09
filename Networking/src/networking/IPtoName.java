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
public class IPtoName {
public static void main(String args[]) {
    
if (args.length == 0) {
System.out.println("Pemakaian: java IPtoName <IP address>");
System.exit(0);
}
String host = args[0];
InetAddress address = null;
try {
address = InetAddress.getByName(host);
} catch (UnknownHostException e) {
System.out.println("invalid IP - malformed IP");
System.exit(0);
}
System.out.println(address.getHostName());
}
}
