# Pertemuan 5: Array of Objects (W5)

## 📌 Ringkasan

Pertemuan ini mempelajari cara menggunakan array untuk menyimpan multiple object dari class yang sama dan memanipulasinya secara kolektif.

**Files:** `Laptop.java`, `MainLaptop.java`, `PenggunaanArray.java`

---

## 📚 Topik Pembelajaran

- Array Basics
- Deklarasi Array of Objects
- Inisialisasi Array of Objects
- Akses Element dalam Array
- Iterasi Array dengan Loop
- Manipulasi Object dalam Array
- Practical Applications
- Array Searching dan Sorting Concept

---

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan pertemuan ini, mahasiswa dapat:

1. Membuat dan mendeklarasikan array of objects
2. Menginisialisasi array dengan object instances
3. Mengakses element dan atribut dalam array
4. Memanipulasi object di dalam array
5. Menggunakan loop untuk memproses array
6. Menerapkan array dalam aplikasi praktis
7. Memahami memory allocation untuk array of objects

---

## 🔑 Konsep Kunci

### Array of Objects vs Array of Primitives

```java
// Array of Primitives
int[] angka = new int[5];        // Array berisi nilai int
angka[0] = 10;                   // Langsung set nilai

// Array of Objects
Laptop[] laptops = new Laptop[5]; // Array berisi reference ke object
// PENTING: Array dibuat, tapi object belum!

// Harus buat object untuk setiap element
laptops[0] = new Laptop("Dell", "Intel i7", 8);
laptops[1] = new Laptop("HP", "Intel i5", 16);
```

### Deklarasi Array of Objects

```java
// Syntax: TipeClass[] namaArray = new TipeClass[ukuran];

Laptop[] laptops = new Laptop[5];  // Array 5 Laptop objects
Mobil[] mobils = new Mobil[10];    // Array 10 Mobil objects
String[] names = new String[20];   // Array 20 String objects
```

### Memory Layout

```
Array of 3 Laptops:

laptops (array reference)
   ↓
[index 0][index 1][index 2]  (references)
    ↓        ↓        ↓
  Laptop   Laptop   Laptop   (actual objects in memory)
```

---

## 📝 Contoh 1: Class Laptop

Class yang merepresentasikan laptop dengan enkapsulasi:

```java
public class Laptop {
    // ATRIBUT PRIVATE
    private String merek;
    private String processor;
    private int ram;  // dalam GB

    // CONSTRUCTOR
    public Laptop(String merek, String processor, int ram) {
        this.merek = merek;
        this.processor = processor;
        this.ram = ram;
    }

    // GETTER METHODS
    public String getMerek() {
        return merek;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    // SETTER METHODS
    public void setMerek(String merek) {
        if (merek != null && !merek.isEmpty()) {
            this.merek = merek;
        }
    }

    public void setProcessor(String processor) {
        if (processor != null && !processor.isEmpty()) {
            this.processor = processor;
        }
    }

    public void setRam(int ram) {
        if (ram > 0 && ram <= 128) {  // Validasi range
            this.ram = ram;
        }
    }

    // METHOD untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
    }

    // METHOD untuk info singkat
    public String infoSingkat() {
        return merek + " (" + processor + ", " + ram + "GB RAM)";
    }

    // METHOD untuk kalkulasi nilai (contoh: semakin bagus spec, semakin tinggi nilai)
    public int nilaiSpec() {
        int nilai = 0;

        // Nilai dari processor
        if (processor.contains("i9")) nilai += 100;
        else if (processor.contains("i7")) nilai += 80;
        else if (processor.contains("i5")) nilai += 60;
        else nilai += 40;

        // Nilai dari RAM
        if (ram >= 16) nilai += 50;
        else if (ram >= 8) nilai += 30;
        else nilai += 10;

        return nilai;
    }
}
```

---

## 💻 Contoh 2: MainLaptop - Basic Array Usage

Program dasar untuk menggunakan array of laptops:

