# Pertemuan 2: Instansiasi Objek (W2)

## 📌 Ringkasan

Pertemuan ini memperkenalkan konsep fundamental OOP: class, object, atribut, method, konstruktor, dan instansiasi objek.

**File:** `Mobil.java`

---

## 📚 Topik Pembelajaran

- Pengenalan Objek dan Kelas
- Atribut (Properties/Variables)
- Method (Behavior/Functions)
- Konstruktor
- Instansiasi Objek
- Penggunaan keyword `new`
- Akses atribut dan method dari object

---

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan pertemuan ini, mahasiswa dapat:

1. Memahami perbedaan antara class dan object
2. Mendeklarasikan atribut dan method dalam class
3. Membuat konstruktor dengan parameter
4. Membuat instance dari suatu class
5. Mengakses atribut dan memanggil method dari object
6. Memahami konsep `this` keyword

---

## 🔑 Konsep Kunci

### Class sebagai Blueprint

```java
public class Mobil {
    // Atribut (Data)
    String merek;
    String warna;
    int tahun;

    // Method (Behavior)
    public void tampilkanInfo() {
        System.out.println("Mobil: " + merek);
    }
}
```

- Class adalah template/blueprint untuk membuat object
- Mendefinisikan struktur dan perilaku object

### Atribut (Properties)

```java
String merek;      // Tipe data + nama atribut
String warna;
int tahun;
```

- Data yang dimiliki oleh setiap object
- Merepresentasikan state dari object

### Konstruktor

```java
public Mobil(String merek, String warna, int tahun) {
    this.merek = merek;
    this.warna = warna;
    this.tahun = tahun;
}
```

- Method khusus untuk inisialisasi object
- Nama sama dengan nama class
- Bisa menerima parameter
- Dipanggil otomatis saat membuat object dengan `new`

### Instansiasi Objek

```java
Mobil mobil1 = new Mobil("Toyota", "Merah", 2020);
Mobil mobil2 = new Mobil("Honda", "Biru", 2021);
```

- Membuat instance/object dari class
- Keyword `new` mengalokasikan memory untuk object
- Setiap object memiliki atribut sendiri

### Mengakses Atribut dan Method

```java
mobil1.merek          // Akses atribut
mobil1.tampilkanInfo() // Panggil method
```

- Gunakan dot operator (`.`) untuk akses
- Setiap object bisa memiliki nilai atribut yang berbeda-beda

### Keyword `this`

```java
this.merek = merek;  // this merujuk ke atribut object, merek adalah parameter
```

- Merujuk ke object saat ini
- Membedakan atribut dengan parameter yang namanya sama

---

## 📝 Struktur Class Mobil

```java
public class Mobil {
    // ATRIBUT - Data yang dimiliki Mobil
    String merek;
    String warna;
    int tahun;

    // KONSTRUKTOR - Inisialisasi object
    public Mobil(String merek, String warna, int tahun) {
        this.merek = merek;    // Set atribut merek dengan parameter merek
        this.warna = warna;
        this.tahun = tahun;
    }

    // METHOD - Perilaku/action yang bisa dilakukan Mobil
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }

    public void ubahWarna(String warnaBaru) {
        this.warna = warnaBaru;
        System.out.println("Warna berubah menjadi: " + warna);
    }
}
```

---

## 💻 Contoh Penggunaan

```java
public class MainMobil {
    public static void main(String[] args) {
        // Membuat object mobil1
        Mobil mobil1 = new Mobil("Toyota", "Merah", 2020);

        // Membuat object mobil2
        Mobil mobil2 = new Mobil("Honda", "Biru", 2021);

        // Mengakses method dari object
        System.out.println("=== Mobil 1 ===");
        mobil1.tampilkanInfo();

        System.out.println("\n=== Mobil 2 ===");
        mobil2.tampilkanInfo();

        // Mengubah warna mobil1
        System.out.println("\n=== Perubahan ===");
        mobil1.ubahWarna("Hitam");

        // Setiap object memiliki data sendiri
        System.out.println("\n=== Status Akhir ===");
        System.out.println("Mobil 1 warna: " + mobil1.warna);  // Hitam
        System.out.println("Mobil 2 warna: " + mobil2.warna);  // Biru (tidak berubah)
    }
}
```

**Output:**

```
=== Mobil 1 ===
Merek: Toyota
Warna: Merah
Tahun: 2020

=== Mobil 2 ===
Merek: Honda
Warna: Biru
Tahun: 2021

=== Perubahan ===
Warna berubah menjadi: Hitam

=== Status Akhir ===
Mobil 1 warna: Hitam
Mobil 2 warna: Biru (tidak berubah)
```

---

## 🎨 Perbedaan Class vs Object

| Aspek         | Class                       | Object                     |
| ------------- | --------------------------- | -------------------------- |
| **Definisi**  | Blueprint/Template          | Instance konkret           |
| **Jumlah**    | Satu per definisi           | Bisa banyak                |
| **Memory**    | Tidak alokasi memory        | Alokasi memory saat dibuat |
| **Contoh**    | Blueprints mobil            | Mobil Toyota spesifik      |
| **Deklarasi** | Satu kali saat menulis code | Berkali-kali saat eksekusi |

---

## 📝 Praktik & Latihan

### 1. Membuat Class Sederhana

- Buat class dengan minimal 3 atribut
- Buat konstruktor untuk inisialisasi
- Buat minimal 2 method

### 2. Instansiasi Multiple Objects

- Buat 3-5 object dari class yang sama
- Set atribut berbeda untuk setiap object
- Panggil method pada setiap object

### 3. Modifikasi State Object

- Buat method untuk mengubah atribut
- Panggil method tersebut untuk memodifikasi object
- Lihat bagaimana setiap object tetap independen

### 4. Eksperimen dengan Konstruktor

- Buat beberapa object dengan parameter berbeda
- Lihat bagaimana setiap object diinisialisasi berbeda

---

## 💡 Tips Penting

1. **Nama Class**: Capitalized, PascalCase (MobilBagus, bukan mobilbagus)
2. **Nama File**: Harus sama dengan public class
3. **Konstruktor**: Nama harus persis sama dengan nama class
4. **this keyword**: Selalu gunakan untuk membedakan atribut dengan parameter
5. **Konsistensi**: Atribut sebaiknya private (akan dipelajari di W4 tentang Enkapsulasi)

---

## 🚀 Persiapan untuk Pertemuan Berikutnya

Di W3 akan mempelajari **Method Overloading** dan **Constructor Overloading**:

- Membuat beberapa konstruktor berbeda
- Membuat method dengan nama sama tapi parameter berbeda
- Polimorfisme

---

## 📖 Referensi

- [Oracle Java OOP Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/index.html)
- [GeeksforGeeks - Class and Objects](https://www.geeksforgeeks.org/classes-objects-java/)
