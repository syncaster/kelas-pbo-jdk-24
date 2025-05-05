/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArrayOfObject;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class PenggunaanArrayList {

    public static void main(String[] args) {
        ArrayList<String> listAcaraTV = new ArrayList<>();
        listAcaraTV.add("Pesbuker");
        listAcaraTV.add("Hitam Putih");
        listAcaraTV.add("OVJ");
        
//        //menampilkan isi per item dari ArrayList
//        System.out.println(listAcaraTV.get(0));
        
        //remove item
        listAcaraTV.remove(0);
        
//        //remove all
//        listAcaraTV.clear();
        
        //menampikan semua isi ArrayList
        ListIterator<String> iterasi = listAcaraTV.listIterator();
        while (iterasi.hasNext()) {            
            System.out.println(iterasi.next());
        }
        
    }
}
