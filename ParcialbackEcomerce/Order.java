package ParcialbackEcomerce;
import java.util.*;

//pedido
public class Order {
    private Client client;
    private ArrayList<Product> products;
    private String date;
    private int creditCardNumber;

    public Order(Client client, ArrayList<Product> products, String date, int creditCardNumber) {
        this.client = client;
        this.products = products;
        this.date = date;
        this.creditCardNumber = creditCardNumber;
    }

    public static void add(ArrayList<Product> products, Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        return "Order { client= " + client + ", products= " + products + ", date= " + date + ", CreditCardNumber= "
                + creditCardNumber + " }";
    }
}