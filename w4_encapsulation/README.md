# Pertemuan 4: Enkapsulasi (W4)

## 📌 Ringkasan

Pertemuan ini memperkenalkan prinsip enkapsulasi yang merupakan fondasi penting dalam OOP untuk melindungi integritas data dan mengontrol akses ke object.

**Files:** `Kinetik.java`, `Warung.java`, `MainKinetik.java`

---

## 📚 Topik Pembelajaran

- Prinsip Enkapsulasi (Encapsulation)
- Access Modifiers (private, public)
- Getter Methods (Accessor)
- Setter Methods (Mutator)
- Data Hiding
- Controlled Access to Object State
- Validasi Data dalam Setter
- Single Responsibility Principle

---

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan pertemuan ini, mahasiswa dapat:

1. Memahami konsep enkapsulasi dan pentingnya data hiding
2. Menggunakan access modifiers untuk mengontrol akses ke atribut
3. Membuat getter dan setter methods yang baik
4. Melindungi integritas data object
5. Menerapkan validasi dalam setter methods
6. Mendesain class yang professional dengan enkapsulasi
7. Membedakan antara implementation dan interface

---

## 🔑 Konsep Kunci

### Enkapsulasi (Encapsulation)

**Definisi:** Mekanisme menyembunyikan detail internal class dan hanya mengekspos interface publik yang diperlukan.

**Tujuan:**

- Melindungi data dari akses dan modifikasi tidak sah
- Menjaga invariant (aturan) class
- Memudahkan maintenance dan perubahan internal

### Access Modifiers

| Modifier  | Akses dari Luar Class | Kegunaan                       |
| --------- | --------------------- | ------------------------------ |
| `private` | ❌ Tidak              | Menyembunyikan detail internal |
| `public`  | ✅ Ya                 | Mengekspos interface yang aman |
| (default) | Hanya dalam package   | Jarang digunakan untuk field   |

### Getter Method (Accessor)

```java
// GETTER - Hanya membaca, tidak bisa mengubah
private double massa;

public double getMassa() {
    return massa;
}
```

- Memberikan read-only access
- Nama convention: `get` + NamaAtribut
- Bisa menambah logika sebelum return jika perlu

### Setter Method (Mutator)

```java
// SETTER - Bisa mengubah dengan kontrol
private double massa;

public void setMassa(double massa) {
    // Validasi sebelum set
    if (massa > 0) {
        this.massa = massa;
    }
}
```

- Memberikan write-access dengan kontrol
- Nama convention: `set` + NamaAtribut
- **HARUS ada validasi** untuk melindungi data
- Bisa menambah logika sebelum menyimpan

### Data Hiding

```java
// ❌ BURUK - Public direct access (Data tidak terlindungi)
public class BurukWarung {
    public double uang;
}
warung.uang = -1000;  // Tidak ada yang cegah nilai negatif!

// ✅ BAIK - Private + getter/setter (Data terlindungi)
public class BaikWarung {
    private double uang;

    public void setUang(double uang) {
        if (uang >= 0) {  // Validasi
            this.uang = uang;
        }
    }
}
```

---

## 📝 Contoh 1: Class Kinetik

Class untuk menghitung energi kinetik dengan enkapsulasi penuh:

```java
public class Kinetik {
    // ATRIBUT PRIVATE - Tersembunyi dari luar
    private double massa;
    private double kecepatan;
    private double energiKinetik;

    // GETTER untuk massa
    public double getMassa() {
        return massa;
    }

    // SETTER untuk massa - dengan validasi
    public void setMassa(double massa) {
        if (massa > 0) {  // ✓ Validasi: massa harus positif
            this.massa = massa;
        } else {
            System.out.println("Error: Massa harus positif!");
        }
    }

    // GETTER untuk kecepatan
    public double getKecepatan() {
        return kecepatan;
    }

    // SETTER untuk kecepatan - dengan validasi
    public void setKecepatan(double kecepatan) {
        if (kecepatan >= 0) {  // ✓ Validasi: kecepatan harus >= 0
            this.kecepatan = kecepatan;
        } else {
            System.out.println("Error: Kecepatan tidak boleh negatif!");
        }
    }

    // GETTER untuk energi kinetik (read-only)
    public double getEnergiKinetik() {
        return energiKinetik;
    }

    // METHOD untuk menghitung energi kinetik
    // Rumus Fisika: EK = 0.5 × m × v²
    public double hitung() {
        this.energiKinetik = 0.5 * this.massa * Math.pow(this.kecepatan, 2);
        return energiKinetik;
    }

    // Untuk debugging/testing
    public void tampilkan() {
        System.out.println("Massa: " + massa + " kg");
        System.out.println("Kecepatan: " + kecepatan + " m/s");
        System.out.println("Energi Kinetik: " + energiKinetik + " Joule");
    }
}
```

