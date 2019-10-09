package almi;

import java.util.Scanner;

public class pemilu {

public static void main(String args[]) {
    int max=0;
    int no=0;
 Scanner input = new Scanner(System.in);
    System.out.print("masukkan jumlah calon : ");
    int n=input.nextInt();
    int data []= new int [n];
    for(int i=0;i<n;i++){
        System.out.print("calon ke "+(i+1)+" : ");
        data [i]=input.nextInt();
        if (max<data[i]){
            max=data[i];
            no=i+1;
        }
    }
    System.out.println("suara terbanyak adalah "+max+" dengan no calon "+no);
}
}
