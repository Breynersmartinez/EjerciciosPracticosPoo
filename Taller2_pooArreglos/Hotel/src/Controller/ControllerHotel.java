package src.Controller;
import java.util.ArrayList;
import java.util.Scanner;

import src.Entity.EntityHotel;
import src.Repository.RepositoryHotel;
import src.Services.ServicesHotel;
public class ControllerHotel {
    public  void  correr() 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<EntityHotel> clientes = new ArrayList<EntityHotel>();
     
        
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
    
         

         EntityHotel entityHotel = new EntityHotel(nombre, fechaEn, fechaSal, nHabitacion);
         clientes.add(entityHotel);


        
                       break;
                       
                      // Cancelar reserva
                        case "-":
                        System.out.println( " Numero de la habitacio");
                        int numcancel = scanner.nextInt();
                        
                        ServicesHotel.cancelarRecerva(clientes, numcancel);
                       break;
                       //Consultar informacion de la reserva
                        case "c":
                        for ( EntityHotel consulta : clientes)
                        {
                            System.out.println(" Reserva: "+consulta.toString());
                        }
                       break;
                       default:
                       System.out.println(" Opcion invalida "); 
               }   
                   
         
        
        }
    }

    public static void main(String[] args) throws Exception {
        ControllerHotel controllerHotel =  new ControllerHotel();
        controllerHotel.correr();
    }
}
