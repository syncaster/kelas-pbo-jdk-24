/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author saifulnb
 */
public class Toni extends Kakek implements AyahInterface, IbuInterface{

    @Override
    public void cetak() {
        AyahInterface.super.cetak();
        IbuInterface.super.cetak();
        super.cetak();
    }
    
    
    
    public static void main(String[] args) {
        Toni toni = new Toni();
        toni.cetak();
    }
 
}
