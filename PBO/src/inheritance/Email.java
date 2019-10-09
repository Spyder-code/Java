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
public class Email extends Document{
    private String subject;
    private String to;

    public Email(String[] authors, Date date,String subject,String to) {
        super(authors, date);
        this.subject = subject;
        this.to = to;
    }
    
    public String getSubject(){
        return subject;
    }
    
    public String getTo(){
        return to;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }
}
