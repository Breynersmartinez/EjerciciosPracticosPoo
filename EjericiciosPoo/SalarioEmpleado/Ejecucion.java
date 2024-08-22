import java.util.Scanner;
public class Ejecucion {
    public static void main(String[]args)throws Exception{
        /**  calcular el salario de un empleado. 
         * salarioNeto = (salarioBruto - deducciones) + comisión */
        Scanner scanner = new Scanner(System.in);
System.out.println(" Ingrese el salario bruto del empleado ");
Dobule SalBruto = scanner.nextDouble();
System.out.println(" Ingrese las deducciones del empleado ");
Double deducciones = scanner.nextDouble();
System.out.println(" Ingrese la comision del empleado ");
Double comision = scanner.nextDouble();

SalarioEmpleado salarioEmpleado = new SalarioEmpleado(SalBruto, deducciones, comision);
Double SalarioNeto = salarioEmpleado.CalculoSalNeto();
System.out.println(" El salario neto del empleado es: + SalarioNeto"+SalarioNeto);
    }
}
