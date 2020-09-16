/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author DEBORA
 */
public class Peminjaman {
    public int id;
    public int hari;
    public String namaMember;
    public String namaGame;
    public int harga;
    
    
    public void tampilDataPeminjaman(){
        System.out.println("ID Member       : MBR"+id);
        System.out.println("Nama Member     : "+namaMember);
        System.out.println("Nama Game       : "+namaGame);
        System.out.println("Harga sewa      : Rp. "+harga+"/hari");
        System.out.println("Lama sewa       : "+hari+" hari");
    }
    public int pembayaran(){
        System.out.println("STRUK BAYAR");
        int totalBayar=hari*harga;
        return totalBayar;
    }
}
