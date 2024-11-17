package src;
// Botón para pisos
class FloorButton extends Button {
    public FloorButton(String type, String state) {
        super(type, state);
    }



    //Metodo de botones de subir, bajar, emergencia y salir de las opciones 
    public static void displayPanel() {
     System.out.println("  Asensor UCC ");
    // Simbolo String Subir
    String goUp = "\u2191";
    // Simbolo String bajar
    String goDown = "\u2193";
      //Simbolo String emergencia 
     String Emergency = " \u26A0";
    
         System.out.println("_________________________________________");
        System.out.println("[s: Subir "+ goUp +"] [b: Bajar "+goDown+"] ");
        System.out.println("[e: Emergencia "+ Emergency+"] [ q: Salir ]");
         System.out.println("__________________________________________");
    }


    public  String toString()
    {
        return "[ Boton ]: [ Tipo de boton: " + getType() + ", Estado del boton: " +getState()+" ]";
    }
    
}