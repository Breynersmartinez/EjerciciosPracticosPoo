import java.util.Scanner;
public class Proceso{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingrese su Contraseña ");
        int Contraseña = scanner.nextInt();
        int ContraseñaUser=12344567;
        if(Contraseña=ContraseñaUser){
Ejecucion Ejecucion = new Ejecucion(Contraseña);
Double MostrarSaldo = Ejecucion.Saldo();
System.out.println(" Su salo es "+saldo);
        }
    }
}