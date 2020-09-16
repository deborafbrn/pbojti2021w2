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
import java.util.Scanner;
public class TestBarang2 {
    public static void main (String[] args){
    Scanner deb = new Scanner (System.in);
    
    Barang2 b1 = new Barang2();
    
    System.out.print("Kode barang: ");
    b1.kode=deb.nextLine();
    System.out.print("Nama barang: ");
    b1.namaBarang=deb.nextLine();
    System.out.print("Harga: Rp. ");
    b1.hargaDasar=deb.nextInt();
    System.out.print("Diskon: ");
    b1.diskon=deb.nextFloat();
    b1.tampilData();
    b1.hargaJual(1);
    
    }
}
