/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ArrayOfObject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2022-2023
 */
public class MainKomponen {

//    List listData;
    List<Komponen> listData;
    
    public static void main(String[] args) {
        //static compilier
        new MainKomponen().tambahData();
    }

    private void tambahData() {
        listData = new ArrayList();
        listData.add(new Komponen("Mouse Razer", 985000));
        listData.add(new Komponen("Headset Steelseries", 1328000));
        
//        for(int i=0;i<listData.size();i++){
//            System.out.println(listData.get(i));
//        }
        
        for(int i=0;i<listData.size();i++){
            System.out.println(listData.get(i).namaKomponen+" harganya "+listData.get(i).harga);
        }
    }
}
