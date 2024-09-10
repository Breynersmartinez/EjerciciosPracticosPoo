import java.util.ArrayList;
import java.util.Scanner;

public class Ejeccion {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
    ArrayList<Producto> Productos = new ArrayList<Producto>();
    boolean tr = true;
    while(tr){
    System.out.println(" Tienda de Breiner t");
    System.out.println(" c.añadir productos  ");
    System.out.println(" +.añadir unidades a productos en stock ");
    System.out.println(" -.Reducir unidades de productos en stock");
    System.out.println(" t.Calculo del total del inventario  ");
    System.out.println(" l.Ver productos añadidos");
    String opcion = scanner.nextLine();
    switch(opcion){
        case "c":
        //Creacion de nuevos los productos para la tienda
        
        System.out.println(" Nombre del producto             ");
        String nombre = scanner.nextLine();
        System.out.println(" Codigo del producto            ");
        int codigo=scanner.nextInt();
        System.out.println(" Cantidad en stock                ");
        int cantidad=scanner.nextInt();  
        System.out.println(" precio dl producto por unidad  ");
        Double precio = scanner.nextDouble();
        
       Producto.añadirProducto( Productos, nombre,  codigo,  cantidad,  precio);
        
        break;
        case "+":
        // proceso de añadir unidades de productos 
        System.out.println(" Codigo del producto ");
        int codigoañadir=scanner.nextInt();
        System.out.println(" Unidades para añadir");
        int unidadesañadir=scanner.nextInt();
        Producto.añadir(Productos, codigoañadir,unidadesañadir);
        
        break;
        case "-":
        // proceso de eliminar unidades de productos
        System.out.println(" Codigo del producto ");
        int codigoEliminar=scanner.nextInt();
        System.out.println(" Unidades para añadir");
        int unidadeEliminar=scanner.nextInt();
        break;
        case "l":
        // Mostrar productos añadidos
        for( Producto l: Productos){
    System.out.println(l.toString());
        }
        break;
        case "t":
        // proceso calculo total del inventario
        Double valortl = Producto.calcularValorInventario(Productos);
       System.out.println("Valor total del inventario: " + valortl);
        break;

        default:
        System.out.println("opcion no encontrada Vuelva a intentarlo");
    }
    }

    }
}