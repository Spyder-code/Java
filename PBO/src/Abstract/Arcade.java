/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author HP
 */
public class Arcade extends Permainan { 
    private int hit;
    private int miss;

   
    @Override
    public int hitungScore(int hit, int miss) {
        this.hit =hit;
        this.miss=miss;
     int total = (hit*3)-(miss); 
       return total;
    }
    @Override
    public void jalankan(){
        System.out.println("nama : "+super.getNamaPemain());
        System.out.println("level : "+super.getLevelPemain());
        System.out.println("Score : "+this.hitungScore(hit, miss));
       
    }
    
}
