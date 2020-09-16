/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DEBORA
 */
public class Sepeda {
    private String merek;
   private int kecepatan;
   private int gear;
   private int harga;
   
   public void setMerk(String newValue){
       merek = newValue;
   }
   
   public void gantiGear(int newValue){
       gear = newValue;
   }
   
   public void tambahKecepatan(int increment){
       kecepatan = kecepatan + increment;
   }
    
   public void rem(int decrement){
       kecepatan = kecepatan - decrement;
   }
   
   public void harga(int newValue){
       harga = newValue;
   }
   
   public void tampil(){
       System.out.println("Merek: "+merek);
       System.out.println("Kecepatan: "+kecepatan);
       System.out.println("Gear: "+gear);
       System.out.println("Harga: Rp. "+harga+" juta");          
   }
}
