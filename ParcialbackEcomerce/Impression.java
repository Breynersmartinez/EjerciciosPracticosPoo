// Clase Impresion que hereda de Producto
package ParcialbackEcomerce;

import java.util.ArrayList;

//Impresion
public class Impression extends Product {
    private String color;
    private ArrayList<Photo> photos;

    public Impression(int number, String color) {
        super(number);
        this.color = color;
        this.photos = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void addPhoto(Photo photo) {
        photos.add(photo);
    }

    @Override
    public String toString() {
        return " Impresion { number= " + getNumber() + ", color= " + color +  " } ";
    }
}