```java
public class MainLaptop {
    public static void main(String[] args) {
        // DEKLARASI dan INISIALISASI array
        Laptop[] laptops = new Laptop[3];

        // Membuat objects dan menempatkannya di array
        laptops[0] = new Laptop("Dell", "Intel i7", 8);
        laptops[1] = new Laptop("HP", "Intel i5", 16);
        laptops[2] = new Laptop("Lenovo", "Intel i9", 32);

        // AKSES element array
        System.out.println("=== Info Laptop ===");

        // Akses individual element
        System.out.println("Laptop 1:");
        laptops[0].tampilkanInfo();

        System.out.println("\nLaptop 2:");
        laptops[1].tampilkanInfo();

        System.out.println("\nLaptop 3:");
        laptops[2].tampilkanInfo();

        // Mengakses atribut specific
        System.out.println("\n=== Akses Specific ===");
        System.out.println("Merek Laptop 1: " + laptops[0].getMerek());
        System.out.println("RAM Laptop 2: " + laptops[1].getRam() + " GB");
        System.out.println("Processor Laptop 3: " + laptops[2].getProcessor());
    }
}
```

**Output:**

```
=== Info Laptop ===
Laptop 1:
Merek: Dell
Processor: Intel i7
RAM: 8 GB

Laptop 2:
Merek: HP
Processor: Intel i5
RAM: 16 GB

Laptop 3:
Merek: Lenovo
Processor: Intel i9
RAM: 32 GB

=== Akses Specific ===
Merek Laptop 1: Dell
RAM Laptop 2: 16 GB
Processor Laptop 3: Intel i9
```

---

## 💻 Contoh 3: PenggunaanArray - Advanced Usage

Program advanced untuk manipulasi dan processing array:

```java
public class PenggunaanArray {
    public static void main(String[] args) {
        // DEKLARASI dan INISIALISASI
        Laptop[] laptops = new Laptop[5];

        // Set objects di array
        laptops[0] = new Laptop("Dell", "Intel i7", 8);
        laptops[1] = new Laptop("HP", "Intel i5", 16);
        laptops[2] = new Laptop("Lenovo", "Intel i9", 32);
        laptops[3] = new Laptop("ASUS", "Intel i7", 8);
        laptops[4] = new Laptop("Acer", "Intel i5", 16);

        // 1. ITERASI DENGAN FOR LOOP
        System.out.println("=== ITERASI DENGAN FOR LOOP ===");
        for (int i = 0; i < laptops.length; i++) {
            System.out.println((i+1) + ". " + laptops[i].infoSingkat());
        }

        // 2. ITERASI DENGAN ENHANCED FOR LOOP
        System.out.println("\n=== ITERASI DENGAN ENHANCED FOR LOOP ===");
        int no = 1;
        for (Laptop laptop : laptops) {
            System.out.println(no + ". " + laptop.infoSingkat());
            no++;
        }

        // 3. HITUNG TOTAL RAM
        System.out.println("\n=== HITUNG TOTAL RAM ===");
        int totalRam = 0;
        for (Laptop laptop : laptops) {
            totalRam += laptop.getRam();
        }
        System.out.println("Total RAM semua laptop: " + totalRam + " GB");
        System.out.println("Rata-rata RAM: " + (totalRam / laptops.length) + " GB");

        // 4. CARI LAPTOP DENGAN RAM TERTENTU
        System.out.println("\n=== CARI LAPTOP DENGAN RAM 16GB ===");
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getRam() == 16) {
                System.out.println((i+1) + ". " + laptops[i].infoSingkat());
            }
        }

        // 5. CARI LAPTOP DENGAN MEREK TERTENTU
        System.out.println("\n=== CARI LAPTOP MEREK DELL ===");
        for (Laptop laptop : laptops) {
            if (laptop.getMerek().equals("Dell")) {
                System.out.println(laptop.infoSingkat());
            }
        }

        // 6. CARI LAPTOP DENGAN SPEC TERBAIK
        System.out.println("\n=== CARI LAPTOP DENGAN SPEC TERBAIK ===");
        Laptop laptopTerbaik = laptops[0];
        for (Laptop laptop : laptops) {
            if (laptop.nilaiSpec() > laptopTerbaik.nilaiSpec()) {
                laptopTerbaik = laptop;
            }
        }
        System.out.println("Laptop terbaik: " + laptopTerbaik.infoSingkat());
        System.out.println("Nilai spec: " + laptopTerbaik.nilaiSpec());

        // 7. TAMPILKAN SEMUA DENGAN INFO LENGKAP
        System.out.println("\n=== DETAIL SEMUA LAPTOP ===");
        for (int i = 0; i < laptops.length; i++) {
            System.out.println("--- Laptop " + (i+1) + " ---");
            laptops[i].tampilkanInfo();
            System.out.println("Nilai Spec: " + laptops[i].nilaiSpec());
            System.out.println();
        }

        // 8. UBAH SPEC LAPTOP
        System.out.println("=== UBAH RAM LAPTOP PERTAMA ===");
        System.out.println("Sebelum: " + laptops[0].infoSingkat());
        laptops[0].setRam(16);  // Ubah RAM
        System.out.println("Sesudah: " + laptops[0].infoSingkat());
    }
}
```

