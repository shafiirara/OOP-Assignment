public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Menambahkan Nasabah
        bank.addCustomer("Azzahra", "Shafira");
        bank.addCustomer("Nisa", "Agnia");

        // Ambil Nasabah Pertama
        Customer cust1 = bank.getCustomer(0);

        // Menambahkan Akun untuk Raara
        cust1.setAccount(new Account(500000.0));
        cust1.setAccount(new Account(1500000.0)); // Nasabah bisa punya lebih dari 1 akun

        // Menampilkan Info Nasabah & Akun
        System.out.println("Nama Nasabah : " + cust1.getFirstName() + " " + cust1.getLastName());
        System.out.println("Jumlah Akun  : " + cust1.getNumOfAccounts());

        Account acc1 = cust1.getAccount(0);
        System.out.println("Saldo Akun 1 : Rp " + acc1.getBalance());

        // Pengujian Setor & Tarik Uang
        acc1.deposit(250000.0);
        System.out.println("Saldo setelah Deposit  : Rp " + acc1.getBalance());

        acc1.withdraw(100000.0);
        System.out.println("Saldo setelah Penarikan: Rp " + acc1.getBalance());
    }
}