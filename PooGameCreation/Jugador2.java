import java.util.Random;

public class Jugador2 extends Personaje{
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;
    public Jugador2(String nombre) {
        super(nombre);
    }

    // Sobrescribe el método atacar para añadir comportamiento específico
    @Override
// Metodo para realizar un ataque a otro personaje
public void atacar ( Personaje oponente ) {
    Random rand = new Random () ;
    int dano = rand.nextInt (( MAX_DANO - MIN_DANO ) + 1) + MIN_DANO ; // Dano entre 10 y 30
    oponente.recibirDano ( dano ) ;
    System.out.println( this . getNombre() + " ataca a " +
   oponente.getNombre () + " causando " + dano + "puntos de dano .") ;
    }
   
}
