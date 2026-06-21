/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w07_inheritance.part1;

/**
 *
 * @author Saiful Nur Budiman Teknik Informatika - Univ.Islam Balitar 2022-2023
 */
public class Mamalia {

    String hewan, suara;

    public Mamalia() {
    }

    public Mamalia(String hewan, String suara) {
        this.hewan = hewan;
        this.suara = suara;
    }

    public void voice(String suara) {
        System.out.println("Suarany: " + suara);
    }

    public void voice(String suara, String hewan) {
        System.out.println("Hewan : " + hewan + " suaranya: " + suara);
    }

}
