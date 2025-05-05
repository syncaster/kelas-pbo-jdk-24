/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArrayOfObject;

import java.util.Scanner;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class MainLaptop {

    public static void main(String[] args) {
        Laptop[] laptop = new Laptop[2];
        
        for(int i=0;i<laptop.length;i++){
            System.out.print("Input model laptop: ");
            Scanner scanner = new Scanner(System.in);
            String brand = scanner.next();
            
            laptop[i] = new Laptop();
            laptop[i].setBrand(brand);
        }
        
//        //menampilkan isi data via ArrayLength
//        for(int i=0;i<laptop.length;i++){
//            System.out.println(laptop[i].getBrand());
//        }
//        
//        //menampilkan isi data via for-loop
//        for(Laptop laptop1: laptop){
//            System.out.println(laptop1.getBrand());
//        }
    }
}
