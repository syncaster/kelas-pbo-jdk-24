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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Saiful Nur Budiman
 * Teknik Informatika - Univ.Islam Balitar
 */
public class DemoPreparedStatement {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try{
            conn = DBConnection.getKoneksi();
            if(conn != null){
                
                //insert data
                String insertSQL = "insert into mahasiswa "
                        + "(nim, nama, jurusan, angkatan) "
                        + "values (?, ?, ?, ?)";
                pstmt = conn.prepareStatement(insertSQL);
                pstmt.setString(1, "2022012");
                pstmt.setString(2, "Hulk");
                pstmt.setString(3, "Kimia");
                pstmt.setInt(4, 2022);
                int baru = pstmt.executeUpdate();
                System.out.println(baru+" baris berhasil ditambahkan");
                
            }
            
        }catch(SQLException e){
            System.err.println("operasi database error "+e.getMessage());
        }
    }
}
