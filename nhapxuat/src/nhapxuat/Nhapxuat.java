/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapxuat;

/**
 *
 * @author luongnhatduy
 */
import java.util.Scanner;

public class Nhapxuat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         String ten;
         System.out.println("nhap ho va ten:");
         ten=sc.nextLine();
         
         int tuoi;
         System.out.println("nhap tuoi:");
         tuoi=sc.nextInt();
         
         System.out.println("anh "+ten+" "+ tuoi+" tuoi");
    }
    
}
