package sinhvien;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author luongnhatduy
 */
public class DsSinhVien extends sinhvien{
     ArrayList<sinhvien> ds = new ArrayList();

    private int n;
    
    public void vao(){
        System.out.println("nhap so luong sinh vien: ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            sinhvien a = new sinhvien();
            a.nhap();
            ds.add(a);

        }
    }
    
    public void ra(){
        System.out.println("\n\n\nHIEN THI DANH SACH SINH VIEN: ");
            ds.get(0).xuat();
            ds.get(1).xuat();
            ds.get(n-2).xuat();
            ds.get(n-1).xuat();   
    }
    
    public void sapxep(){
        sinhvien tg=new sinhvien();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
              if(ds.get(i).tuoi< ds.get(j).tuoi) {
                  tg=ds.get(i);
                  ds.set(i, ds.get(j));
                  ds.set(j,tg);
              } 
        }
               
    }       
    
}