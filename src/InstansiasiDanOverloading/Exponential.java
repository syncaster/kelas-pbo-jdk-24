/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstansiasidanOverloading;

/**
 *
 * @author SaifulNB
 */
public class Exponential {
    double hasil;
    
    //overloading pada constructor
    public Exponential() {
        System.out.println("constructor tanpa param");
    }

    //overloading pada constructor
    public Exponential(double a, double b) {
        System.out.println("constructor dengan dua param");
        System.out.println("nilai "+ a +" pangka "+ b +" = "+hitung(a, b));
    }
    
    
    
    public static void main(String[] args) {
        //namaClass namaobj = new namaConstructor();
        Exponential exp = new Exponential();
        exp.hitung(3);
        System.out.println("nilai 3 pangkat 2 = "+exp.hasil+"\n");
        
        
        Exponential ponen = new Exponential(4, 3);
        
    }  

    //overloading pada method
    private double hitung(int x) {
        return hasil = Math.pow(x, 2);
    }
    
    //overloading pada method
    private double hitung(double x, double y) {
        return hasil = Math.pow(x, y);
    }
}
