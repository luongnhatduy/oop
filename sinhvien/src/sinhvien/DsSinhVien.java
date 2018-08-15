/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;

import java.util.Scanner;
/**
 *
 * @author luongnhatduy
 */
public class DsSinhVien extends sinhvien{
    private sinhvien[] a=new sinhvien[100];
    private int n;
    
    public void vao(){
        System.out.println("nhap so luong sinh vien: ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            a[i]=new sinhvien();
            a[i].nhap();
        }
    }
    
    public void ra(){
        System.out.println("\n\n\nHIEN THI DANH SACH SINH VIEN: ");
        for(int i=0;i<n;i++){
            a[i].xuat();
        }
    }
    
    public void sapxep(){
        sinhvien tg=new sinhvien();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            if(a[i].tuoi<a[j].tuoi) {
                tg=a[i];
                a[i]=a[j];
                a[j]=tg;
            }
        }
    }
    
}
