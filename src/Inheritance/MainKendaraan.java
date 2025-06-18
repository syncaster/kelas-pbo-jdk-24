/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author saifulnb
 */
public class MainKendaraan extends Kendaraan{

    @Override
    public void jalankan() {
        System.out.println("Matic tanpa kopling");
    }
    
    
    
    public static void main(String[] args) {
        MainKendaraan mainKendaraan=new MainKendaraan();
        mainKendaraan.jalankan();
    }
}
