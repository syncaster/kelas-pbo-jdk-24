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
public class Tumbuhan {

    int jumlahBiji;
    private String nama;
    protected String warna;

    public int getJumlahBiji() {
        return jumlahBiji;
    }

    public void setJumlahBiji(int jumlahBiji) {
        this.jumlahBiji = jumlahBiji;
    }

    private String getNama() {
        return nama;
    }

    private void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void cetak(){
        System.out.println("Nama Tumbuhan ");
    }
    
    public Tumbuhan() {
//        System.out.println("Construct kosong di class Tumbuhan");
    }    

    public Tumbuhan(int jumlahBiji, String nama) {
        System.out.println("Constructor dua param di class Tumbuhan");
    }
    
    
}
