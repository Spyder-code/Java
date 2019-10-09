/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networking.URL;
 import java.io.*;  
import java.net.*;  
/**
 *
 * @author HP
 */
public class connection {

 
public static void main(String[] args){  
try{  
URL url=new URL("http://www.javatpoint.com/java-tutorial");  
URLConnection urlcon=url.openConnection();  
InputStream stream=urlcon.getInputStream();  
int i;  
while((i=stream.read())!=-1){  
System.out.print((char)i);  
}  
}catch(Exception e){System.out.println(e);}  
}  
}     

