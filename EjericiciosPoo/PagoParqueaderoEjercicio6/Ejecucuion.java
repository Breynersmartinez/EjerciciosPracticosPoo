import java.util.Scanner;
public class Ejecucuion {
    //calcular el pago de un parqueadero por horas. Valor de  la hora $2000 también se debe discriminar el IVA del 20% que se paga
public static void main(String[]args)throws Exception{
    Scanner scanner = new Scanner(System.in);
    System.out.println(" Ingrese la horas que se estuvo usando el servicio ");
Double Horas = scanner.nextDouble();

PagoPArqueadero pagoPArqueadero = new PagoPArqueadero(Horas);
Double TotalHoras = pagoPArqueadero.CalculoHoras();
System.out.println(" El valor es de   $" +TotalHoras+" por "+ Horas +" Horas " + " Totales, discriminando el IVA del 20%");
}
   
}
