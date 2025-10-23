import java.util.ArrayList;

/**
 * Kelas BankSystem berfungsi untuk mengelola seluruh akun nasabah dalam sistem.
 * Menyediakan fitur untuk menambah akun, mencari akun, dan menampilkan daftar akun.
 * 
 * <p>Kelas ini berperan sebagai manajer data utama dalam simulasi sistem bank.</p>
 * 
 * @author Rizky
 * @version 1.0
 */
public class BankSystem {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    /**
     * Menambahkan akun baru ke dalam sistem bank.
     * 
     * @param account akun nasabah baru yang akan ditambahkan
     */
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    /**
     * Mencari akun berdasarkan nomor akun.
     * 
     * @param accountNumber nomor akun yang dicari
     * @return objek BankAccount jika ditemukan, null jika tidak ada
     */
    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    /**
     * Menampilkan semua akun yang terdaftar di sistem bank.
     */
    public void listAccounts() {
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountNumber() + " - " + acc.getOwnerName() +
                " | Saldo: Rp" + acc.getBalance());
        }
    }
}
