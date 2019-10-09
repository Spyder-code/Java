/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import java.util.Date;

/**
 *
 * @author HP
 */
public class DocumentApllication {
    
    public static void main (String args){
        String judul = "pengantar PBO";
            String pbo [] = {"aku","saya"};
            Date tgl = new Date(2019,10,10);
            String subjek = "Asking";
            String to = "aku@yahoo.com";
      Document d = new Document(pbo,tgl); 
      Book b = new Book(pbo,tgl,judul);
      Email e = new Email(pbo,tgl,subjek,to);
       
        
    }
}
