/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w4_encapsulation;

import java.util.Scanner;

/**
 *
 * @author saifulnb
 */
public class MainKinetik {
    
    public static void main(String[] args) {
        Kinetik ek = new Kinetik();        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan massa = ");
        ek.setMassa(sc.nextDouble());
        
        System.out.print("Masukkan kecepatan = ");
        ek.setKecepatan(sc.nextDouble());
        
        sc.close();
        
        System.out.println("Energi Kinetiknya: "+ek.hitung());
        
    }
}
