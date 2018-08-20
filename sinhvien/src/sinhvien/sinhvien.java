
package sinhvien;


import java.util.Scanner;

public class sinhvien {
    String hoten;
    int tuoi;
    
    public void nhap(){
        System.out.println("nhap thong tin sinh vien:");
        System.out.println("ho va ten:");
        Scanner sc =new Scanner(System.in);
        hoten=sc.nextLine();
        
        System.out.println("nhap tuoi:");
        sc =new Scanner(System.in);
        tuoi=sc.nextInt();
    }
    
    public void xuat(){
        System.out.println(hoten+" "+tuoi+" tuoi");
    }
}
