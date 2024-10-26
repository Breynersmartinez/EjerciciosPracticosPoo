import java.util.*;

public class RunBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear el banco
        Bank bank = new Bank("Banco Central");
        
        // Crear un cliente y una cuenta de ahorro
        System.out.println("Ingrese el nombre del cliente:");
        String clientName = scanner.nextLine();
        Client client1 = new Client("C001", clientName);
        
        System.out.println("Apertura de cuenta: Cuenta de Ahorros.");
        Account savingsAccount = new SavingsAccount("A001", 1000.0, 0.02);
        client1.addAccount(savingsAccount);
        bank.addClient(client1);
        
        System.out.println("Cuenta de ahorros abierta con un depósito inicial de $1000.");
        
        // Crear un cajero (empleado)
        Cashier cashier = new Cashier("E001", "María López", 3, 1500.0);
        bank.addEmployee(cashier);

        // Realizar un depósito
        System.out.println("Ingrese la cantidad a depositar:");
        double depositAmount = scanner.nextDouble();
        cashier.processDeposit(client1, savingsAccount, depositAmount);
        System.out.println("Depósito realizado. Saldo actual: $" + savingsAccount.getBalance());

        // Realizar un retiro
        System.out.println("Ingrese la cantidad a retirar:");
        double withdrawAmount = scanner.nextDouble();
        cashier.processWithdrawal(client1, savingsAccount, withdrawAmount);
        System.out.println("Retiro realizado. Saldo actual: $" + savingsAccount.getBalance());

        // Calcular intereses mensuales
        System.out.println("Calculando intereses mensuales...");
        savingsAccount.calculateMonthlyInterest();
        System.out.println("Saldo después del cálculo de intereses: $" + savingsAccount.getBalance());
        
        // Crear una empresa de inversión
        InvestmentCompany company1 = new InvestmentCompany("INV001", 4.5, 0.08, 100000.0, 12);
        bank.addInvestmentCompany(company1);
        company1.offerInvestment();

        scanner.close(); // Cerramos el scanner
    }
}
