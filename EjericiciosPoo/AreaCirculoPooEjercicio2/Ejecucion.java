
import java.util.Scanner;
public class Ejecucion {
    public static void main(String[]args)throws Exception{
        //Objeto scanner 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo" );
        Double radio = scanner.nextDouble();

        AreaCirculo areaCirculo = new AreaCirculo(radio);
        
        Double Respuesta = areaCirculo.CalculoArea();
        System.out.println("El area del circulo es"+Respuesta);
    }
}
