/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhdonggoi;

/**
 *
 * @author luongnhatduy
 */
public class main {

    
    public static void main(String[] args) {
        nguoi n=new nguoi();
        n.sethoten("luong nhatduy");
        n.setque("nam dinh");
        System.out.println("ho ten:\n"+n.gethoten()+"\nque quan:\n"+n.getque());
    }
    
}
