import java.util.Scanner;
public class Ejecuvoidcion {
    public static void main(String[]args)throws Exception{
       
Scanner scanner = new Scanner(System.in);
System.out.println(" Ingrese la base del cuadrado ");
    Double BaseCuadrado = scanner.nextDouble();

 // Crea Objeto de la clase AreaCuadrado y  hace el procedimiento.
 AreaCuadrado areaCuadrado = new AreaCuadrado(BaseCuadrado);


    //Se hace la llamada al metodo areaCuadrado y se muestra la respueta de la operacion.
    Double Respuesta = areaCuadrado.CalculoArea();
    System.out.println(" El area del cuadrado es " + Respuesta);
}




}


