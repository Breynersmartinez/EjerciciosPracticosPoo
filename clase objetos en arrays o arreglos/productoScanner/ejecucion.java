import java.util.*;
public class ejecucion {
    public static void main(String[] args) {
        Producto [] productos = new Producto  [4];


        System.out.println(" ingrese id ");
        int id = scanner.nextInt();
        System.out.println( " nombre ");
        String nombre = scanner.nextLine();
        System.out.println(" precio "); 
        Double precio = scanner.nextDouble();

        Producto.añadir(  id, nombre, precio );
      
    }
   
}