### Keuntungan Enkapsulasi pada Kinetik

- **Massa tidak boleh negatif** ← Divalidasi di setter
- **Kecepatan tidak boleh negatif** ← Divalidasi di setter
- **Energi kinetik selalu konsisten** ← Hanya bisa diubah via method hitung()
- **Perubahan internal tidak berdampak** ← Kalau rumus berubah, user code tidak perlu berubah

---

## 📝 Contoh 2: Class Warung

Class sederhana untuk menu warung:

```java
public class Warung {
    // ATRIBUT PRIVATE
    private String makanan;
    private String minuman;

    // GETTER untuk makanan
    public String getMakanan() {
        return makanan;
    }

    // SETTER untuk makanan
    public void setMakanan(String makanan) {
        if (makanan != null && !makanan.isEmpty()) {
            this.makanan = makanan;
        }
    }

    // GETTER untuk minuman
    public String getMinuman() {
        return minuman;
    }

    // SETTER untuk minuman
    public void setMinuman(String minuman) {
        if (minuman != null && !minuman.isEmpty()) {
            this.minuman = minuman;
        }
    }

    // METHOD untuk menampilkan pesanan
    public void tampilkanPesanan() {
        System.out.println("Pesanan: " + makanan + " dan " + minuman);
    }
}
```

### Penggunaan Class Warung

```java
public class MainWarung {
    public static void main(String[] args) {
        Warung warung = new Warung();

        // Menggunakan setter
        warung.setMakanan("Bakso Beranak");
        warung.setMinuman("Es Teh Manis");

        // Menggunakan getter
        System.out.println("Makanan: " + warung.getMakanan());
        System.out.println("Minuman: " + warung.getMinuman());

        // Memanggil method
        warung.tampilkanPesanan();
        // Output: Pesanan: Bakso Beranak dan Es Teh Manis
    }
}
```

---

## 💻 Contoh 3: MainKinetik - Program Interaktif

Program untuk menghitung energi kinetik:

```java
import java.util.Scanner;

public class MainKinetik {
    public static void main(String[] args) {
        Kinetik ek = new Kinetik();
        Scanner sc = new Scanner(System.in);

        // Input massa melalui setter
        System.out.print("Masukkan massa (kg) = ");
        double inputMassa = sc.nextDouble();
        ek.setMassa(inputMassa);

        // Input kecepatan melalui setter
        System.out.print("Masukkan kecepatan (m/s) = ");
        double inputKecepatan = sc.nextDouble();
        ek.setKecepatan(inputKecepatan);

        sc.close();

        // Hitung energi kinetik
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Energi Kinetik: " + ek.hitung() + " Joule");

        // Tampilkan detail
        ek.tampilkan();
    }
}
```

**Contoh Eksekusi:**

```
Masukkan massa (kg) = 5
Masukkan kecepatan (m/s) = 10

=== HASIL PERHITUNGAN ===
Energi Kinetik: 250.0 Joule
Massa: 5.0 kg
Kecepatan: 10.0 m/s
Energi Kinetik: 250.0 Joule
```

---

## 🎨 Perbandingan: Dengan vs Tanpa Enkapsulasi

### ❌ TANPA ENKAPSULASI (BAD PRACTICE)

```java
public class BurukWarung {
    public double uang;  // PUBLIC - Siapa saja bisa akses!
}

// Dalam main()
BurukWarung warung = new BurukWarung();
warung.uang = 1000;      // OK
warung.uang = -1000;     // ERROR! Nilai negatif tapi tidak ada yang cegah
warung.uang = 0;         // Bisa di-set ke 0 tanpa kontrol
```

**Masalah:**

- Data tidak terlindungi
- Nilai invalid bisa langsung masuk (misal negatif)
- Tidak ada validasi
- Sulit di-maintain jika perlu perubahan

### ✅ DENGAN ENKAPSULASI (GOOD PRACTICE)

```java
public class BaikWarung {
    private double uang;  // PRIVATE - Hanya bisa diakses via getter/setter

    public void setUang(double uang) {
        // VALIDASI - Cegah nilai yang tidak valid
        if (uang >= 0) {
            this.uang = uang;
        } else {
            System.out.println("ERROR: Uang tidak boleh negatif!");
        }
    }

    public double getUang() {
        return uang;
    }
}

// Dalam main()
BaikWarung warung = new BaikWarung();
warung.setUang(1000);      // OK
warung.setUang(-1000);     // ERROR: tidak diset karena ada validasi
warung.setUang(0);         // OK karena >= 0
```

