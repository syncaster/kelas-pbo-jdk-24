/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author saifulnb
 */
public class ContohVMI {
    
    public static void main(String[] args) {
//        ContohVMI contohVMI = new ContohVMI();
        HitungLuas hitungLuas = new PersegiPanjang();
        System.out.println("Panjang = "+hitungLuas.panjang);
        System.out.println("Lebar = "+hitungLuas.lebar);
        hitungLuas.luas();
    }
}
