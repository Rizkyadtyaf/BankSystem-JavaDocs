# Sistem Bank Sederhana — Tugas Dokumentasi Java (JavaDocs)

Proyek ini dibuat untuk memenuhi tugas **“Dokumentasi Proyek dengan JavaDocs”**, yaitu membuat dokumentasi kode Java yang jelas, mudah dipahami, dan konsisten.  
Tujuan utama proyek ini adalah agar kode dapat **dipelihara, diperbarui, dan dikembangkan** dengan mudah oleh tim pengembang di masa depan.

---

## Struktur Folder

```
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
```

---

## Cara Menjalankan Program

1. Buka terminal di folder utama proyek (`BankSystem`)
2. Jalankan perintah berikut untuk **compile semua file Java**:
   ```bash
   javac src/*.java
   ```
3. Lalu jalankan program utama:
   ```bash
   java -cp src MainApp
   ```
4. Hasil akan muncul di terminal seperti contoh:
   ```
   Setor berhasil: Rp1000000.0
   Tarik berhasil: Rp500000.0
   Saldo akhir: Rp5500000.0

   Daftar Akun di Sistem:
   1001 - Rizky Aditya | Saldo: Rp5500000.0
   ```

---

## Cara Melihat Dokumentasi JavaDocs

1. Buka folder `doc/`
2. Klik dua kali file `index.html`
3. File tersebut akan terbuka di browser (Chrome/Safari)
4. Di halaman tersebut terdapat dokumentasi lengkap untuk setiap kelas dan metode:
   - **BankAccount** → menangani akun nasabah  
   - **BankSystem** → mengelola daftar akun  
   - **Transaction** → mencatat transaksi  
   - **MainApp** → menjalankan program utama  

---

## Deskripsi Tugas (Sesuai Instruksi PDF)

Tugas ini bertujuan untuk:
- Membuat dokumentasi proyek menggunakan **JavaDocs**
- Menambahkan komentar dokumentasi pada setiap **kelas** dan **metode**
- Menggunakan tag:
  - `@param` → menjelaskan parameter input  
  - `@return` → menjelaskan nilai yang dikembalikan  
  - `@throws` → menjelaskan jenis exception yang mungkin muncul  

**Perintah untuk Generate Dokumentasi JavaDocs:**
```bash
javadoc -d docs src/BankAccount.java src/BankSystem.java src/Transaction.java src/MainApp.java
```

Output dari perintah di atas tersimpan di folder `doc/` dalam format HTML.

---

## Catatan Tambahan

- Semua file di folder `docs/` dihasilkan otomatis oleh JavaDocs dan **tidak perlu diubah secara manual**.  
- File utama dokumentasi adalah `docs/index.html`.  
- Untuk membuka dokumentasi, cukup buka `index.html` di browser.  
- Struktur dan dokumentasi proyek ini sudah **sepenuhnya sesuai dengan ketentuan tugas di PDF**.

---

**Kesimpulan:**  
Proyek ini telah memenuhi seluruh kriteria tugas JavaDocs — mencakup penulisan komentar dokumentasi, penggunaan tag standar, serta pembuatan output HTML yang dapat diakses dengan mudah.
