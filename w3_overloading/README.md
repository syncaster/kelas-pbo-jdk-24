# Pertemuan 3: Method Overloading (W3)

## 📌 Ringkasan

Pertemuan ini memperkenalkan konsep overloading (polimorfisme) yang memungkinkan kita membuat multiple method dengan nama sama tetapi signature berbeda.

**File:** `Exponential.java`

---

## 📚 Topik Pembelajaran

- Konsep Overloading (Polimorfisme)
- Method Overloading
- Constructor Overloading
- Method Signature
- Method Resolution
- Tipe Parameter yang Berbeda
- Return Type yang Sama

---

## 🎯 Tujuan Pembelajaran

Setelah menyelesaikan pertemuan ini, mahasiswa dapat:

1. Memahami konsep overloading dalam Java
2. Membuat multiple method dengan nama sama tapi parameter berbeda
3. Menerapkan constructor overloading
4. Memahami bagaimana Java menentukan method mana yang dipanggil
5. Menggunakan overloading untuk membuat API yang flexible
6. Menghindari ambiguity dalam overloading

---

## 🔑 Konsep Kunci

### Overloading (Method Dengan Nama Sama)

```java
// OVERLOADING: Nama sama, parameter berbeda
public double calculate(int exponent) { }
public double calculate(double base) { }
public double calculate(double base, int exponent) { }
public double calculate(double base, double exponent) { }
```

- Nama method **sama**
- Signature (parameter list) **berbeda**
- Java akan memilih method yang sesuai berdasarkan parameter saat dipanggil

### Method Signature

```java
nama_method(tipe1 param1, tipe2 param2, ...)
                 ↓
           Ini yang membedakan!
```

Signature mencakup:

1. **Jumlah parameter** - berbeda banyaknya
2. **Tipe parameter** - berbeda tipe datanya
3. **Urutan parameter** - berbeda posisinya

### Apa Yang BUKAN Overloading?

```java
// ❌ SALAH - Hanya berbeda return type
public int calculate(double base) { }
public double calculate(double base) { }

// ❌ SALAH - Nama parameter tidak penting
public void display(int x) { }
public void display(int y) { }  // Sama! Hanya nama param berbeda
```

### Constructor Overloading

```java
public Exponential() { }                              // Tanpa parameter
public Exponential(double base) { }                   // 1 parameter
public Exponential(double base, int exponent) { }    // 2 parameter
```

- Konstruktor juga bisa di-overload
- Memungkinkan membuat object dengan berbagai cara

---

## 📝 Struktur Class Exponential

```java
public class Exponential {
    private double base;
    private int exponent;
    private double result;

    // CONSTRUCTOR OVERLOADING
    // Konstruktor 1: Tanpa parameter
    public Exponential() {
        this.base = 1;
        this.exponent = 0;
        this.result = 1;
    }

    // Konstruktor 2: Dengan base saja
    public Exponential(double base) {
        this.base = base;
        this.exponent = 0;
        this.result = 1;
    }

    // Konstruktor 3: Dengan base dan exponent
    public Exponential(double base, int exponent) {
        this.base = base;
        this.exponent = exponent;
        this.result = calculate(base, exponent);
    }

    // METHOD OVERLOADING - calculate()

    // Method 1: Hitung dengan exponent saja (gunakan base default)
    public double calculate(int exponent) {
        return this.result = Math.pow(this.base, exponent);
    }

    // Method 2: Hitung dengan base saja (exponent = 2)
    public double calculate(double base) {
        return this.result = Math.pow(base, 2);
    }

    // Method 3: Hitung dengan base dan int exponent
    public double calculate(double base, int exponent) {
        return this.result = Math.pow(base, exponent);
    }

    // Method 4: Hitung dengan base dan double exponent
    public double calculate(double base, double exponent) {
        return this.result = Math.pow(base, exponent);
    }

    // Getter methods
    public double getResult() {
        return result;
    }
}
```

---

## 💻 Contoh Penggunaan

### Contoh 1: Constructor Overloading

```java
public class MainExponential {
    public static void main(String[] args) {
        // Menggunakan constructor berbeda

        // Konstruktor 1: Default
        Exponential exp1 = new Exponential();
        System.out.println("exp1 hasil: " + exp1.getResult());  // 1

        // Konstruktor 2: Dengan base
        Exponential exp2 = new Exponential(5);
        System.out.println("exp2 hasil: " + exp2.getResult());  // 1

        // Konstruktor 3: Dengan base dan exponent
        Exponential exp3 = new Exponential(2, 10);
        System.out.println("exp3 hasil: " + exp3.getResult());  // 1024
    }
}
```

### Contoh 2: Method Overloading

