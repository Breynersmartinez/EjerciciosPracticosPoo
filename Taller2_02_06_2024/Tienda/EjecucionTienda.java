import java.util.ArrayList;
import java.util.Scanner;
public class EjecucionTienda {
    public static void main(String []args)throws Exception{
   boolean bucle = true;
   Scanner scanner = new Scanner(System.in);
          ArrayList<Producto> productos = new ArrayList<Producto>(); 
        while (bucle) {
     
       
            
            System.out.println("    Tienda Breiner                 ");
            System.out.println("   c.Añade Productos               ");
            System.out.println("   +.Añade stock de Productos      ");
            System.out.println("   -.Eliminar stock de Productos   ");
            System.out.println("   p.Ver inventario de productos   ");
            System.out.println("   v.valor inventario");
            String ops = scanner.nextLine();
           

            switch (ops) {
                case "c":
                    // Capturar información del producto
                    System.out.println("Nombre del producto:");
                    String nombreProducto = scanner.nextLine();

                    System.out.println("Código del producto:");
                    int codigo = scanner.nextInt();

                    System.out.println("Cantidad del producto:");
                    int cantidad = scanner.nextInt();

                    System.out.println("Precio del producto:");
                    double precio = scanner.nextDouble();
                    

                    // Crear un nuevo producto y añadirlo a la lista
                                       // Añadir el producto usando el método estático
                    Producto.añadir(productos, nombreProducto, codigo, cantidad, precio);
                    break;
                case "+":
                     System.out.println("Código del producto a añadir unidades ");
                    int codigoAñadir = scanner.nextInt();

                    System.out.println("Cantidad a añadir:");
                    int añadirUn = scanner.nextInt();
                   

                    Producto.añadirUn(productos, codigoAñadir, añadirUn);
                    break;
                case "-":
                       // Reducir cantidad o eliminar producto
                    System.out.println("Código del producto a reducir/eliminar:");
                    int codigoEliminar = scanner.nextInt();

                    System.out.println("Cantidad a reducir:");
                    int reducir = scanner.nextInt();
                   

                    Producto.reducir(productos, codigoEliminar, reducir);
                        break;

                case "p":
                    
                     // Mostrar todos los productos añadidos
                    for (Producto p : productos) {
                        System.out.println(p.toString());
                    }
                    
                    System.out.println( "Inventario de productos ");
                    
                    break;
                    
                    case "v":
                                           // Calcular valor inventario
                    double valorInventario = Producto.calcularValorInventario(productos);
                    System.out.println("Valor total del inventario: " + valorInventario);
                    break;

                   

                default:
                    break;
            }
        }
        }
    }
