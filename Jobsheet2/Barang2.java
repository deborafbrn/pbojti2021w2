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
public class Barang2 {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    
    public void hargaJual(int harga){
       int hargaJual = (int) (hargaDasar-(hargaDasar*diskon));
    }
    
    public void tampilData(){
        System.out.println();
        System.out.println("Kode barang "+kode);
        System.out.println("Nama barang "+namaBarang);
        System.out.println("Harga dasar Rp. "+hargaDasar);
        System.out.println("Diskon "+diskon+"%");
        System.out.println("Harga Jual Rp. ");
    }
}

