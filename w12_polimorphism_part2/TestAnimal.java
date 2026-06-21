/*
 * Copyright (C) 2026 saifulnb
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

package w11_polimorphism_part2;

/**
 *
 * @author Saiful NB
 * github: https://github.com/syncaster
 * Prodi Teknik Informatika
 * Universitas Islam Balitar
 */
public class TestAnimal {

    public TestAnimal(){
        Animal anim = new Cat();
//        Cat cat = (Cat) anim;
//        Dog dog = (Dog) anim;
        if(anim instanceof Cat){
            Cat cat = new Cat();
            cat.meow();
        }else if(anim instanceof Dog){
            Dog dog = new Dog();
            dog.guk();
        }
    }
    
    public static void main(String[] args) {
        TestAnimal testAnimal = new TestAnimal();
    }
}
