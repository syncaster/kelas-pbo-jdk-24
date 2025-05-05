/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstansiasidanOverloading;

/**
 *
 * @author SaifulNB
 */
public class Mobil {
    String pabrikan, tipe, warna;
    
    public static void main(String[] args) {
        //instansiasi = pembentukan object dari class
        //syntax instansiasi
        //namaClass namaObject = new namaConstructor()
        Mobil mobil1 = new Mobil();
        mobil1.pabrikan = "Honda";
        mobil1.tipe = "Jazz";
        mobil1.warna = "Kuning";
        System.out.println(mobil1.pabrikan+" jenisnya "+mobil1.tipe+" memiliki warna "+mobil1.warna);
        mobil1.maju();
        mobil1.mundur();
        
        
        Mobil mobil2 = new Mobil();
        mobil2.pabrikan = "Toyota";
        mobil2.tipe = "Agiya";
        mobil2.warna = "Silver";
        System.out.println(mobil2.pabrikan+" jenisnya "+mobil2.tipe+" memiliki warna "+mobil2.warna);
        mobil2.maju();
        mobil2.mundur();
        
    }

    private void maju() {
        System.out.println("Masukkan gigi 1");
    }

    private void mundur() {
        System.out.println("Masukkan R");
    }
    
}