**Output (Excerpt):**

```
=== ITERASI DENGAN FOR LOOP ===
1. Dell (Intel i7, 8GB RAM)
2. HP (Intel i5, 16GB RAM)
3. Lenovo (Intel i9, 32GB RAM)
4. ASUS (Intel i7, 8GB RAM)
5. Acer (Intel i5, 16GB RAM)

=== HITUNG TOTAL RAM ===
Total RAM semua laptop: 80 GB
Rata-rata RAM: 16 GB

=== CARI LAPTOP DENGAN RAM 16GB ===
2. HP (Intel i5, 16GB RAM)
5. Acer (Intel i5, 16GB RAM)

=== CARI LAPTOP DENGAN SPEC TERBAIK ===
Laptop terbaik: Lenovo (Intel i9, 32GB RAM)
Nilai spec: 150

=== UBAH RAM LAPTOP PERTAMA ===
Sebelum: Dell (Intel i7, 8GB RAM)
Sesudah: Dell (Intel i7, 16GB RAM)
```

---

## 🔄 Jenis-Jenis Loop untuk Array

### 1. Traditional For Loop

```java
for (int i = 0; i < laptops.length; i++) {
    System.out.println(laptops[i].infoSingkat());
}
```

✅ **Keuntungan:** Bisa akses index, fleksibel
❌ **Kekurangan:** Lebih verbose

### 2. Enhanced For Loop (For-Each)

```java
for (Laptop laptop : laptops) {
    System.out.println(laptop.infoSingkat());
}
```

✅ **Keuntungan:** Lebih clean, tidak perlu index
❌ **Kekurangan:** Tidak bisa akses index langsung

### 3. While Loop

```java
int i = 0;
while (i < laptops.length) {
    System.out.println(laptops[i].infoSingkat());
    i++;
}
```

✅ **Keuntungan:** Flexible untuk kondisi kompleks
❌ **Kekurangan:** Lebih mudah error (infinite loop)

### 4. Stream API (Java 8+)

```java
Arrays.stream(laptops)
      .forEach(laptop -> System.out.println(laptop.infoSingkat()));
```

✅ **Keuntungan:** Modern, functional style
❌ **Kekurangan:** Perlu pemahaman lambda

---

## 📊 Common Array Operations

### 1. Mencari Element

```java
// Cari berdasarkan property
for (int i = 0; i < laptops.length; i++) {
    if (laptops[i].getRam() == 16) {
        System.out.println("Found at index: " + i);
    }
}
```

### 2. Menghitung Statistik

```java
// Total, rata-rata, min, max
int total = 0;
int min = Integer.MAX_VALUE;
int max = Integer.MIN_VALUE;

for (Laptop laptop : laptops) {
    int ram = laptop.getRam();
    total += ram;
    if (ram < min) min = ram;
    if (ram > max) max = ram;
}

int rata2 = total / laptops.length;
```

### 3. Filter/Filtering

