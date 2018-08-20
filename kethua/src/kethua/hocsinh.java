/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author luongnhatduy
 */
public class hocsinh {
    private String ten;
    private int tuoi;
    
    static int count=0;
    public hocsinh(String ten,int tuoi){
        count++;
        this.ten=ten;
        this.tuoi=tuoi;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }
    
    
}
