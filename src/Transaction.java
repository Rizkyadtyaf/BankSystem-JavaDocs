import java.time.LocalDateTime;

/**
 * Kelas Transaction merepresentasikan catatan transaksi nasabah.
 * Mencatat jenis transaksi, jumlah uang, dan waktu transaksi dilakukan.
 * 
 * <p>Kelas ini digunakan untuk mendemonstrasikan dokumentasi metode dan atribut
 * dalam proyek Java menggunakan JavaDocs.</p>
 * 
 * @author Rizky
 * @version 1.0
 */
public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime date;

    /**
     * Membuat transaksi baru.
     * 
     * @param type jenis transaksi (Setor atau Tarik)
     * @param amount jumlah uang yang terlibat
     */
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDateTime.now();
    }

    /**
     * Mengembalikan deskripsi lengkap dari transaksi.
     * 
     * @return string berisi detail transaksi
     */
    public String getDetails() {
        return date + " | " + type + " | Rp" + amount;
    }
}
