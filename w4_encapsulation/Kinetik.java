/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w4_encapsulation;

/**
 *
 * @author saifulnb
 */
public class Kinetik {
    double massa, kecepatan;
    double energiKinetik;

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getEnergiKinetik() {
        return energiKinetik;
    }

    public void setEnergiKinetik(double energiKinetik) {
        this.energiKinetik = energiKinetik;
    }
    
    
    public double hitung(){
        return energiKinetik = 0.5*this.massa*Math.pow(this.kecepatan, 2);
    }
    
    
}
