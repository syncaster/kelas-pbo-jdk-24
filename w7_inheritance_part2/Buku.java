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

package w07_inheritance.part2;

/**
 *
 * @author Saiful Nur Budiman
 * Univ. Islam Balitar
 * Jun 3, 2025
 * 10:39:51 PM
 */
public class Buku {

    String judul, pengarang;
    int harga;

    public Buku(String judul, String pengarang, int harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }
    
    public void show(){
        System.out.println("Judul : "+judul);
        System.out.println("Pengarang : "+pengarang);
        System.out.println("Harga buku : "+harga);
    }
}
