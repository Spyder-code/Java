/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPbo.FormLogin;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class data {
String user;
String pas;
String email;
String nama;

public void registrasi(){
    Scanner input = new Scanner(System.in);
    System.out.println("Silahkan registrasi user ");
    System.out.print("nama : ");
    nama = input.nextLine();
    System.out.print("username : ");
    user = input.nextLine();
    System.out.print("password : ");
    pas = input.nextLine();
    System.out.print("e-mail   :");
    email = input.nextLine();
    System.out.println(""); 
    System.out.println("Registrasi sukses, silahkan Login");
    System.out.println("");
}
public void welcome(){
     System.out.println("Nama : "+nama);
    System.out.println("Username : "+user);
    System.out.println("E-mail : "+email);
}

public void home(String nama, String password){
 
         String h,i;
         h = nama;
         i = password;
    Scanner input = new Scanner(System.in);
         System.out.println("Form login");
        System.out.print("Username : ");
        nama = input.nextLine();
        System.out.print("Password  : ");
        password = input.nextLine();  
         System.out.println("");
        if(nama.equalsIgnoreCase(h)&& password.equalsIgnoreCase(i)){
            System.out.println("Login sukses");
            System.out.println("");
            welcome();
        }
        else{
            System.out.println("Login Salah, harap periksa kembali username dan password anda");
            System.out.println("");
        home(h,i);
        }     
    
    
}
}


