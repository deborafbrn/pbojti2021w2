/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEBORA
 */
public class SepedaMain {
    public static void main(String[] args){
        Sepeda spd1 = new Sepeda();
      
        spd1.setMerk("Brongkon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.harga(68);
        spd1.tampil();
    }
}
