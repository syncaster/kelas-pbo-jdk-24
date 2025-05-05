/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enkapsulasi;

/**
 *
 * @author SaifulNB
 */
public class MainWarung {
    
    public static void main(String[] args) {
        Warung warung = new Warung();
        warung.setMakanan("Nasi Goreng");
        warung.setMinuman("Soda");
        
       
        
        System.out.println(warung.getMakanan());
        System.out.println(warung.getMinuman());
    }
}
