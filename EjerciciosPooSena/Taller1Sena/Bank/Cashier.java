public class Cashier extends Employee {
    public Cashier(String employeeId, String name, int yearsWorked, double salary) {
        super(employeeId, name, yearsWorked, salary);
    }

    // Procesar depósito
    public void processDeposit(Client client, Account account, double amount) {
        account.deposit(amount);
        System.out.println("Depósito de $" + amount + " realizado para el cliente " + client.getName());
    }

    // Procesar retiro
    public void processWithdrawal(Client client, Account account, double amount) {
        if (account instanceof SavingsAccount) {
            if (account.getBalance() - amount >= 500) { // Condición de $500 en la cuenta
                account.withdraw(amount);
                System.out.println("Retiro de $" + amount + " realizado para el cliente " + client.getName());
            } else {
                System.out.println("No se puede retirar, debe quedar al menos $500 en la cuenta.");
            }
        } else if (account instanceof InvestmentAccount) {
            if (account.getBalance() - amount >= 10000) { // Condición de $10,000 en la cuenta
                account.withdraw(amount);
                System.out.println("Retiro de $" + amount + " realizado para el cliente " + client.getName());
            } else {
                System.out.println("No se puede retirar, debe quedar al menos $10,000 en la cuenta.");
            }
        }
    }
}
