# Pemrograman Berorientasi Objek (PBO)

## Program Studi Teknik Informatika

**Dosen:** Saiful NB  
**IDE:** NetBeans 29  
**JDK Version:** JDK 25  
**Bahasa Pemrograman:** Java

---

## 📋 Daftar Pertemuan

Kelas Pemrograman Berorientasi Objek ini dirancang untuk memberikan pemahaman mendalam tentang konsep-konsep fundamental OOP dalam Java. Berikut adalah materi yang disajikan dalam setiap pertemuan:

### ✨ Pertemuan 1: Hello World (W1)

**File:** `w1_helloworld/HelloWorld.java`

#### Topik:

- Pengenalan bahasa pemrograman Java
- Struktur dasar program Java
- Class dan method main
- Statement output (System.out.println)
- Konsep kompilasi dan eksekusi

#### Tujuan Pembelajaran:

Mahasiswa dapat:

1. Memahami struktur dasar program Java
2. Membuat dan menjalankan program Java sederhana
3. Menggunakan method println untuk output
4. Memahami konsep package dan class

#### Konsep Kunci:

```
- public class: Deklarasi class yang dapat diakses dari luar
- public static void main(String[] args): Titik awal program
- System.out.println(): Method untuk menampilkan output ke konsol
```

#### Praktik:

- Membuat program Hello World pertama
- Memahami pesan keluaran program
- Menjalankan program dari IDE NetBeans

---

### 🔧 Pertemuan 2: Instansiasi Objek (W2)

**File:** `w2_instansiasi/Mobil.java`

#### Topik:

- Pengenalan Objek dan Kelas
- Atribut (Properties/Variables)
- Method (Behavior/Functions)
- Konstruktor
- Instansiasi Objek
- Encapsulation

#### Tujuan Pembelajaran:

Mahasiswa dapat:

1. Memahami perbedaan antara class dan object
2. Mendeklarasikan atribut dan method dalam class
3. Membuat konstruktor dengan parameter
4. Membuat instance dari suatu class
5. Mengakses atribut dan memanggil method dari object

#### Konsep Kunci:

```
- Class: Blueprint atau template untuk membuat object
- Object: Instance/wujud konkret dari sebuah class
- Atribut: Data/state yang dimiliki object
- Method: Perilaku/action yang dapat dilakukan object
- Konstruktor: Method khusus untuk inisialisasi object
- new Keyword: Digunakan untuk membuat instance object
```

#### Struktur Class Mobil:

```java
public class Mobil {
    // Atribut
    String merek;
    String warna;
    int tahun;

    // Konstruktor
    public Mobil(String merek, String warna, int tahun) {
        this.merek = merek;
        this.warna = warna;
        this.tahun = tahun;
    }

    // Method
    public void tampilkanInfo() {
        // implementasi
    }
}
```

#### Praktik:

- Merancang class dengan atribut dan method
- Membuat konstruktor untuk inisialisasi
- Membuat multiple objects dari class yang sama
- Mengakses dan memanipulasi data object

---

### ⚡ Pertemuan 3: Overloading (W3)

**File:** `w3_overloading/Exponential.java`

#### Topik:

- Konsep Overloading
- Method Overloading (Polimorfisme)
- Constructor Overloading
- Tipe Parameter yang Berbeda
- Return Type yang Berbeda

#### Tujuan Pembelajaran:

Mahasiswa dapat:

1. Memahami konsep overloading dalam Java
2. Membuat multiple method dengan nama sama tapi parameter berbeda
3. Menerapkan constructor overloading
4. Memahami method resolution dalam overloading
5. Menggunakan overloading untuk membuat API yang flexible

#### Konsep Kunci:

```
- Overloading: Memiliki lebih dari satu method dengan nama yang sama
  tetapi signature yang berbeda
- Signature: Kombinasi dari nama method dan parameter list
- Method Resolution: Proses untuk menentukan method mana yang dipanggil
- Parameter dapat berbeda dalam:
  * Jumlah parameter
  * Tipe data parameter
  * Urutan parameter
```

#### Contoh Overloading pada Exponential:

```java
// Constructor Overloading
public Exponential() { }
public Exponential(double base) { }
public Exponential(double base, int exponent) { }

// Method Overloading
public double calculate(int exponent) { }
public double calculate(double base, int exponent) { }
public double calculate(double base, double exponent) { }
```

#### Keuntungan Overloading:

- **Readability**: Nama method yang sama lebih mudah diingat
- **Flexibility**: Memungkinkan berbagai cara memanggil method
- **Consistency**: Interface yang konsisten untuk operasi yang mirip
- **Reusability**: Kode yang lebih reusable dan maintainable

#### Praktik:

- Mengidentifikasi kapan menggunakan overloading
- Membuat method dengan berbagai parameter
- Memahami error message saat terjadi ambiguity
- Menggunakan overloading untuk operator seperti +, -, \*, /

---

## 🎯 Capaian Pembelajaran (Learning Outcomes)

Setelah menyelesaikan 3 pertemuan pertama, mahasiswa diharapkan dapat:

1. **Conceptual Understanding**
   - Memahami paradigma pemrograman berorientasi objek
   - Membedakan antara class, object, attribute, dan method
   - Mengerti prinsip encapsulation

2. **Practical Skills**
   - Menulis program Java yang terstruktur dengan baik
   - Mendesain class yang sederhana namun efektif
   - Menggunakan overloading untuk meningkatkan fleksibilitas code
   - Menggunakan NetBeans IDE secara efisien

3. **Problem Solving**
   - Menganalisis kebutuhan dan merancang class solution
   - Debugging program Java
   - Menulis clean code yang mudah dipahami

---

## 📚 Materi Lanjutan (Coming Soon)

Pertemuan-pertemuan berikutnya akan mencakup:

- **W4**: Encapsulation (Enkapsulasi)
- **W5**: Polymorphism (Polimorfisme)
- **W6**: Access Modifiers
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

**Last Updated:** April 2026  
**Version:** 1.0

---

_Dokumen ini akan diperbarui seiring dengan progres pembelajaran di kelas._
