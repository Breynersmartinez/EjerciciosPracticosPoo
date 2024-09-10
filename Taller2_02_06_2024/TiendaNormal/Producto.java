    /*4. Ejercicio Pr´actico 3: Modelado de una Clase para Manejo
de Inventario (45 minutos)
Objetivo: Implementar una clase Producto para gestionar un inventario de
una tienda, con atributos como nombre del producto, c´odigo, cantidad en stock,
y precio. Crear m´etodos para a˜nadir y reducir stock, y para calcular el valor
total del inventario disponible.
• Definir la clase Producto con los atributos mencionados.
• Implementar m´etodos como a~nadirStock(int cantidad), reducirStock(int
cantidad) y calcularValorInventario().
• Crear objetos Producto y simular la gesti´on de un inventario. */
import java.util.ArrayList;
class Producto{
  


    private String nombre;
    private int codigo;
    private int cantidad;
    private Double precio;
    
    public  Producto(String nombre, int codigo, int cantidad, Double precio ){
        this.nombre    =  nombre;
        this.codigo   = codigo;
        this.cantidad   =  cantidad;
        this.precio   =  precio;
    }

   public static void añadirProducto(ArrayList<Producto>productos, String nombre, int codigo, int cantidad, Double precio){
       Producto producto = new Producto( nombre,  codigo,  cantidad,  precio);
       productos.add(producto);
       System.out.println("Producto"+producto.toString());
   }
   
   
 public static void añadir(ArrayList<Producto>productos, int codigo, int cantidad ){
 for (Producto producto : productos) {
            if (producto.codigo == codigo) {
                producto.cantidad += cantidad;
                if (producto.cantidad <= 0) {
                    productos.add(producto);
                    System.out.println("Producto añadido: " + producto.toString());
                } else {
                    System.out.println("Cantidad añadida por Unidad: " + producto.toString());
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
 }
 
 public static void reducir(ArrayList<Producto>productos, int codigo, int cantidad){
     for (Producto producto : productos) {
            if (producto.codigo == codigo) {
                producto.cantidad -= cantidad;
                if (producto.cantidad <= 0) {
                    productos.remove(producto);
                    System.out.println("Producto Reducido en stock: " + producto.toString());
                } else {
                    System.out.println("Cantidad Reducida en stock: " + producto.toString());
                }
                return;
            }
        }
        System.out.println("Producto no encontrado.");
 }
 
 public static Double calcularValorInventario(ArrayList<Producto> productos) {
    double valorTotal = 0;
    for (Producto producto : productos) {
        valorTotal += producto.cantidad * producto.precio;
    }
    return valorTotal;
}


        public String toString(){
            return "Producto: { Nombre del producto: "+nombre+", codigo: "+codigo+", cantidad:   "+cantidad+",   precio: "+precio+"}"; 
         }
}
