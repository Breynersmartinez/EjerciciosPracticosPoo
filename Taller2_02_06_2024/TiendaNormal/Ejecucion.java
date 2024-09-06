import java.util.Scanner;
import java.util.ArrayList;
public class Ejecucion {
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

public static void main(String[] args)throws Exception{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Producto> productos = new ArrayList<Producto>();
    boolean bucle = true;
    while(bucle){
    System.out.println(" Tienda de Breiner ");
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
        
       Producto.añadir( productos, nombre,  codigo,  cantidad,  precio);
        
        break;
        case "+":
        // proceso de añadir unidades de productos 
        System.out.println(" Codigo del producto ");
        int codigoañadir=scanner.nextInt();
        System.out.println(" Unidades para añadir");
        int unidadesañadir=scanner.nextInt();
        
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
        for(Producto l : productos){
            System.out.println(l.toString());
        }
        break;
        case "t":
        // proceso calculo total del inventario

        break;

        default:
        System.out.println("opcion no encontrada Vuelva a intentarlo");
    }
}

}
}

