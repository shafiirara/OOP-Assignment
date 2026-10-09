import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts; 

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.accounts = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // Menambahkan akun tanpa batas maksimum
    public void setAccount(Account acct) {
        accounts.add(acct);
    }

    // Mengambil akun berdasarkan indeks
    public Account getAccount(int account_index) {
        if (account_index >= 0 && account_index < accounts.size()) {
            return accounts.get(account_index);
        }
        return null;
    }

    // Mengambil jumlah akun nasabah
    public int getNumOfAccounts() {
        return accounts.size();
    }
}
