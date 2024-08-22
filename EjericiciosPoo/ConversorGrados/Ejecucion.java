import java.util.Scanner;
public class Ejecucion {
    public static void main(String[] args) throws Exception{
        
        Scanner scanner = new Scanner(System.in);

        /* Conversion grados centigrados a fahrenheit */
        System.out.println(" Ingrese los grados centigrados paraa convertirlos a fahrenheit ");
        Double grados_c = scanner.nextDouble();

        //Conversion grados  fahrenheit a  centigrados 
        System.out.println(" Ingrese los grados fahrenheit para convertirlos a centigrados ");
        Double grados_f = scanner.nextDouble();

        ConversorGrados conversorGrados = new ConversorGrados(grados_c, grados_f);
        Double RespuestaConversionCen_fahr = conversorGrados.ConversionCen_Fahr();
        System.out.println(" Los grados centigrados  convertidos a fahrenheit "+RespuestaConversionCen_fahr);
        
        Double RespuestaConversionCenFahrCen = conversorGrados.ConversionFahr_Cen();
        System.out.println(" Los grados fahrenheit  convertidos a centigrados " + RespuestaConversionCenFahrCen); 

    }
}
