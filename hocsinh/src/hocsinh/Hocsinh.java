/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hocsinh;

/**
 *
 * @author luongnhatduy
 */
public class Hocsinh {

  
   int rollno;  
   String name;  
    String college ="ITS";  
     
   public Hocsinh(int r,String n){  
   rollno = r;  
   name = n;  
   }  
 void display (){System.out.println(rollno+" "+name+" "+college);}  
  
 public static void main(String args[]){  
 Hocsinh s1 = new Hocsinh(111,"Karan");  
 Hocsinh s2 = new Hocsinh(222,"Aryan");  
   
 s1.display();  
 s2.display();  
 }  
} 

