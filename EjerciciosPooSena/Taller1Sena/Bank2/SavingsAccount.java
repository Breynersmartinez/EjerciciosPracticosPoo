import java.util.*;
public class SavingsAccount extends Account {
    private double annualInterestRate;

    public SavingsAccount(String accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance);
        this.annualInterestRate = annualInterestRate;
    }

    public void calculateMonthlyInterest() {
        double interest = (balance * annualInterestRate) / 12;
        balance += interest;
        System.out.println("Intereses mensuales calculados: $" + interest);
    }
}
