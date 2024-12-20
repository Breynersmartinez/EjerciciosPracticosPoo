package src;
import java.util.Random;
import java.util.*;

// Representa la puerta del elevador
class Door {
    private boolean open;

    public Door() {
        this.open = false;
    }


    //Metodo que muestra el estado de las puertas en este caso, las puertas estan abiertas
    public String openDoor() {
        if (!open) {
            open = true;
            return "Puertas abiertas.";
        } else {
            return "Las puertas ya están abiertas.";
        }
    }

    //Metodo del estado de las puertas, puertas cerradas
    public String closeDoor() {
        if (open) {
            open = false;
            return "Puertas cerradas.";
        } else {
            return "Las puertas ya están cerradas.";
        }
    }
    
        //metodo del obstaculo en la puerta 
        public boolean obstacule()
        {
                //simulacion de obstaculacion 
                
            return Math.random() < 0.1;
        }
        
    
}