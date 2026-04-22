/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w2_instansiasi;

/**
 *
 * @author saifulnb
 */
public class Mobil {
    String parbikan, type, warna;

    private Mobil(String pabrikan, String type, String warna) {
        System.out.println(pabrikan);
        System.out.println(type);
        System.out.println(warna);
    }
    
    public void bergerMaju(){
        System.out.println("Maju");
    }
    
    public void bergerakMundur(){
        System.out.println("Mundur");
    }
    
    public void parkir(){
        System.out.println("Parkir");
    }
    
    public static void main(String[] args) {
        Mobil honda = new Mobil("Honda", "Brio", "Kuning");
        honda.bergerMaju();
        honda.bergerakMundur();
        honda.parkir();
        
        System.out.println("\n=============\n");
        
        Mobil toyota = new Mobil("Toyota", "Rush", "Hitam");
        toyota.bergerMaju();
        toyota.bergerakMundur();
        toyota.parkir();
    }
}
