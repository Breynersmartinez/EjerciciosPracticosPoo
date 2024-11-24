package src;

import java.util.*;
// Coordina las operaciones
class ControlSystem {
    
    
 
    private Elevator elevator;   //Aplicacion de la composicon y la agregaaion 
    private List<Floor> floors;
    Door door = new Door();
     //estado de los botones de las puertas
    Button doorButton = new DoorButton("Botónes de estado de las puertas", "Activos"); 
    Scanner scanner = new Scanner(System.in);

    public ControlSystem() {
        this.elevator = new Elevator();
        //Lista de pisos 
        this.floors = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            //añade un  nuevo piso a la lista 
            floors.add(new Floor(i));
        }
    }

    public void start() {
     
        boolean running = true;

       while (running) {
            System.out.println("\nPanel de control:");
            FloorButton.displayPanel();
            System.out.println("Seleccione una opción:");
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "s": // Subir
               
                  System.out.println(elevator.getDoor().openDoor());
                 
       
       if(door.obstacule())
                {
                   System.out.println(" Hay obstaculo en la puerta, la puerta no se cerrara");  
                    System.out.println(elevator.getDoor().openDoor());
                   
                }else 
                {
                    System.out.println(" No hay obstaculo en la puerta");
                        System.out.println(elevator.getDoor().closeDoor());
                }
                
                    handleFloorSelection(scanner);
                   
                    break;
              
                case "b": // Bajar
              
                    System.out.println(elevator.getDoor().openDoor());
                if(door.obstacule())
                {
                   System.out.println(" Hay obstaculo en la puerta, la puerta no se cerrara");  
                    System.out.println(elevator.getDoor().openDoor());
                   
                }else 
                {
                    System.out.println(" No hay obstaculo en la puerta");
                        System.out.println(elevator.getDoor().closeDoor());
                }
                
                
                    handleFloorSelection(scanner);
                   
                    break;
                case "q": // Salir
                     ControlSystem.indicatorIconFiled();
                    System.out.println("Apagando el sistema...");
                    
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                     ControlSystem.indicatorIconFiled();
            }
        }

     
    }
    
    
    

    // metodo privado que Maneja de los pisos del asensor
    private void handleFloorSelection(Scanner scanner) {
        
          DoorButton.PanelDoorButtons();
        Button floorButton = new FloorButton("Botónes del tablero de la  de puerta", "Activos");
        System.out.println(floorButton.toString());

        System.out.println("Seleccione un piso (1-5):");
        
  
   
        try {
            int selectedFloor = Integer.parseInt(scanner.nextLine());
            
            if (selectedFloor < 1 || selectedFloor > 5 ) {
                throw new NumberFormatException();
            }
            
            elevator.moveToFloor(selectedFloor);
            handleDoorOperation(scanner);
        
            
             
                
                
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Intente de nuevo.");
            
             ControlSystem.indicatorIconFiled();//Icono  de confirmacion denegada
        }
   
    }
    
    

    
 
    
//iconos indicadores
  public static void  indicatorIcon()
  {
       //Icono  de confirmacion aceptada
    String textConEmoji = "¡Solicitud Aceptada! LUZ AZUL \uD83D\uDD35";
    System.out.println(textConEmoji);
      
  }
  
  public static void indicatorIconFiled()
  {
      //Icono  de confirmacion denegada
    String textEmoji = "¡Solicitud denegada! LUZ ROJA \uD83D\uDD34";
    System.out.println(textEmoji);
      
  }
  //______________________________________________________//
  
    private void handleDoorOperation(Scanner scanner) {
       
       
        System.out.println(doorButton.toString());
        System.out.println("Operar puertas:  (a: Abrir <>)");
         System.out.println("Operar puertas: (c: Cerrar ><)");
         System.out.println("Operar puertas: (e: EMERGENCIA )");
        String input = scanner.nextLine();
      
        switch (input.toLowerCase()) {
            case "a":
                
                System.out.println(elevator.getDoor().openDoor());
                
                break;
            case "c":
              
                //simulacion obstaculo
              
                   if(door.obstacule())
                {
                   System.out.println(" Hay obstaculo en la puerta, la puerta no se cerrara");  
                    System.out.println(elevator.getDoor().openDoor());
                   
                }else 
                {
                    System.out.println(" No hay obstaculo en la puerta");
                        System.out.println(elevator.getDoor().closeDoor());
                }
                
                
                break;
                
                case "e":
                    
         
                
                   doorButton.emergency();
                   
          
                    break;
            default:
                System.out.println("Opción no válida.");
                ControlSystem.indicatorIconFiled();//Icono  de confirmacion denegada
        }
    }
}