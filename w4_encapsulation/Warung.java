/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w4_encapsulation;

/**
 *
 * @author saifulnb
 */
public class Warung {
    public String makanan, minuman;

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
        warung.setMakanan("Bakso Beranak");
        warung.setMinuman("Es Teh Manis");
        System.out.println(warung.getMakanan()+" dan "+warung.getMinuman());
    }
    
}
