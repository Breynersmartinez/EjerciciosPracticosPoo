import java.util.ArrayList;
import java.util.List;
class Producto{
    //atributos 
    private List<String> producto;
    private String NombreProducto;
    private int codigo;
    private int cantidad;
    private Double precio;
    
    //Constructor
    public Producto( String  NombreProducto, int codigo, int cantidad, Double precio){
        this.NombreProducto = NombreProducto;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public void añadir( int cantidad){
       productos.add(producto);

    }
    
    /*public int reducir( int cantidad){
        
    }
    public Double calculoValorInventario(){
        
    } */
    public String toString(){
        return "Producto { Nombre del producto: "+NombreProducto+", Codigo del producto: "+codigo+", Cantidad de unidades: "+cantidad+", Precio del producto: "+precio+"}";
    }
}