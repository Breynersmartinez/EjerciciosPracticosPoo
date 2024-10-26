abstract class Account {
    protected String accountNumber;
    protected double balance;
     private double annualInterestRate;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public double getBalance() {
        return balance;
    }
    public void calculateMonthlyInterest() {
        double interest = (balance * annualInterestRate) / 12;
        balance += interest;
        System.out.println("Intereses mensuales calculados: $" + interest);
    }
}
