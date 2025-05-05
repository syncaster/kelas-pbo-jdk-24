/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author SaifulNB
 */
public class Warung {
    private String makanan, minuman;
    
    
    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }
    
    
    
    public static void main(String[] args) {
        Warung warung = new Warung();
        warung.setMakanan("rendang");
        warung.setMinuman("Es Teh");
        
        System.out.println(warung.getMakanan());
        System.out.println(warung.getMinuman());
    }
    
    
}
