/**
 * Kelas MainApp digunakan sebagai titik awal untuk menjalankan program simulasi bank.
 * Menampilkan proses pembuatan akun, penyetoran, penarikan, dan daftar akun.
 * 
 * <p>Kelas ini bertujuan untuk mendemonstrasikan hasil dokumentasi JavaDocs
 * yang telah dibuat pada proyek ini.</p>
 * 
 * @author Rizky
 * @version 1.0
 */
public class MainApp {
    /**
     * Metode utama program yang akan dijalankan pertama kali.
     * 
     * @param args argumen dari command line
     */
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();

        BankAccount acc1 = new BankAccount("1001", "Rizky Aditya", 5000000);
        bank.addAccount(acc1);

        acc1.deposit(1000000);
        acc1.withdraw(500000);
        System.out.println("Saldo akhir: Rp" + acc1.getBalance());

        System.out.println("\nDaftar Akun di Sistem:");
        bank.listAccounts();
    }
}
