import java.util.ArrayList;



class Producto{
 
    
    private String nombre;
    private int codigo;
    private int cantidad;
    private Double precio;
    
    public Producto( String  NombreProducto, int codigo, int cantidad, Double precio){
        this.NombreProducto = NombreProducto;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    

  
    
    
  
    

 

    
 
      
   public static void reducir(ArrayList<Producto> productos, int codigo, int cantidad) {
        for (Producto producto : productos) {
            if (producto.codigo == codigo) {
                producto.cantidad -= cantidad;
                if (producto.cantidad <= 0) {
                    productos.remove(producto);
                    System.out.println("Producto eliminado: " + producto.toString());
                } else {
                    System.out.println("Cantidad reducida: " + producto.toString());
                }
                return;
            }
        }
   


        System.out.println("Producto no encontrado.");
    }
    public static void añadir(ArrayList<Producto> productos, String  NombreProducto, int codigo, int cantidad, Double precio) {
        Producto producto = new Producto(nombreProducto, codigo, cantidad, precio);
        productos.add(producto);
        System.out.println("Producto añadido: " + producto.toString());
    }
    
           public static void añadirUn(ArrayList<Producto> productos, int codigo, int cantidad) {
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

 public static double calcularValorInventario(ArrayList<Producto> productos) {
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

