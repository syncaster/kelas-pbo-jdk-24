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

package w14_abstract;

/**
 *
 * @author Saiful Nur Budiman
 * Univ. Islam Balitar
 * Jun 18, 2025
 * 6:58:23 AM
 */
public class Gaji extends Pegawai implements Pajak{

    double gaji;

    public Gaji(String nama, double gaji) {
        super(nama);
        this.gaji = gaji;
    }
    
    
    
    @Override
    void Detail() {
        System.out.println("Nama pegawai: "+this.nama);
        this.gaji = gaji - hitungPajak();
        System.out.println("Gajinya: "+this.gaji);
    }

    @Override
    public double hitungPajak() {
        return (this.gaji*(PERSEN/100));
    }

//    @Override
//    public void coba() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    @Override
//    public void lain() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

}
