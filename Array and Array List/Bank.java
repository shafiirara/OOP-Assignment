import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    // Menambahkan nasabah baru
    public void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    // Mengambil jumlah total nasabah
    public int getNumOfCustomers() {
        return customers.size();
    }

    // Mengambil data nasabah berdasarkan indeks
    public Customer getCustomer(int index) {
        if (index >= 0 && index < customers.size()) {
            return customers.get(index);
        }
        return null;
    }
}
