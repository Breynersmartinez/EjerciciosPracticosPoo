// Botón para puertas
class DoorButton extends Button {
    public DoorButton(String type, String state) {
        super(type, state);
    }
      
      //Metodo que muestra el panel de los botones dentro del asensor 
   public static void PanelDoorButtons()
   {
  
       //Simbolo String emergencia 
            String Emergency = " \u26A0";
            System.out.println("  Asensor UCC ");
               System.out.println("_______________");
          String[] floor = { "[1]", "[2]", "\n [3]", "[4]", "\n [5]" };
            for (int i = 0; i < floor.length; i++) {
             System.out.print( " " + floor[i] + " ");
             
                }
            System.out.println("\n_______________");
            
   }
}