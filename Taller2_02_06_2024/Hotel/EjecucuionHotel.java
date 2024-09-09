import java.util.ArrayList;
import java.util.Scanner;
public class EjecucuionHotel {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hotel> clientes = new ArrayList<Hotel>();
        boolean bucle = true;
        while(bucle)
        {
            
             System.out.println("   +. Crear reserva "); 
              System.out.println("  -. Cancelar reserva "); 
               System.out.println(" c. Consultar informacion de la reserva "); 
               
               String  opc = scanner.nextLine();
               switch(opc)
               {
                   //Crear reserva
                        case "+":
                              // nombre cliente 
          System.out.println(" Nombre del cliente  "); 
          String nombre = scanner.nextLine();
          // fecha entrada
          System.out.println(" Fecha de entrada ");
          String fechaEn = scanner.nextLine();
          
          // fecha salida 
          System.out.println(" Fecha salida  ");  
          String fechaSal = scanner.nextLine();
          // n habitacion 
          System.out.println(" Numero de habitacion "); 
          int nHabitacion = scanner.nextInt();
    
          Hotel.añadir(clientes, nombre,  fechaEn,  fechaSal,  nHabitacion);

        
                       break;
                       
                       
                       
                      // Cancelar reserva
                        case "-":
                       break;
                       
                       
                       
                       //Consultar informacion de la reserva
                        case "c":
                        for ( Hotel consulta : clientes)
                        {
                            System.out.println(" Reserva: "+consulta.toString());
                        }
                       break;
                       default:
                       System.out.println(" Opcion invalida "); 
               }   
                   
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
            
          
        
        }
    }
}
