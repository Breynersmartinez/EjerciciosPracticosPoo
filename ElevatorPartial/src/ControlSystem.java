package src;

import java.util.*;
// Coordina las operaciones
class ControlSystem {
    
    
 
    private Elevator elevator;   //Aplicacion de la composicon y la agregaaion 
    private List<Floor> floors;

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
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nPanel de control:");
            FloorButton.displayPanel();
            System.out.println("Seleccione una opción:");
            String input = scanner.nextLine();

            switch (input.toLowerCase()) {
                case "s": // Subir
                case "b": // Bajar
                    handleFloorSelection(scanner);
                    break;
                case "e": // Emergencia
                    System.out.println("¡Emergencia activada! Enviando señal  de emergencia...");
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
        Button floorButton = new FloorButton("Botónes del tablero de la  de puerta", "Activos");
        System.out.println(floorButton.toString());

        System.out.println("Seleccione un piso (1-5):");
        

         DoorButton.PanelDoorButtons();
        try {
            int selectedFloor = Integer.parseInt(scanner.nextLine());
            if (selectedFloor < 1 || selectedFloor > 5) {
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
    String textConEmoji = "¡Solicitud Aceptada! \uD83D\uDD35";
    System.out.println(textConEmoji);
      
  }
  
  public static void indicatorIconFiled()
  {
      //Icono  de confirmacion denegada
    String textEmoji = "¡Solicitud denegada! \uD83D\uDD34";
    System.out.println(textEmoji);
      
  }
  //______________________________________________________//
  
    private void handleDoorOperation(Scanner scanner) {
        Button doorButton = new DoorButton("Botónes de estado de las puertas", "Activos");
        System.out.println(doorButton.toString());
        System.out.println("Operar puertas:  (a: Abrir <>)");
         System.out.println("Operar puertas: (c: Cerrar ><)");
        String input = scanner.nextLine();
      
        switch (input.toLowerCase()) {
            case "a":
                
                System.out.println(elevator.getDoor().openDoor());
                break;
            case "c":
                System.out.println(elevator.getDoor().closeDoor());
                break;
            default:
                System.out.println("Opción no válida.");
                ControlSystem.indicatorIconFiled();//Icono  de confirmacion denegada
        }
    }
}