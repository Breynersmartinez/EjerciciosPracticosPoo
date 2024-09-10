
import java.util.*; // el  * importa todas las librerias 
public class Clase9_09_24 {
    public static void main( String [] args)
    {
        /* Primer arreglo basico  */
int [] a = { 1, 2, 3, 4 };
for   ( int i =0; i < a.length; i++)
{
    System.out.println( "["+i+"]="+a[i]);
}

System.out.println( "________________________________________________________________");
// arreglo para mostrar elementos random
int [] b = new int  [4];
Random random = new Random();
for ( int i = 0; i < b.length; i++)
{
    b[i] = random.nextInt( 20) + 1;
    System.out.println( "b["+i+"]="+b[i]);
}



System.out.println( "________________________________________________________________");
//

    }

}
