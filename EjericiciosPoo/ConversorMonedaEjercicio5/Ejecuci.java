import java.util.Scanner;
/*convertir pesos a dolares y pesos a euros */
public class Ejecuci{
    public static void main(String []args)throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ingrese el monto en pesos Colombianos para hacer la conversion a Dolares.");
        Double PesosDolares = scanner.nextDouble();
        System.out.println(" ingrese el monto en pesos Colombianos para hacer la conversion Euros. ");
        Double PesosEuros = scanner.nextDouble();

        //
        ConversorMoneda conversorMoneda = new ConversorMoneda(PesosDolares, PesosEuros);
        Double ConversionDolares = conversorMoneda.CalculoDolares();
        System.out.println(" La conversion de pesos Colombianos a Dolare es igual a " +ConversionDolares);

        //
        Double ConversionEuros = conversorMoneda.CalculoEuros();
        System.out.println(" La conversion de pesos Colombianos a Euros es igual a " + ConversionEuros);
    }
}