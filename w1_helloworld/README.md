# Pertemuan 1: Hello World (W1)

## 📌 Ringkasan

Pertemuan ini memperkenalkan mahasiswa pada struktur dasar program Java dan cara menjalankan program pertama mereka.

**File:** `HelloWorld.java`

---

## 📚 Topik Pembelajaran

- Pengenalan bahasa pemrograman Java
- Struktur dasar program Java
- Class dan method main
- Statement output (System.out.println)
- Konsep kompilasi dan eksekusi

---

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan pertemuan ini, mahasiswa dapat:

1. Memahami struktur dasar program Java
2. Membuat dan menjalankan program Java sederhana
3. Menggunakan method println untuk output
4. Memahami konsep package dan class
5. Melakukan kompilasi dan eksekusi program Java

---

## 🔑 Konsep Kunci

### Public Class

```java
public class HelloWorld {
    // Class declaration
}
```

- `public`: Dapat diakses dari luar package
- `class`: Keyword untuk deklarasi class
- Nama file harus sama dengan nama class

### Method Main

```java
public static void main(String[] args) {
    // Entry point program
}
```

- `public`: Dapat diakses dari mana saja
- `static`: Bisa dijalankan tanpa membuat object
- `void`: Method tidak mengembalikan nilai
- `main`: Nama method yang selalu dijalankan pertama kali

### System.out.println()

```java
System.out.println("Hello World");
```

- `System`: Class Java bawaan
- `out`: Object untuk output ke console
- `println()`: Method untuk print dengan newline

---

## 📝 Praktik & Latihan

### 1. Membuat Program Hello World

- Buat file baru dengan nama `HelloWorld.java`
- Ketik struktur dasar class dan method main
- Print pesan "Hello World"

### 2. Variasi Output

- Coba print berbagai pesan
- Gunakan multiple println statements
- Experiment dengan escape characters seperti `\n`, `\t`

### 3. Kompilasi dan Eksekusi

- Kompilasi file Java: `javac HelloWorld.java`
- Jalankan: `java HelloWorld`
- Lihat output di console

---

## 💡 Tips Penting

1. **Nama File dan Class**: Nama file harus persis sama dengan nama public class
2. **Case Sensitive**: Java membedakan huruf besar dan kecil
3. **Main Method**: Harus `public static void main(String[] args)` - jangan ada yang berbeda
4. **Titik Koma**: Setiap statement harus diakhiri dengan semicolon (`;`)
5. **Indentasi**: Gunakan indentasi yang konsisten untuk readability

---

## 🚀 Persiapan untuk Pertemuan Berikutnya

Pahami konsep:

- Class vs Object (akan dipelajari di W2)
- Atribut dan method (akan dipelajari di W2)
- Parameter method (akan dipelajari di W2)

---

## 📖 Referensi

- [Oracle Java Basics](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)
- [GeeksforGeeks - First Java Program](https://www.geeksforgeeks.org/beginning-java-programming-with-hello-world-example/)