```java
public class MainExponential {
    public static void main(String[] args) {
        Exponential exp = new Exponential(2);  // base = 2

        // Memanggil calculate() dengan berbagai parameter

        // calculate(int) - gunakan base default (2)
        System.out.println("calculate(3): " + exp.calculate(3));      // 2^3 = 8

        // calculate(double) - exponent = 2
        System.out.println("calculate(5.0): " + exp.calculate(5.0));  // 5^2 = 25

        // calculate(double, int)
        System.out.println("calculate(3, 4): " + exp.calculate(3, 4));  // 3^4 = 81

        // calculate(double, double)
        System.out.println("calculate(2.5, 3): " + exp.calculate(2.5, 3));  // 2.5^3 = 15.625
    }
}
```

**Output:**

```
calculate(3): 8.0
calculate(5.0): 25.0
calculate(3, 4): 81.0
calculate(2.5, 3): 15.625
```

---

## 🎯 Method Resolution - Bagaimana Java Memilih?

Ketika memanggil method, Java memilih berdasarkan:

1. **Tipe parameter actual** harus cocok dengan tipe parameter formal
2. **Jumlah parameter** harus cocok
3. **Urutan parameter** harus cocok (jika berbeda urutan, bisa cocok tergantung overload)

```java
Exponential exp = new Exponential(2);

exp.calculate(3);           // ✓ cocok dengan calculate(int)
exp.calculate(3.0);         // ✓ cocok dengan calculate(double)
exp.calculate(3.0, 2);      // ✓ cocok dengan calculate(double, int)
exp.calculate(3.0, 2.0);    // ✓ cocok dengan calculate(double, double)
```

---

## ⚡ Keuntungan Overloading

| Keuntungan      | Penjelasan                                     |
| --------------- | ---------------------------------------------- |
| **Readability** | Nama method yang konsisten lebih mudah diingat |
| **Usability**   | Programmer bisa memanggil dengan berbagai cara |
| **Flexibility** | API yang fleksibel dan natural                 |
| **Consistency** | Interface yang konsisten untuk operasi mirip   |
| **Reusability** | Kode yang lebih mudah digunakan ulang          |

### Contoh dari Java API

```java
// String.valueOf() - overloaded dengan berbagai tipe
String.valueOf(123);       // int
String.valueOf(45.67);     // double
String.valueOf(true);      // boolean
String.valueOf('A');       // char

// System.out.println() - juga overloaded
System.out.println("Teks");
System.out.println(123);
System.out.println(45.67);
```

---

## ⚠️ Hal-Hal yang Perlu Dihindari

### 1. Ambiguity dalam Overloading

```java
// ❌ AMBIGU - Java bingung mana yang dipilih
public void display(int x) { }
public void display(double x) { }

display(5);  // Error! int bisa convert ke double, tapi yang mana?
```

**Solusi:** Jadilah spesifik atau gunakan type casting

```java
display((int)5);        // Jelas int
display((double)5);     // Jelas double
```

### 2. Terlalu Banyak Overloading

```java
// ❌ Terlalu banyak variasi - sulit dipahami
public void process(int x) { }
public void process(double x) { }
public void process(String x) { }
public void process(int x, int y) { }
public void process(int x, double y) { }
public void process(double x, int y) { }
public void process(double x, double y) { }
public void process(String x, int y) { }
// ... dst
```

**Solusi:** Gunakan overloading yang masuk akal saja, atau gunakan parameter object

---

## 📝 Praktik & Latihan

### 1. Membuat Class dengan Constructor Overloading

- Buat class dengan minimal 3 constructor berbeda
- Setiap constructor menginisialisasi dengan cara berbeda
- Test semua constructor

### 2. Membuat Method Overloading

- Buat method dengan 4-5 overload berbeda
- Ubah jumlah parameter, tipe, dan urutan
- Panggil method dengan berbagai kombinasi parameter

### 3. Eksperimen Parameter Conversion

- Test automatic type conversion (int ke double)
- Pelajari kapan terjadi error ambiguity
- Gunakan explicit casting bila perlu

### 4. Study Java API Overloading

- Lihat method System.out.println()
- Lihat method String.valueOf()
- Lihat method Math.pow()
- Perhatikan bagaimana overloading digunakan

---

## 💡 Tips Penting

1. **Nama Method Harus Sama**: Itu adalah syarat utama overloading
2. **Signature Harus Berbeda**: Kombinasi tipe dan jumlah parameter berbeda
3. **Return Type Tidak Cukup**: Hanya perbedaan return type BUKAN overloading
4. **Urutan Parameter Penting**: `(int, double)` berbeda dengan `(double, int)`
5. **Hindari Ambiguity**: Jangan buat situasi dimana Java tidak tahu method mana yang dipilih

---

## 🚀 Persiapan untuk Pertemuan Berikutnya

Di W4 akan mempelajari **Enkapsulasi**:

- Data hiding dengan access modifiers (private, public)
- Getter dan setter methods
- Validasi data

---

## 📖 Referensi

- [Oracle Java Method Overloading](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [GeeksforGeeks - Method Overloading](https://www.geeksforgeeks.org/method-overloading-in-java/)
