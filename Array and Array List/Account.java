public class Account {
    protected double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    // Method Setor Uang
    public boolean deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            return true;
        }
        return false;
    }

    // Method Tarik Uang
    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }
}
