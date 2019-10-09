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
public class Document {
   private String authors[];
    private Date date;    

 public Document(String authors[],Date date){
     this.authors = authors;
     this.date = date;
 }  
 
 public String[] getAuthors(){
    return authors;
    
}

 public Date getDate(){
     return date;
   
 }
 public void setAuthors(String authors[]){
          this.authors = authors;

}

 public void setDate(Date date){
     this.date = date;
 }
 
}
