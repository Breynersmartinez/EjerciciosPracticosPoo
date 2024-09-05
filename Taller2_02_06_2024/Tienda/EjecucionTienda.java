import java.util.Scanner;
public class EjecucionTienda {
    public static void main(String []args)throws Exception{
    Scanner scanner = new Scanner(System.in);
            boolean bucle = true;
            while(bucle){
            System.out.println("    Tienda Breiner                ");
            System.out.println("   c.Añade Productos             ");
            System.out.println("   d.Eliminar Productos          ");
            System.out.println("   v.calcular valor inventario   ");
            String ops = scanner.nextLine();
            switch(ops){
               case "c":
                   System.out.println(" nombre del producto     ");
                   String NombreProducto = scanner.nextLine();
                   System.out.println(" Codigo del producto     ");
                   int codigo = scanner.nextInt();
                   System.out.println(" cantidad del producto   ");
                   int cantidad = scanner.nextInt();
                   System.out.println(" precio del producto     ");
                   Double precio = scanner.nextDouble();
                   
                   Producto producto = new Producto(   "carne de res",  123, 1000, 18600.50);
                   Producto productos = new Producto(   NombreProducto,  codigo,  cantidad,  precio);
                   productos.add(producto);
                   System.out.println(producto.toString());
                   System.out.println(productos.toString());
                   
                   
                   
                   break;
                   
                   case "d":;
                   break;
                   
                       case "v":
                           break;
                           
                           default:
                           break;
            }
            }
        }
    }
