package sinhvien;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author luongnhatduy
 */

public class DsSinhVien {
     ArrayList<sinhvien> ds = new ArrayList(); 
     private int n,max=0,vt;
    
    public void vao(){
        System.out.println("nhap so luong sinh vien: ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        
        
        for(int i=0;i<n;i++){
            sinhvien a = new sinhvien();
            a.nhap();
            ds.add(a);
            if (max<ds.get(i).tuoi) {
                max=ds.get(i).tuoi;
            }
        }
        
    }
    
    public void ra(){
        System.out.println("\nHIEN THI DANH SACH SINH VIEN: ");
           for(int i=0;i<n;i++)
               ds.get(i).xuat();
    }
    
    public void sapxep(){
        sinhvien tg;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
              if(ds.get(i).tuoi< ds.get(j).tuoi) {
                  tg=ds.get(i);
                  ds.set(i,ds.get(j));
                  ds.set(j,tg);
              } 
        }             
    }       
    public void vitri(){ 
        for(int i=0;i<n;i++){
            if (ds.get(i).tuoi==max){
                 System.out.println("sinh vien tuoi cao nhat "+ds.get(i).hoten+" co vi vi luc nhap ban dau la:"+i);    
            }
        } 
    } 
    
    public void them(){
        System.out.println("nhap vao vi tri can them:");
        Scanner sc =new Scanner(System.in);
        vt=sc.nextInt();
        ds.add(ds.get(n-1));
        for (int i=n-1;i>vt;i--){ 
                 ds.set(i,ds.get(i-1));           
        }
        n++;
        sinhvien  b = new sinhvien();
        b.nhap();
        
        ds.set(vt,b);
    }  
}