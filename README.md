# 🏦 Sistem Bank Sederhana — Tugas Dokumentasi Java (JavaDocs)

Proyek ini dibuat untuk memenuhi tugas **“Dokumentasi Proyek dengan JavaDocs”**, yaitu membuat dokumentasi kode Java yang jelas, mudah dipahami, dan konsisten.  
Tujuan utama proyek ini adalah agar kode dapat **dipelihara, diperbarui, dan dikembangkan** dengan mudah oleh tim pengembang di masa depan.

---

## 📁 Struktur Folder

BankSystem/
├── src/              # Berisi semua file kode Java
│   ├── BankAccount.java
│   ├── BankSystem.java
│   ├── Transaction.java
│   └── MainApp.java
│
├── doc/              # Hasil dokumentasi JavaDocs (format HTML)
│   ├── index.html          ← buka file ini di browser untuk melihat dokumentasi
│   ├── BankAccount.html
│   ├── BankSystem.html
│   ├── Transaction.html
│   ├── MainApp.html
│   └── (file CSS, JS, dan resource bawaan JavaDocs)
│
└── README.md         # Penjelasan proyek

---

## 🚀 Cara Menjalankan Program

1. Buka terminal di folder utama proyek (`BankSystem`)
2. Jalankan perintah berikut untuk **compile semua file Java**:
   ```bash
   javac src/*.java
3. Lalu jalankan program utama
    java -cp src MainApp
4. Hasil akan muncul diterminal
    Setor berhasil: Rp1000000.0
    Tarik berhasil: Rp500000.0
    Saldo akhir: Rp5500000.0

    Daftar Akun di Sistem:
    1001 - Rizky Aditya | Saldo: Rp5500000.0

Cara Melihat Dokumentasi JavaDocs
Buka folder doc/
    1. Klik dua kali file index.html
    2. File tersebut akan terbuka di browser (Chrome/Safari)
    3. Di halaman tersebut terdapat dokumentasi lengkap untuk setiap kelas dan metode:
    4. BankAccount → menangani akun nasabah
    5. BankSystem → mengelola daftar akun
    6. Transaction → mencatat transaksi
    7. MainApp → menjalankan program utama
Deskripsi Tugas (Sesuai Instruksi PDF)
    Tugas ini bertujuan untuk:
    Membuat dokumentasi proyek menggunakan JavaDocs
    Menambahkan komentar dokumentasi pada setiap kelas dan metode
    Menggunakan tag:
    @param → menjelaskan parameter input
    @return → menjelaskan nilai yang dikembalikan
    @throws → menjelaskan jenis exception yang mungkin muncul

Perintah untuk Generate Dokumentasi JavaDocs:
    javadoc -d doc src/BankAccount.java src/BankSystem.java src/Transaction.java src/MainApp.java
    Output dari perintah di atas tersimpan di folder doc/ dalam format HTML.