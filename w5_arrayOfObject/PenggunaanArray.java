/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w5_arrayOfObject;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 */
public class PenggunaanArray {

    public static void main(String[] args) {
        String cobaArray[][] = new String[2][3];
        int counter = 0;

        //isi array
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                cobaArray[i][j] = String.valueOf(counter);
                System.out.print(cobaArray[i][j]+"|");
                counter++;
            }
            System.out.println();
        }
    }   
}
