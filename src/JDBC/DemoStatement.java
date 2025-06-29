/*
 * Copyright (C) 2025 saifulnb
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package w15_jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Saiful Nur Budiman
 * Univ. Islam Balitar
 * Jun 23, 2025
 * 10:00:13 PM
 */
public class DemoStatement {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = DBConnection.getKoneksi();
            if(conn != null){
                stmt = conn.createStatement();
                
//                //insert data
//                String insertSQL = "insert into mahasiswa "
//                        + "(nim, nama, jurusan, angkatan) "
//                        + "values ('2025010', 'Luffy', 'Teknik Informatika', 2025)";
//                int baru = stmt.executeUpdate(insertSQL);
//                System.out.println(baru+" baris berhasil ditambahkan");
                
//                //select data
//                String selectSQL = "select * from mahasiswa";
//                rs = stmt.executeQuery(selectSQL);
//                while(rs.next()){
//                    System.out.println("NIM = "+rs.getString("nim"));
//                    System.out.println("Nama = "+rs.getString("nama"));
//                    System.out.println("Jurusan = "+rs.getString("jurusan"));
//                    System.out.println("Angkatan = "+rs.getInt("angkatan"));
//                    System.out.println("=================================");
//                }

//                  //update data
//                  String updateSQL = "update mahasiswa set jurusan = 'Magang' "
//                          + "where nim = '2025010'";
//                  int update = stmt.executeUpdate(updateSQL);
//                  System.out.println(update+" baris berhasil diupdate");

                    //delete data
                    String deleteSQL = "delete from mahasiswa where "
                            + "nim = '2025010'";
                    int delete = stmt.executeUpdate(deleteSQL);
                    System.out.println(delete+" baris berhasil dihapus");
                    
            }
            
        }catch(SQLException e){
            System.err.println("operasi database error "+e.getMessage());
        }
    }
}
