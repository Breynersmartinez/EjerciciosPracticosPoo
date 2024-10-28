import java.util.Random;
import java.util.*;
public class RunGame {
// Metodo principal que ejecuta el juego
public static void main ( String [] args ) {
     Scanner scanner = new Scanner ( System . in ) ;
    
     System.out.print (" Introduce el nombre del jugador 1: ") ;
     String nombre1 = scanner . nextLine () ;
    
    System.out.print(" Introduce el nombre del jugador 2:") ;
     String nombre2 = scanner . nextLine () ;
    
     Personaje jugador1 = new Jugador1(nombre1);
     Personaje jugador2 = new Jugador2(nombre2);

    JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
    juego.iniciarPelea();
     }
}
