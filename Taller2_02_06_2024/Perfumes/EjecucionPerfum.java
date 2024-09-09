import java.util.Scanner;
import java.util.ArrayList;
public class Ejecucion {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Perfume> perfumes = new ArrayList<Perfume>();
        boolean bucle = true;
        while (bucle) {
            System.out.println("  v.  Ver coleccion de perfumes");
            System.out.println("  +.  añadir perfume a la coleccion de perfumes");
            System.out.println(" a. Aplicar perfume");
            System.out.println(" p. ajustar precio");
            System.out.println(" r. ver perfuemes cantidades restantes de los  perfumes ");
            String opc = scanner.nextLine();
            switch (opc) {
                case "v":
                    for (Perfume consulta : perfumes) {
                        System.out.println(consulta.toString());
                      
                    }
                    break;
                case "+":
                    System.out.println(" Nombre del  perfume");
                    String nombre = scanner.nextLine();
                    System.out.println(" Marca del  perfume");
                    String marca = scanner.nextLine();
                    System.out.println(" Precio del  perfume");
                    Double precio = scanner.nextDouble();
                    
                    System.out.println(" Capacidad del  perfume");
                    Double capacidad = scanner.nextDouble();
                    
                    Double restante = 0.0;
                    Perfume.añadido(perfumes, nombre, marca, capacidad, precio, restante);
                    
                    break;
                case "a":
                    System.out.println(" Ingrese el nombre  del perfume que se va aplicar ");
                    String nombreperf = scanner.nextLine();
                    System.out.println(" Ingrese la cantidad  que  se va aplicar ");
                    Double cantidadapli = scanner.nextDouble();
                    
                    Perfume.aplicarPerfume(perfumes, cantidadapli, nombreperf);
                    break;
                case "p":
                    System.out.println(" 1. aumentar precio ");
                    System.out.println(" 2. Reducir precio ");
                    int opcs = scanner.nextInt();
                    
                    switch (opcs) {
                        case 1:
                            System.out.println(" Nombre del producto ");
                            String nombreva = scanner.nextLine();
                            System.out.println(" monto para añadir ");
                            Double Preciomod = scanner.nextDouble();
                            
                            Perfume.ajustarPrecio(perfumes, nombreva, Preciomod, opcs);
                            break;
                        case 2:
                            System.out.println(" Ingrese el nombre  del perfume que se va modificar el precio ");
                            String nombrerest = scanner.nextLine();
                            System.out.println(" Ingrese el monto que  se va aplicar ");
                            Double cantidadrest = scanner.nextDouble();
                           
                            Perfume.ajustarPrecio(perfumes, nombrerest, cantidadrest, opcs);
                            break;
                        default:
                            System.out.println(" Opcion no encontrada ");
                    }
                    break;
                case "r":
                     for (Perfume consulta : perfumes) {
                        System.out.println(consulta.toString());
                        System.out.println(" Restante del perfume "+consulta.Restante() +" ml ");
                       
                    }
                default:
                    System.out.println(" Opcion no encontrada ");
            }
        }
    }
}
