package src;
// Representa el elevador
class Elevator {
    //Atributo del Piso actual del asensor 
    private int currentFloor;
    //Aplicacion de la Composicion y agregacion
    private Door door;

    public Elevator() {
        this.currentFloor = 1;
        this.door = new Door();
    }
    
    //metodo get que retorna el piso actual en el que esta el asensor
    public int getCurrentFloor() {
        return currentFloor;
    }
    
   //Musica o sonido del elevador,  
    public static void MusicElevator()
    {
        System.out.println( " Sonando... musica relajante ");
    }
    //Metodo del Movimiento del elevador 
    public void moveToFloor(int floor) {
        ControlSystem.indicatorIcon();
        System.out.println("Elevador moviéndose del piso " + currentFloor + " al piso " + floor);
        
        Elevator.MusicElevator();
        
        currentFloor = floor;
        System.out.println("Elevador llegó al piso " + currentFloor);
    }
    
    
    public Door getDoor() {
        return door;
    }
}
