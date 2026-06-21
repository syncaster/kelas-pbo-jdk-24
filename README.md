# Pemrograman Berorientasi Objek (PBO)

## Program Studi Teknik Informatika

**Dosen:** Saiful NB  
**IDE:** NetBeans 29  
**JDK Version:** JDK 25  
**Bahasa Pemrograman:** Java

---

## 📋 Ringkasan Singkat Materi (W1 - W14)

Kelas Pemrograman Berorientasi Objek ini dirancang untuk memberikan pemahaman mendalam tentang konsep-konsep fundamental OOP dalam Java.

**Untuk detail lengkap setiap pertemuan, silakan buka README.md di folder masing-masing.**

---

## 📚 Daftar Materi

| #   | Minggu | Topik               | Pokok Bahasan                                                         | File Utama                                             |
| --- | ------ | ------------------- | --------------------------------------------------------------------- | ------------------------------------------------------ |
| 1   | W1     | Hello World         | Struktur dasar Java, class, method main, output                       | `HelloWorld.java`                                      |
| 2   | W2     | Instansiasi Objek   | Class, object, atribut, method, konstruktor, keyword `new`            | `Mobil.java`                                           |
| 3   | W3     | Overloading         | Method overloading, constructor overloading, polimorfisme             | `Exponential.java`                                     |
| 4   | W4     | Enkapsulasi         | Access modifiers (private/public), getter/setter, data hiding         | `Kinetik.java`                                         |
| 5   | W5     | Array of Object     | Array berisi object, deklarasi dan inisialisasi                       | `Laptop.java`, `MainLaptop.java`                       |
| 6   | W6     | Inheritance Part 1  | Konsep inheritance, parent-child class, keyword `extends`, super()    | `Mamalia.java`, `Sapi.java`                            |
| 7   | W7     | Inheritance Part 2  | Multi-level inheritance, interface, implementasi interface            | `MainMamalia.java`, `MainHitung.java`                  |
| 8   | W8     | Method Overriding   | Override method dari parent, dynamic binding, late binding            | `Ayah.java`, `Anak.java`                               |
| 9   | W9     | Final Keyword       | Final class, final method, final variable, immutability               | `PenggunaanFinalClass.java`                            |
| 10  | W10    | Static Keyword      | Static method, static variable, class member vs instance member       | `MethodStatic.java`, `Buku.java`                       |
| 11  | W11    | Polymorphism Part 1 | Dynamic binding, static binding, upcasting, compile-time polymorphism | `ContohStaicBinding.java`, `ContohDynamicBinding.java` |
| 12  | W12    | Polymorphism Part 2 | Downcasting, instanceof, type casting, runtime polymorphism           | `TestDownCasting.java`, `TestAnimal.java`              |
| 13  | W13    | Abstract Class      | Abstract class, abstract method, implementasi abstract                | `Hewan.java`, `Pegawai.java`                           |
| 14  | W14    | JDBC                | Database connection, SQL query, Statement, PreparedStatement          | `DBConnection.java`, `DemoStatement.java`              |

---

## 🎯 Ringkasan Konsep Utama

### Fase 1: Fundamental (W1-W2)

- Struktur program Java dan konsep dasar OOP
- Class, object, atribut, method, konstruktor

### Fase 2: Core OOP (W3-W5)

- Overloading untuk fleksibilitas method
- Enkapsulasi untuk data protection
- Koleksi object dalam array

### Fase 3: Inheritance & Reusability (W6-W7)

- Inheritance untuk code reuse
- Hierarchi class dan interface implementation
- Multi-level inheritance

### Fase 4: Advanced OOP (W8-W13)

- Method Overriding untuk behavior customization
- Static & Final untuk control dan optimization
- Polymorphism (compile-time & runtime)
- Abstract class untuk abstraksi

### Fase 5: Database Integration (W14)

- JDBC untuk koneksi database
- Eksekusi query dan data manipulation

---

## 🚀 Quick Start

Setiap folder minggu berisi:

- **Source code** dengan contoh implementasi
- **README.md** dengan penjelasan detail
- **Main class** untuk menjalankan program

Untuk menjalankan program:

```bash
javac NamaFile.java
java NamaFile
```

---

        // Input kecepatan melalui setter
        System.out.print("Masukkan kecepatan = ");
        ek.setKecepatan(sc.nextDouble());

        sc.close();

        // Hitung dan tampilkan hasil
        System.out.println("Energi Kinetiknya: " + ek.hitung());
    }

}

````

**Penjelasan:**

- Menggunakan setter untuk mengubah nilai massa dan kecepatan
- Memanggil method `hitung()` untuk menghitung energi kinetik
- Getter bisa digunakan untuk mengambil nilai jika diperlukan

#### Keuntungan Enkapsulasi:

1. **Data Protection**: Atribut tidak bisa diubah sembarangan dari luar
2. **Validation**: Bisa menambah validasi dalam setter sebelum menyimpan data
3. **Flexibility**: Perubahan internal implementation tidak mempengaruhi code yang menggunakan class
4. **Maintainability**: Lebih mudah di-maintain dan debug
5. **Reusability**: Class yang well-encapsulated lebih mudah digunakan ulang
6. **Security**: Mencegah akses dan modifikasi tidak sah pada data internal

