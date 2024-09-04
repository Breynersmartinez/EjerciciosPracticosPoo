import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bucle = true;

        // Creación de objetos Libro
        Libro libro1 = new Libro("Etica para Amador", "Fernando Savater", 123, 192);
        Libro libro2 = new Libro("Rey de Babilonia", "Fulgencio Batista", 124, 256);
        Libro libro3 = new Libro("Calculo IV", "James Stewart", 125, 1024);

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
                                System.out.println(libro1.prestar());
                                break;
                            case 2:
                                System.out.println(libro2.prestar());
                                break;
                            case 3:
                                System.out.println(libro3.prestar());
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
                                System.out.println(libro1.devolver());
                                break;
                            case "b":
                                System.out.println(libro2.devolver());
                                break;
                            case "c":
                                System.out.println(libro3.devolver());
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
}
