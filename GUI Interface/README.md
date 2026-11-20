# Pendataan Mahasiswa (Java Swing GUI)

Aplikasi desktop sederhana berbasis **Java Swing** untuk mencatat dan menampilkan data mahasiswa secara interaktif. Proyek ini dibuat untuk memenuhi tugas mata kuliah **Pemrograman Berorientasi Objek (PBO)** dengan menerapkan konsep *container*, *atomic components*, *layout manager*, dan *event handling*.

---

## Fitur Utama

- **Input Data Mahasiswa**: Memasukkan **NIM**, **Nama**, dan memilih **Program Studi** (*Teknik Informatika*, *Sistem Informasi*, *Teknik Komputer*, *Ilmu Komputer*)[cite: 1].
- **Validasi Input**: Menampilkan dialog peringatan (`JOptionPane`) apabila kolom NIM atau Nama dibiarkan kosong saat tombol **Simpan** ditekan[cite: 1].
- **Tampilan Daftar Real-Time**: Data yang tersimpan langsung ditampilkan di area daftar (`JTextArea` dengan `JScrollPane`) dalam format `NIM | Nama | Program Studi`[cite: 1].
- **Kontrol Reset Ganda**:
  - **Reset Form**: Mengosongkan kolom input form tanpa menghapus data yang sudah tercatat di daftar[cite: 1].
  - **Reset Semua**: Menghapus seluruh data pada daftar sekaligus mengosongkan form dengan dialog konfirmasi terlebih dahulu[cite: 1].
- **Konfirmasi Keluar Aplikasi**: Menampilkan dialog konfirmasi sebelum menutup jendela aplikasi (`WindowAdapter`)[cite: 1].

---

## Teknologi & Komponen yang Digunakan

- **Bahasa Pemrograman**: Java (JDK 8 atau versi lebih baru)
- **Library GUI**: `javax.swing` & `java.awt`[cite: 1]
- **Komponen & Layout**:
  - **Container**: `JFrame`, `JPanel`, `JScrollPane`[cite: 1]
  - **Atomic Components**: `JLabel`, `JTextField`, `JComboBox`, `JTextArea`, `JButton`[cite: 1]
  - **Layout Manager**: `BorderLayout`, `GridLayout`, `FlowLayout`[cite: 1]
  - **Event Listener**: `ActionListener`, `WindowAdapter`[cite: 1]

---
## Screenshoot Tampilan
<img width="1279" height="664" alt="image" src="https://github.com/user-attachments/assets/67e0ea68-bae7-4cbc-81b3-541e8dffbed0" />
