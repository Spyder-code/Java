/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author HP
 */
public class drone {
 
// atribut
int energi;
int ketinggian;
int kecepatan;
String merek;
// method
void terbang(){
energi--;
if(energi > 10){
// terbang berarti nilai ketinggian bertambah
ketinggian++;
System.out.println("Dorne terbang...");
    System.out.println("ketinggian : "+ketinggian);
    System.out.println("energi : "+energi);
} else {
System.out.println("Energi lemah: Drone nggak bisa terbang");
}
}
void matikanMesin(){
if(ketinggian > 0){
System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
} else {
System.out.println("Mesin dimatikan...");
}
}
void turun(){
// ketinggian berkurang, karena turun
ketinggian--;
energi--;
System.out.println("Drone turun");
 System.out.println("ketinggian : "+ketinggian);
    System.out.println("energi : "+energi);
}
void belok(){
energi--;
System.out.println("Drone belok");
 System.out.println("ketinggian : "+ketinggian);
    System.out.println("energi : "+energi);
// belok ke mana? perlu dicek :)
}
void maju(){
energi--;
System.out.println("Drone maju ke depan");
kecepatan++;
 System.out.println("ketinggian : "+ketinggian);
    System.out.println("energi : "+energi);
    System.out.println("kecepatan : "+kecepatan);
}
void mundur(){
energi--;
System.out.println("Drone mundur");
kecepatan--;
 System.out.println("kecepatan : "+kecepatan);
    System.out.println("energi : "+energi);
}
}

