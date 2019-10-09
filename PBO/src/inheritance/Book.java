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
public class Book extends Document {
    private String title;

    public Book(String[] authors, Date date, String title) {
        super(authors, date);
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    public void print(){
        System.out.println("Judul : "+this.getTitle());
       
}
}
