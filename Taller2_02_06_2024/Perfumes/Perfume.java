import java.util.ArrayList;

class Perfume {
    private String nombre;
    private String marca;
    private Double capacidad;
    private Double precio;
    private Double restante;
    public Perfume(String nombre, String marca, Double capacidad, Double precio, Double restante) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
        this.restante = restante;
    }

    public static void añadido(ArrayList<Perfume> perfumes, String nombre, String marca, Double capacidad, Double precio, Double restante) {
        Perfume perfums = new Perfume(nombre, marca, capacidad, precio, restante);
        perfumes.add(perfums);
        System.out.println("Perfume añadido: " + perfums.toString());
    }

    public static void aplicarPerfume(ArrayList<Perfume> perfumes, Double cantidad, String nombre) {
        for (Perfume perfume : perfumes) {
            if (perfume.nombre.equals(nombre)) {
                // la cantidad es la cantiad de splash que nos aplicaremos con el perfume 
               perfume.restante=cantidad;
                System.out.println("Cantidad restante del perfume: " + perfume.restante + " ml");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public static void ajustarPrecio(ArrayList<Perfume> perfumes, String nombre, Double precio, int opcs) {
        for (Perfume perfume : perfumes) {
            if (opcs == 1) {
                if (perfume.nombre.equals(nombre)) {
                    perfume.precio += precio;
                    System.out.println("Precio modificado: " + perfume.toString());
                    return;
                }
            } else if (opcs == 2) {
                if (perfume.nombre.equals(nombre)) {
                    perfume.precio -= precio;
                    System.out.println("Precio reducido: " + perfume.toString());
                    return;
                }
            }
        }
        System.out.println("Producto no encontrado.");
    }

 public Double Restante(){
     return capacidad-restante;
 }

    public String toString() {
        return "Perfume: { Nombre del perfume: " + nombre + ", Marca: " + marca + ", Capacidad: " + capacidad + " ml, Cantidad restante: " + restante +" ml, Precio: $" + precio + " }";
    }
}
