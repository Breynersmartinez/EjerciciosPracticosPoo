package src.Controller;
import java.util.Scanner;
import src.Entity.EntityBiblioteca;
import src.Services.ServicesBiblioteca;


public class ControllerBiblioteca {
   

    private ServicesBiblioteca servicesBiblioteca = new ServicesBiblioteca();
   
    public void iniciar(){
        Scanner scanner = new Scanner(System.in);
        boolean bucle = true;

        // Creación de objetos Libro
        EntityBiblioteca libro1 = new EntityBiblioteca("Etica para Amador", "Fernando Savater", 123, 192);
        EntityBiblioteca libro2 = new EntityBiblioteca("Rey de Babilonia", "Fulgencio Batista", 124, 256);
        EntityBiblioteca libro3 = new EntityBiblioteca("Calculo IV", "James Stewart", 125, 1024);


        while (bucle) {
            System.out.println("Ingrese su Contraseña: ");
            int contrasena = scanner.nextInt();
            int contrasenaUser = 12;
            scanner.nextLine(); // Consumir el salto de línea restante

            if (contrasena == contrasenaUser) {
                // Proceso eleccion prestamo o devolucion de libro
                System.out.println("Biblioteca UCC");
                System.out.println("d. Devolver libro");
                System.out.println("p. Prestamo de libro");
                String opcion = scanner.nextLine();

                switch(opcion) {
                    case "p":
                        // Submenú para préstamo de libro
                        System.out.println("Seleccione el libro para prestar:");
                        System.out.println("1. Etica para Amador");
                        System.out.println("2. Rey de Babilonia");
                        System.out.println("3. Calculo IV");
                        int libro = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea restante

                        switch(libro) {
                            case 1:
                                System.out.println(servicesBiblioteca.prestar(libro1));
                                break;
                            case 2:
                                System.out.println(servicesBiblioteca.prestar(libro2));
                                break;
                            case 3:
                                System.out.println(servicesBiblioteca.prestar(libro3));
                                break;
                            default:
                                System.out.println("La opción ingresada no existe, intente de nuevo.");
                                break;
                        }
                        break;

                    case "d":
                        // Submenú para devolución de libro
                        System.out.println("Seleccione el libro para devolver:");
                        System.out.println("a. Etica para Amador");
                        System.out.println("b. Rey de Babilonia");
                        System.out.println("c. Calculo IV");
                        String libroD = scanner.nextLine();

                        switch(libroD) {
                            case "a":
                                System.out.println(servicesBiblioteca.devolver(libro1));
                                break;
                            case "b":
                                System.out.println(servicesBiblioteca.devolver(libro2));
                                break;
                            case "c":
                                System.out.println(servicesBiblioteca.devolver(libro3));
                                break;
                            default:
                                System.out.println("La opción ingresada no existe, intente de nuevo.");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                        break;
                }
            } else {
                System.out.println("Contraseña incorrecta.");
            }
        }
    
    }
        public static void main(String[] args) {
            ControllerBiblioteca controller = new ControllerBiblioteca();
            controller.iniciar();
    }

}

