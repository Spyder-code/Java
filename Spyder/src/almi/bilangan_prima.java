package almi;
import java.util.Scanner;
public class bilangan_prima{
    
public static int bilprima (int a){
     int min= 0;
    int max=0;
int data [] = new int [max];
 for ( a =min;a<max;a++){  
         int i = 2;
   boolean cek = true;
                if (cek) {
                    while (cek) {
                        if (a % i == 0) {
                            cek = false;
                        } else {
                            i++;
                        }
                    }
                    if (i == a) {                    
                        
                       data[i]=a;
                    }
                }
}
return a;
}
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
      System.out.print("masukkan batas min: ");
     int min=input.nextInt();
           System.out.print("masukkan batas max: ");
     int max=input.nextInt();
     int data [] = new int [max];
   for (int a =min;a<max;a++){  
         int hasil = bilprima(a);
    
 }
   for (int a=min;a<max;a++){
      int c = (data[a]*10)+ data[a];
       System.out.println(c);
   }
}
}
