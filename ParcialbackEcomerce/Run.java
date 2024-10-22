package ParcialbackEcomerce;
import java.util.*;

public class Run {
    public static void main(String[] args)  
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
       

        // bucle          
        boolean loop = true;
        while (loop) {
            System.out.println(" Elige la opcion ");
            System.out.println(" c. Cliente ");
            System.out.println(" p. Visualizar clientes y pedidos ");
            String option = scanner.nextLine();
            switch (option) {
                case "c":
                    System.out.println(" Ingrese su cedula ");
                    String idCard = scanner.nextLine();
                    System.out.println(" Ingrese su nombre ");
                    String name = scanner.nextLine();
                    Client.add(clients, idCard, name);

                    Client client = new Client(idCard, name);
                    System.out.println(client.toString());

                    // Creación del pedido
                    System.out.println(" Elija  producto (1. Impresion)  y elija la cantidad de fotos que quiere se se le tomen. ");
                    int productOption = scanner.nextInt();
                    scanner.nextLine(); // consume the newline

                    if (productOption == 1) { // Si selecciona impresion
                        System.out.println("Ingrese la cantidad de fotos requeridas: ");
                        int number = scanner.nextInt();
                        scanner.nextLine(); // consumir nueva línea
                    
                        // Crear un nuevo producto de tipo impresión
                        System.out.println("Ingrese el color de la impresión: ");
                        String color = scanner.nextLine();
                        Impression impression = new Impression(number, color);
                    
                     
                        products.add(impression); // Añadir el producto al pedido
                    }
                    System.out.println(" Ingrese la fecha del pedido ");
                    String date = scanner.nextLine();
                    System.out.println(" Ingrese el numero de su tarjeta de credito ");
                    int creditCardNumber = scanner.nextInt();

                    Order order = new Order(client, products, date, creditCardNumber);
                    System.out.println(order.toString());
                    break;

                case "p":
                    for (Client c : clients) {
                        for(Product p : products)
                        {
                        System.out.println(" Clientes: " + c.toString() + ", Producto " +p.toString());
                        }
                        System.out.println(" Ingrese la marca de la camara con el que prefiere la foto ");
                        String brand = scanner.nextLine();
                        System.out.println(" Ingrese el modelo de la camara Con el que prefier la foto ");
                        String model = scanner.nextLine();

                        Camera camera = new Camera(2, brand, model); // Creación de Camara
                       
                        products.add(camera);
                    }
                    
                    break;

                default:
                    break;
            }
        }
        scanner.close();
    }
}