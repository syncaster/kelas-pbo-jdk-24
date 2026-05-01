/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w5_arrayOfObject;

import java.util.Scanner;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 */
public class MainLaptop {

    public static void main(String[] args) {
        Laptop[] laptops = new Laptop[2];
        
        for(int i=0;i<laptops.length;i++){
            System.out.print("Input model laptop: ");
            Scanner sc = new Scanner(System.in);
            String brand = sc.next();
            
            laptops[i] = new Laptop();
            laptops[i].setBrand(brand);
        }
        
       //menampilkan isi data via ArrayLength
       for(int i=0;i<laptops.length;i++){
           System.out.println(laptops[i].getBrand());
       }
       
       //menampilkan isi data via for-loop
       for(Laptop lepi: laptops){
           System.out.println(lepi.getBrand());
       }
    }
}
