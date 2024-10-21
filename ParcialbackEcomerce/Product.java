// Clase base Producto
package ParcialbackEcomerce;
import java.util.*;
public class Product {
    private int number;

    // Constructor
    public Product(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void add(ArrayList<Product>products)
    {
        Product product = new Product(0);
        products.add(product);
    }
    @Override
    public String toString() {
        return " Producto {number= " + number + " }";
    }
}