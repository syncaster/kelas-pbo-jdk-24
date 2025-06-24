/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 * 2024-2025
 */
public class DBConnection {
    static final String DB_URL= "jdbc:mysql://localhost:3306/kampus_db";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    
    public static void main(String[] args) {
        Connection connection = getKoneksi();
        if(connection != null){
            try{
                
            }catch(SQLException e){
                
            }
        }
    }
         
    public static Connection getKoneksi() {
        Connection conn = null;
        try{
            
        }catch(SQLException e){
            
        }
        return conn;
    }
    
}
