/**
 * Kelas BankAccount merepresentasikan akun nasabah dalam sistem bank.
 * Menyimpan informasi pemilik akun, nomor akun, dan saldo saat ini.
 * Menyediakan operasi untuk setor dan tarik uang.
 * 
 * Dibuat untuk memenuhi tugas "Deskripsi Tugas JavaDocs" yaitu mendokumentasikan
 * proyek Java menggunakan JavaDocs agar mudah dipahami dan dipelihara.
 * 
 * @author Rizky
 * @version 1.0
 */
public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    /**
     * Membuat akun baru dengan nama pemilik dan saldo awal.
     * 
     * @param accountNumber nomor akun unik nasabah
     * @param ownerName nama pemilik akun
     * @param balance saldo awal akun
     */
    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    /**
     * Menambahkan uang ke dalam saldo akun.
     * 
     * @param amount jumlah uang yang akan disetor
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Setor berhasil: Rp" + amount);
    }

    /**
     * Mengurangi saldo akun jika saldo mencukupi.
     * 
     * @param amount jumlah uang yang akan ditarik
     * @throws IllegalArgumentException jika saldo tidak cukup
     */
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount > balance) {
            throw new IllegalArgumentException("Saldo tidak mencukupi!");
        }
        balance -= amount;
        System.out.println("Tarik berhasil: Rp" + amount);
    }

    /**
     * Mendapatkan saldo saat ini.
     * 
     * @return saldo terkini
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Mendapatkan nama pemilik akun.
     * 
     * @return nama pemilik akun
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Mendapatkan nomor akun nasabah.
     * 
     * @return nomor akun nasabah
     */
    public String getAccountNumber() {
        return accountNumber;
    }
}
