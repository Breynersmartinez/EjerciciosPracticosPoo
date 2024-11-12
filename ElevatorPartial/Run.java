import java.util.*;

public class Run {
    public static void main(String[] args) throws Exception {
        ArrayList<Floor> Floors = new ArrayList<>();
       Scanner scanner = new Scanner(System.in);
   
       Button floorButton = new FloorButton();
       FloorButton.PanelFloorButtons();
       String opt = scanner.nextLine();
       
       switch (opt) {
           case "s":
               Button doorButton = new DoorButton();
               DoorButton.PanelDoorButtons();
               break;
   
   
               case "b":
               
               break;
           default:
           System.out.println(" La opcion ingresada no existe ");
               break;
       }
   
       }
}
