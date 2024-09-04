import java.util.Scanner;
class Ejecucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su Contraseña: ");
        int Contraseña = scanner.nextInt();
        int ContraseñaUser = 1234567;

        if (Contraseña == ContraseñaUser) {
            //el titular esta predeterminado en el sistema
            Proceso proceso = new Proceso(1000.0, "breiner", 1); 
            // mostramos el saldo 
            Double MostrarSaldo = proceso.Saldo();
            System.out.println("Su saldo es: " + MostrarSaldo);

            System.out.println("Ingrese la cantidad que desea retirar: ");
            Double Retiro = scanner.nextDouble();
            proceso.retirar(Retiro);
            System.out.println("Usted retiró: " + Retiro + ". Su saldo actual es: " + proceso.getSaldo());

            System.out.println("Ingrese la cantidad que desea depositar: ");
            Double Deposito = scanner.nextDouble();
            proceso.depositar(Deposito);
            System.out.println("Usted depositó: " + Deposito + ". Su saldo actual es: " + proceso.getSaldo());
        } else {
            System.out.println("Contraseña incorrecta.");
        }

     
    }
}