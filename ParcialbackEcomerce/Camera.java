package ParcialbackEcomerce;

public class Camera extends Product {
    //Marca
    private String brand;
    //Modelo
    private String model;

    public Camera(int number, String brand, String model) {
        super(number);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Camara [number=" + getNumber() + ", brand=" + brand + ", model=" + model + "]";
    }
}
