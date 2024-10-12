package ParcialbackEcomerce;
import java.util.*;

public class Order {
private Client client;
private String product;
private ArrayList<Product> products = new ArrayList<Product>();
//Fecha
private String date;
//
private int CreditCardNumber;

public Order(Client client, ArrayList<Product> products, String product, String date, int creditCardNumber) {
    this.client = client;
    this.products = products;
    this.product = product;
    this.date = date;
    CreditCardNumber = creditCardNumber;
}

//Creacion del pedido
public static void add(ArrayList<Product> products, String product, Client client, String date, int creditCardNumber)
{
   Product productd =  new Product( );
    products.add(productd);
}

@Override
public String toString() {
    return "Order [client=" + client + ", products=" + product + ", date=" + date + ", CreditCardNumber="
            + CreditCardNumber + "]";
}

}
