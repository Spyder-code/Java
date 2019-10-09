/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author HP3
 */
public abstract class Permainan {
    protected String namaPemain;
    protected int levelPemain ;

    /**
     * @return the namaPemain
     */
    public String getNamaPemain() {
        return namaPemain;
    }

    /**
     * @param namaPemain the namaPemain to set
     */
    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    /**
     * @return the levelPemain
     */
    public int getLevelPemain() {
        return levelPemain;
    }

    /**
     * @param levelPemain the levelPemain to set
     */
    public void setLevelPemain(int levelPemain) {
        this.levelPemain = levelPemain;
        if(levelPemain<=20){
            System.out.println(" Game level normal");
        } else if(levelPemain>20&&levelPemain<=80){
            System.out.println(" Game level medium");
        }else if(levelPemain>80){
            System.out.println(" Game level hard");
        }
        
    }
      public abstract int hitungScore(int hit,int miss);
      
    
    public void jalankan(){
        System.out.println("nama : "+this.getNamaPemain());
        System.out.println("level : "+this.getLevelPemain());
        System.out.println("Score : "+this.hitungScore(0, 0));
       
    }
    
   
     
    
}
