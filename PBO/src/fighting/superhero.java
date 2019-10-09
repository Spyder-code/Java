/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_2;

/**
 *
 * @author HP
 */
public class superhero {
  
    int damage;
    int damage1;
    int pertahanan;
    int pertahanan1;
    int kecepatan;
    int hp;
    int hp1;
    int hasil1;
    int hasil2;
    int total;
    
    public void superman(int damage,int hp){   
        System.out.println("Superman");
        System.out.println("damage : "+damage);
        System.out.println("hp : "+hp);

    }
    public void batman(int damage,int hp){
        System.out.println("Batman");
           System.out.println("damage : "+damage);
        System.out.println("hp : "+hp);
    }
    public void vs(){
        hasil1=hp;
        hasil2=hp1;
        for(int i=0;i<100;i++){
      hasil1 = hasil1-damage1;
      hasil2 = hasil2-damage;

            System.out.println("attacking : "+i);
            System.out.println("batman HP = "+hasil1);
            System.out.println("superman HP = "+hasil2);
        if(hasil2<=0){
            System.out.println("Batman win");
            i=100;
        }
        if(hasil1<=0){
            System.out.println("Superman win");
            i=100;
        }
    }
 
}
}
