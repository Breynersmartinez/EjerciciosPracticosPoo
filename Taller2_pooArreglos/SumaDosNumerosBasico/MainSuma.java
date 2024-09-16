import java.util.*;
public class MainSuma
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        ProcesoSuma[] procesoSumas = new ProcesoSuma[6];
boolean bucle = true;
while(bucle)
{
        for ( int i =0; i<procesoSumas.length; i++)
        {
            System.out.println("Ingrese el numero " + (i+1) + " : " );
            Double num = scanner.nextDouble();
            procesoSumas[i] = new ProcesoSuma(num);// Guardar el objeto en el array
        }
        for ( ProcesoSuma consulta : procesoSumas)
        {
            System.out.println(consulta.toString()+Resultado);
        }
        Double Resultado = procesoSumas[0].getNum() + procesoSumas[1].getNum();
        System.out.println(" El resultado de la operacion es "+Resultado);


       
    }
    }
}