class InvestmentAccount extends Account {
    private double minimumBalance = 10000.0;

    public InvestmentAccount(String accountNumber, double initialInvestment) {
        super(accountNumber, initialInvestment);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Retiro exitoso. Cantidad: $" + amount);
        } else {
            System.out.println("No se puede retirar. El saldo debe ser de al menos $" + minimumBalance);
        }
    }

    public double calculateReturn() {
        // Lógica para calcular el retorno de inversión
        return balance * 0.08;  // Ejemplo: 8% de retorno
    }
}
