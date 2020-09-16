/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

import java.util.Scanner;

/**
 *
 * @author DEBORA
 */

public class TestPeminjaman {
    public static void main(String[] args){
        Peminjaman p1 = new Peminjaman();
        
        p1.id=17;
        p1.namaMember="Siska";
        p1.namaGame="God of War";
        p1.harga=5000;
        p1.hari=4;
        p1.tampilDataPeminjaman();
        System.out.println();
        
        
        System.out.println("Total bayar     : Rp. "+p1.pembayaran());    
    }   
}
