import java.util.Scanner;





class Proceso {
    private Double saldo;
    private String titular;
    private int numeroCuenta;

    public Proceso(Double saldo, String titular, int numeroCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(Double deposito) {
        this.saldo += deposito;
    }

    public Double Saldo() {
        return this.saldo;
    }

    public void retirar(Double retiro) {
        if (this.saldo >= retiro) {
            //Si el saldo es suficiente, se puede hacer el returo 
            this.saldo -= retiro;
        } else {
            // en cambio si el saldo no es suficiente no se hace el proceso 
            System.out.println("Saldo insuficiente.");
        }
    }
}
