package Controller;
import Entity.EntityCajero;
import Services.ServicesCajero;

import java.util.Scanner;



public class Controller {
   
    private ServicesCajero servicesCajero = new ServicesCajero();

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su Contraseña: ");
        int contraseña = scanner.nextInt();
        int contraseñaUser = 123;

        if (contraseña == contraseñaUser) {
            EntityCajero cuenta = new EntityCajero(1000.0, "breiner", 1);

            System.out.println("Su saldo es: " + servicesCajero.saldo(cuenta));

            System.out.println("Ingrese la cantidad que desea retirar: ");
            Double retiro = scanner.nextDouble();
            servicesCajero.retirar(cuenta, retiro);
            System.out.println("Usted retiró: " + retiro + ". Su saldo actual es: " + servicesCajero.saldo(cuenta));

            System.out.println("Ingrese la cantidad que desea depositar: ");
            Double deposito = scanner.nextDouble();
            servicesCajero.depositar(cuenta, deposito);
            System.out.println("Usted depositó: " + deposito + ". Su saldo actual es: " + servicesCajero.saldo(cuenta));
        } else {
            System.out.println("Contraseña incorrecta.");
        }
        
    }

   
}