**Keuntungan:**

- Data terlindungi dengan validasi
- Nilai invalid tidak bisa masuk
- Mudah di-maintain dan di-perbarui
- User hanya perlu tahu interface publik

---

## 🏗️ Prinsip Enkapsulasi yang Baik

### 1. Deklarasikan Atribut sebagai PRIVATE

```java
private double massa;  // ✓
private String nama;   // ✓
```

### 2. Sediakan PUBLIC Getter dan Setter

```java
public double getMassa() { return massa; }
public void setMassa(double m) { this.massa = m; }
```

### 3. Validasi Data dalam Setter

```java
public void setMassa(double m) {
    if (m > 0) {
        this.massa = m;  // ✓ Set hanya jika valid
    } else {
        System.out.println("Invalid!");  // ✗ Reject jika invalid
    }
}
```

### 4. Jaga Konsistensi State Object

```java
// Jika ada computed field
public double hitung() {
    this.energiKinetik = 0.5 * massa * Math.pow(kecepatan, 2);
    return energiKinetik;
}
```

### 5. Sembunyikan Implementasi Internal

```java
// User tidak perlu tahu bagaimana implementasi internal
public double getEnergiKinetik() {
    return energiKinetik;  // Return hasil tanpa kode perhitungan
}
```

---

## 📊 Tabel Perbandingan Access Modifiers

| Aspek                     | `public`                | `private`                     |
| ------------------------- | ----------------------- | ----------------------------- |
| **Akses dari luar class** | ✅ Ya                   | ❌ Tidak                      |
| **Digunakan untuk**       | Interface, API publik   | Data internal, helper methods |
| **Atribut**               | Jarang (buruk practice) | Hampir selalu untuk field     |
| **Method**                | Sering untuk API publik | Sering untuk helper methods   |
| **Keamanan**              | Rendah                  | Tinggi                        |
| **Kontrol**               | Tidak ada               | Ada melalui getter/setter     |

---

## 💡 Validasi Setter - Contoh Praktis

```java
// Validasi tipe numeric
public void setUsia(int usia) {
    if (usia >= 0 && usia <= 120) {
        this.usia = usia;
    }
}

// Validasi string
public void setNama(String nama) {
    if (nama != null && !nama.isEmpty()) {
        this.nama = nama;
    }
}

// Validasi range
public void setNilai(double nilai) {
    if (nilai >= 0 && nilai <= 100) {
        this.nilai = nilai;
    }
}

// Validasi not null
public void setAlamat(String alamat) {
    if (alamat != null) {
        this.alamat = alamat;
    }
}
```

---

## 📝 Praktik & Latihan

### 1. Enkapsulasi Class Sederhana

- Buat class dengan 3-4 atribut
- Buat semua atribut private
- Buat getter dan setter untuk setiap atribut
- Tambahkan validasi di setter

### 2. Validasi Data

- Atribut numeric: validasi range
- Atribut string: validasi tidak kosong
- Test dengan nilai yang valid dan invalid

### 3. Refactor Existing Code

- Ambil class dari W2 atau W3
- Ubah atribut menjadi private
- Tambahkan getter/setter
- Perbarui penggunaan di main

### 4. Create Computed Properties

- Buat atribut yang dihitung dari atribut lain
- Sediakan getter untuk atribut computed
- Jangan sediakan setter (read-only)

---

## ⚠️ Hal-Hal yang Perlu Dihindari

```java
// ❌ JANGAN: Public atribut langsung
public class Buruk {
    public double uang;  // TIDAK AMAN
}

// ❌ JANGAN: Setter tanpa validasi
public void setUang(double u) {
    this.uang = u;  // Bisa negatif!
}

// ❌ JANGAN: Hanya getter tanpa setter (untuk data yang mutable)
// (Ini OK untuk read-only computed fields)

// ❌ JANGAN: Setter yang mengubah object lain
public void setData(String s) {
    this.data = s;
    otherObject.data = s;  // Side effect berbahaya!
}
```

---

## 🚀 Persiapan untuk Pertemuan Berikutnya

Di W5 akan mempelajari **Array of Objects**:

- Membuat array dari object
- Manipulasi multiple objects dalam array
- Iterasi dan processing

---

## 📖 Referensi

- [Oracle Encapsulation](https://docs.oracle.com/javase/tutorial/java/concepts/object.html)
- [GeeksforGeeks - Encapsulation](https://www.geeksforgeeks.org/encapsulation-in-java/)
- [Tutorialspoint - Encapsulation](https://www.tutorialspoint.com/java/java_encapsulation.htm)
