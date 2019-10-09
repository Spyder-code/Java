/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPbo;

/**
 *
 * @author HP
 */
public class waktu {
    int jam;
    int menit;
    int detik;
    
    public void time(){
          if(jam>=24)
            System.out.println("Format waktu salah");
          else if (menit>59)
                System.out.println("Format waktu salah");
                  else if (detik>59)
                    System.out.println("Format waktu salah");
        
               else {
              System.out.println("format 24 jam : ");
                    System.out.println(jam+":"+menit+":"+detik);
                      System.out.println("format am/pm : ");
                     int jamm;
       if (jam>13){
           jamm = jam-12;
         
            System.out.println(jamm+":"+menit+":"+detik);
       }
       else {
         System.out.println(jam+":"+menit+":"+detik);   
       }
               }
                
    
    }       
}

    
              
    

