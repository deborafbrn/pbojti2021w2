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
public class TestLingkaran {
    public static void main(String[] args){
        Scanner deb =new Scanner (System.in);
        
        Lingkaran l1 = new Lingkaran();
        System.out.print("Masukkan nilai phi: ");
        l1.phi=deb.nextDouble();
        System.out.print("Masukkan nilai r: ");
        l1.r=deb.nextDouble();
        l1.hitungLuas();
        l1.hitungKeliling();
    }
}   

