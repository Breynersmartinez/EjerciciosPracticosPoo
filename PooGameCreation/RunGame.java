import java.util.*;
public class RunGame {
// Metodo principal que ejecuta el juego
public static void main ( String [] args ) {
     Scanner scanner = new Scanner ( System . in ) ;
    
     System.out.print (" Introduce el nombre del jugador 1: ") ;
     String nombre1 = scanner . nextLine () ;
    
    System.out.print(" Introduce el nombre del jugador 2:") ;
     String nombre2 = scanner . nextLine () ;
    
     Personaje juego = new JuegoLucha(nombre1, nombre2, nombre2);
    juego.iniciarPelea();
     }
}
