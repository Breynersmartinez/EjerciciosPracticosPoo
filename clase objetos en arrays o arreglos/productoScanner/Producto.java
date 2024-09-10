 class Producto {
    public class producto
 {
    private int id;
    private String nombre;
    private Double precio;

    public Producto( int id, String nombre, Double precio)
    {
this.id = id;
this.nombre = nombre;
this.precio = precio;
    }

public static int añadir(Producto [ ] p, int id, String nombre, Double precio)
{
Producto producto = new Producto(nombre, id, precio);
p.add(producto);
System.out.println( " Productos "+ producto.toString());
}

}
}
