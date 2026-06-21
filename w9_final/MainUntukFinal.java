/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w10_final;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class MainUntukFinal extends PenggunaanFinalClass{

    public MainUntukFinal() {
        PenggunaanFinalVariable var = new PenggunaanFinalVariable();
        var.PI = 3.8;
        System.out.println("PI = "+var.PI);
    }

//    @Override
//    public void methodFinal() {
//        System.out.println("method diubah");
//    }

    
    public static void main(String[] args) {
//       new MainUntukFinal();
//       new MainUntukFinal().methodFinal();
        new MainUntukFinal();
    }
}
