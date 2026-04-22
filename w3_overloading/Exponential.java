/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w3_overloading;

/**
 *
 * @author saifulnb
 */
public class Exponential {
    public double hasil;

    public Exponential() {
    }

    public Exponential(double inputX) {
        hasil = Math.pow(inputX, 2);
    }
    
    public Exponential(double inputX, double inputY){
        hasil = Math.pow(inputX, inputY);
    }
    
    
    
    
    public static void main(String[] args) {
//        Exponential exp = new Exponential();
//        exp.pangkat(2);
//        exp.showHasil();
//        
//        System.out.println("\n======================\n");
//        
//        exp.pangkat(4, 3);
//        exp.showHasil();

        Exponential exp1 = new Exponential(3);
        exp1.showHasil();
        System.out.println("\n************************\n");
        Exponential exp2 = new Exponential(5, 3);
        exp2.showHasil();
    }

    private double pangkat(double inputY) {
        return hasil = Math.pow(inputY, 2);
    }
    
    private double pangkat(double inputX, double inputY){
        return hasil = Math.pow(inputX, inputY);
    }

    private void showHasil() {
        System.out.println("Hasil exponential: "+hasil);
    }
    
}
