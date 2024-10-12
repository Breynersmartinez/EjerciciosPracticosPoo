package ParcialbackEcomerce;
import java.util.*;

public class Run {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Client> clients = new ArrayList<Client>();
ArrayList<Product> products = new ArrayList<Product>();

// bucle 
    boolean loop = true;
    while(loop)
    {
    System.out.println(" Elige la opcion ");
    System.out.println(" c. Clinte ");
    System.out.println(" p. fotografo ");
    String option = scanner.nextLine();
    switch (option) {
        case "c":
           System.out.println(" Ingrese su cedula "); 
           String idCard = scanner.nextLine();
           System.out.println(" Ingrese su nombre ");
            String name = scanner.nextLine();
            Client.add(clients, idCard, name);

            Client client = new Client(idCard, name);
            if ( idCard == idCard)
            {
                System.out.println( client.toString());
                 // Creacion del pedido

            System.out.println(" Ingrese el producto requerido ");
                String product = scanner.nextLine();
                System.out.println(" Ingrese la fecha  del pedido ");
                String date = scanner.nextLine();
            System.out.println(" Ingrese el numero de su tarjeta de credito ");
                int creditCardNumber = scanner.nextInt();

            
            Order.add(products, product, client, date, creditCardNumber);
           Order order = new Order(client, products, product, date, creditCardNumber);
            System.out.println( order.toString());

            }
            else
            {
                System.out.println(" Operacion sin exito ");
            }
           
            break;
            case "p":
            for (Client c : clients)
            {
                System.out.println( " Clintes " + c.toString());
                 
            }

           

            break;

        default:
            break;
    }
    }
}
}
