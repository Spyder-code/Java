/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rekursif;
   import java.util.Scanner;
/**
 *
 * @author HP
 */
public class hanoi {



public static void main(String[]args) {

Scanner input = new Scanner(System.in);
System.out.println("jumlah piringan?");
int N=input.nextInt();
System.out.println();
hanoi(N, 'a', 'b', 'c');
}

static void hanoi(int n, char awal, char bantu, char akhir) {

if(n==1)
System.out.println("pindahkan "+n+" dari "+awal+" ke "+akhir);
else{
hanoi(n-1, awal,akhir,bantu);
System.out.println("pindahkan "+n+" dari "+awal+" ke "+akhir);
hanoi(n-1,bantu,awal,akhir);
}
}

}
