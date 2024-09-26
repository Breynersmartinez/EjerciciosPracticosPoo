package Controller;

import Services.NumeroService;
import java.util.Scanner;

public class NumeroController
{
      private NumeroService numeroService = new NumeroService();

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            numeroService.agregarNumero(valor);
        }

        // Sumar los dos números
        int suma = numeroService.sumarNumeros();
        System.out.println("La suma de los dos números es: " + suma);
    }
      public static void main(String[] args)
       {
        NumeroController controller = new NumeroController();
        controller.iniciar();
    }
}