```java
// Tampilkan hanya laptop dengan spec tinggi
for (Laptop laptop : laptops) {
    if (laptop.nilaiSpec() > 100) {
        System.out.println(laptop.infoSingkat());
    }
}
```

### 4. Transformasi

```java
// Ubah spec semua laptop
for (Laptop laptop : laptops) {
    laptop.setRam(laptop.getRam() + 4);  // Tambah RAM 4GB
}
```

---

## ⚠️ Common Mistakes

### 1. Lupa Inisialisasi Object

```java
// ❌ SALAH
Laptop[] laptops = new Laptop[3];
laptops[0].tampilkanInfo();  // NullPointerException!

// ✅ BENAR
Laptop[] laptops = new Laptop[3];
laptops[0] = new Laptop("Dell", "i7", 8);
laptops[0].tampilkanInfo();
```

### 2. Iterasi di Luar Batas

```java
// ❌ SALAH - ArrayIndexOutOfBoundsException
for (int i = 0; i <= laptops.length; i++) {  // <= salah!
    System.out.println(laptops[i].infoSingkat());
}

// ✅ BENAR
for (int i = 0; i < laptops.length; i++) {   // < benar!
    System.out.println(laptops[i].infoSingkat());
}
```

### 3. Mengasumsikan Urutan

```java
// ❌ SALAH - Asumsi index 2 selalu ada dan terisi
Laptop best = laptops[2];

// ✅ BENAR - Cari dengan loop
Laptop best = laptops[0];
for (Laptop l : laptops) {
    if (l.nilaiSpec() > best.nilaiSpec()) {
        best = l;
    }
}
```

### 4. Modifikasi Tidak Terduga

```java
// ❌ HATI-HATI - mengubah object dalam array
for (Laptop laptop : laptops) {
    laptop.setRam(0);  // Akan mengubah semua!
}

// ✅ Jika perlu modifikasi, pastikan intentional
```

---

## 📝 Praktik & Latihan

### 1. Membuat Array Sederhana

- Buat array 5 laptops
- Set spesifikasi berbeda untuk setiap laptop
- Tampilkan info semua laptop dengan loop

### 2. Searching dalam Array

- Cari laptop dengan RAM tertentu
- Cari laptop dengan merek tertentu
- Cari laptop dengan spec terbaik

### 3. Aggregate Calculation

- Hitung total RAM
- Hitung rata-rata RAM
- Cari max dan min RAM

### 4. Complex Processing

- Tampilkan laptop dengan RAM > 8GB
- Ubah spec laptop tertentu
- Buat ranking berdasarkan spec

### 5. Mini Project: Inventory Sistem

- Buat class Product
- Buat array untuk inventory
- Implementasi: tambah, hapus, cari, update product
- Kalkulasi: total value, stock level

---

## 💡 Tips Penting

1. **Array.length**: Selalu gunakan untuk loop condition
2. **Index Mulai dari 0**: Array index 0-based, bukan 1-based
3. **Null Checking**: Pastikan object tidak null sebelum akses
4. **Enhanced For vs Regular For**: Gunakan enhanced for jika tidak perlu index
5. **Memory Efficient**: Gunakan ukuran array yang tepat

---

## 🔗 Hubungan dengan Materi Sebelumnya

- **W1-W2**: Mendefinisikan class yang bisa di-array
- **W3**: Overloading berguna untuk constructor variasi
- **W4**: Enkapsulasi menjaga integritas object dalam array
- **W5**: Menggabungkan semua konsep dalam array of objects

---

## 🚀 Persiapan untuk Materi Lanjutan

Materi berikutnya akan mencakup:

- **Inheritance** (Pewarisan)
- **Polymorphism** (Polimorfisme)
- **Abstract Class & Interface**
- **Exception Handling**
- **Collections Framework** (ArrayList, HashMap, dll)

---

## 📖 Referensi

- [Oracle Array Tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [GeeksforGeeks - Arrays](https://www.geeksforgeeks.org/arrays-in-java/)
- [Tutorialspoint - Java Arrays](https://www.tutorialspoint.com/java/java_arrays.htm)