#### Perbandingan: Dengan vs Tanpa Enkapsulasi

**❌ Tanpa Enkapsulasi (BURUK):**

```java
public class BurukWarung {
    public double uang;  // Public - bisa diubah siapa saja!

    // Kode lain boleh mengubah langsung:
    // buruk.uang = -1000;  // Nilai negatif (tidak logis!)
}
````

**✅ Dengan Enkapsulasi (BAIK):**

```java
public class BaikWarung {
    private double uang;  // Private - terlindungi

    public void setUang(double uang) {
        // Bisa validasi di sini
        if (uang >= 0) {
            this.uang = uang;
        }
    }

    public double getUang() {
        return uang;
    }
    // Tidak mungkin set uang negatif karena ada validasi!
}
```

#### Praktik:

- Membuat class dengan atribut private
- Mengimplementasi getter dan setter methods
- Menambah validasi dalam setter
- Memahami kapan menggunakan public vs private
- Menerapkan enkapsulasi dalam mini-project sendiri

---

## 🎯 Capaian Pembelajaran (Learning Outcomes)

Setelah menyelesaikan 4 pertemuan pertama, mahasiswa diharapkan dapat:

1. **Conceptual Understanding**
   - Memahami paradigma pemrograman berorientasi objek
   - Membedakan antara class, object, attribute, dan method
   - Mengerti prinsip encapsulation dan data hiding
   - Memahami access modifiers dan kontrol akses

2. **Practical Skills**
   - Menulis program Java yang terstruktur dengan baik
   - Mendesain class yang sederhana namun efektif
   - Menggunakan overloading untuk meningkatkan fleksibilitas code
   - Menerapkan enkapsulasi dengan getter dan setter methods
   - Menggunakan NetBeans IDE secara efisien

3. **Problem Solving**
   - Menganalisis kebutuhan dan merancang class solution
   - Debugging program Java
   - Menulis clean code yang mudah dipahami
   - Melindungi integritas data object

---

## 📚 Materi Lanjutan (Coming Soon)

Pertemuan-pertemuan berikutnya akan mencakup:

- **W5**: Polymorphism (Polimorfisme)
- **W6**: Access Modifiers (Advanced)
- **W7**: Abstract Class & Interface
- **W8**: Exception Handling
- Dan materi-materi lanjutan lainnya...

---

## 🛠️ Setup & Configuration

### Sistem Operasi

- **OS:** Linux

### Tools & Version

- **IDE:** NetBeans 29
- **JDK:** Java 25
- **Language:** Java

### Struktur Project

```
kelas-pbo-jdk-24/
├── w1_helloworld/
│   └── HelloWorld.java
├── w2_instansiasi/
│   └── Mobil.java
├── w3_overloading/
│   └── Exponential.java
├── w4_encapsulation/
│   ├── Kinetik.java
│   ├── Warung.java
│   └── MainKinetik.java
└── README.md
```

---

## 📖 Referensi & Resource

### Documentation

- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Java Language Specification](https://docs.oracle.com/javase/specs/)
- [NetBeans Documentation](https://netbeans.apache.org/tutorials/)

### Buku Rekomendasi

- "Head First Java" - Kathy Sierra & Bert Bates
- "Effective Java" - Joshua Bloch
- "Clean Code" - Robert C. Martin

### Online Resources

- [GeeksforGeeks - Java OOP](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- [Tutorialspoint - Java OOP](https://www.tutorialspoint.com/java/java_object_oriented.htm)
- [W3Schools - Java Tutorial](https://www.w3schools.com/java/)

---

## ✅ Penilaian & Evaluasi

### Kriteria Penilaian

- **Pemahaman Konsep** (40%): Kedalaman pemahaman tentang OOP
- **Implementasi Code** (40%): Kualitas, cleanliness, dan functionality
- **Dokumentasi** (10%): Penjelasan code dan documentation
- **Partisipasi & Kehadiran** (10%): Aktivitas di kelas

### Komponen Penilaian

- Assignments/Tugas Mingguan
- Quizzes
- Midterm Project
- Final Exam

---

## 📝 Catatan Penting

1. **Best Practices**
   - Selalu gunakan meaningful names untuk variables dan methods
   - Gunakan comments untuk menjelaskan logic yang kompleks
   - Follow Java naming conventions (camelCase untuk variables/methods)
   - Jaga code tetap clean dan readable

2. **Common Mistakes untuk Dihindari**
   - Lupa menginisialisasi objects sebelum menggunakannya
   - Menggunakan public untuk semua attributes (violate encapsulation)
   - Overloading yang tidak perlu yang menambah kompleksitas
   - Tidak mengikuti style guidelines

3. **Tips untuk Sukses**
   - Praktik secara konsisten, bukan hanya teori
   - Buat mini-project untuk setiap topik
   - Code review dengan teman untuk feedback
   - Jangan takut membuat kesalahan, itu bagian dari belajar

---

## 📧 Kontak & Support

**Dosen:** Saiful NB  
**Program Studi:** Teknik Informatika  
**Email:** [email dosen]  
**Office Hours:** [waktu tersedia]

---

**Last Updated:** April 25, 2026  
**Version:** 1.1

---

_Dokumen ini akan diperbarui seiring dengan progres pembelajaran di kelas._
