/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w07_inheritance.part1;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class MainTumbuhan extends Tumbuhan {

    private String warna;
    
    //pendefinisian const induk secara eksplisit    
    public MainTumbuhan() {
//        super(1, "Monokotil");
//        super.cetak();
    }

    @Override
    public void cetak() {
        System.out.println("Nama Bunga");
    }

    @Override
    public void setWarna(String warna) {
        this.warna = warna;
        System.out.println("Warnanya: "+warna);
    }

    @Override
    public String getWarna() {
        return super.getWarna();
    }
    
    

    public static void main(String[] args) {
        //        MainTumbuhan mainTumbuhan = new MainTumbuhan();
        
        MainTumbuhan mainTumbuhan = new MainTumbuhan();
        mainTumbuhan.setWarna("Hijau");
        System.out.println(mainTumbuhan.getWarna());
    }
}
