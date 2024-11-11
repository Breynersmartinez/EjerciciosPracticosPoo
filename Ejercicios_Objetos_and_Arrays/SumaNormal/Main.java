package Ejercicios_Objetos_and_Arrays.SumaNormal;
import java.util.*;

public class Main {
public static void main (String [] args)
{
    Scanner scanner = new Scanner(System.in);
    boolean bucle = true;
    while(bucle)
    {
    // Definicion del tamaño del arreglo 
    System.out.println(" Ingrese la cantidad de numeros los cuales va a sumar ");
    int n = scanner.nextInt();

    /*Creacion del arreglo con el tamaño ingresado
    desde teclado*/
    int[] numeros = new int[n];



// se llena el arreglo con datos desde el teclado
System.out.println(" Ingrese los numeros "+n+" numeros ");
    for( int i=0; i<n; i++)
    {

        System.out.println(" Numero "+(i+1)+":");
        numeros[i] = scanner.nextInt();
int sumaNum = numeros[i] + numeros[i];

    }


System.out.println(" Los numeros ingresados son ");

//int i=0; i<n; i++
for(int i=0; i<n; i++ )
{
    System.out.print(numeros[i]);





    System.out.println(" El resultado de la operacion es " + sumaNum);
}


    }
}
}
