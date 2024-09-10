import java.util.ArrayList;



class Producto{
    //apublic int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    tributos 
    private String NombreProducto;
    private int codigo;
public c getString() {
        return String;
    }

    public Producto(String nombreProducto, int codigo, int cantidad, Double precio) {
    NombreProducto = nombreProducto;
    this.codigo = codigo;
    this.cantidad = cantidad;
    this.precio = precio;
}

    public Producto(String nombreProducto, int cantidad, Double precio) {
        NombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setString(c string) {
        String = string;
    }
    private int cantidad;
    private Double precio;
    
    /

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }/Constructor
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
    public static void añadir(ArrayList<Producto> productos, String nombre, int codigo, int cantidad, double precio) {
        Producto producto = new Producto(nombre, codigo, cantidad, precio);
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
    @Override
    public String toString() {
        return "Producto [NombreProducto=" + NombreProducto + ", codigo=" + codigo + ", cantidad=" + cantidad
                + ", precio=" + precio + "]";
    }
}

@Override
   public String toString() {
      return "Producto [NombreProducto=" + NombreProducto + ", codigo=" + codigo + ", cantidad=" + cantidad
            + ", precio=" + precio + "]";
   }