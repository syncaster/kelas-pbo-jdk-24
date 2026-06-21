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
 * 10:32:36 PM
 */
public class MainMamalia {

    public static void main(String[] args) {
        Kucing cat = new Kucing();
        cat.nama = "Anabul";
        cat.speak();
        cat.makan("ikan");
        
        System.out.println("");
        
        Sapi cow = new Sapi();
        cow.nama = "Dancow";
        cow.speak();
        cow.makan("rumput");
    }
}
