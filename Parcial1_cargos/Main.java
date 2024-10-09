package Parcial1_cargos;
import java.util.*;

public class Main {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> persona = new ArrayList<Persona>();
        boolean bucle = true;
        while(bucle) {
            System.out.println("______________________ ");
            System.out.println(" Ingrese su id ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consumir el carácter de nueva línea

            System.out.println("______________________ ");
            System.out.println(" Ingrese su nombre  ");
            String nombre = scanner.nextLine();

            System.out.println("______________________ ");
            System.out.println(" Ingrese sus apellidos  ");
            String apellidos = scanner.nextLine();

            Persona.añadir(persona, id, nombre, apellidos);

            for (Persona p : persona) {
                System.out.println("Lista de personas: " + p.toString());
                
            }

            System.out.println(" Elija la opcion ");
            System.out.println("______________");
            System.out.println("1. Consultor");
            System.out.println("2. Operario");
            System.out.println("______________");
            int opc = scanner.nextInt();
            switch (opc)
            {
                case 1:
                System.out.println("Ingrese sus ventas ");
                double venta = scanner.nextDouble();
                System.out.println("Ingrese la comision de sus  ventas ");
                double comision = scanner.nextDouble();
                Consultar consultar = new Consultar(venta, comision);
                Double totalpag = consultar.pagar();
                System.out.println(" Su pago es " + totalpag);

                for ( Persona pc : persona)
                {
                  System.out.println(" Lista de consiltores " + pc.toString()+ "\n Pago total: "+ consultar.pagar());
                }
              


        
                
                break;
                case 2:
                System.out.println(" ingrese sus horas trabajadas ");
                Double horas = scanner.nextDouble();
                Operario operario = new Operario( horas);
                Double TotalPagoOp = operario.pagar();
                System.out.println(" Su pago es " + TotalPagoOp);
                for( Persona op : persona)
                {
                    System.out.println(" Lista de operarios " + op.toString()+ "\n Pago total: "+ operario.pagar());
                }

                
                break;
                default:
                System.out.println("opcion no encontrada ");
            }

        }

    }
}
