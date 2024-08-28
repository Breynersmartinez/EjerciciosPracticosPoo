import java.util.Scanner;
public class EjecucionProcesos {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        boolean repetir = true;
        while(repetir){
        System.out.println(" Ingrese su nombre ");
        String nombre = scanner.nextLine();
        System.out.println(" Ingrese su peso en kilogramos ");
        Double peso = scanner.nextDouble();
        System.out.println(" Digite su edad ");
        int edad = scanner.nextInt();
        
        System.out.println( " Ingrese su altura ");
        Double altura = scanner.nextDouble();
        System.out.println(" Ingrese su sexo ");
        String sexo = scanner.nextLine();

        //Variable:
         int DNI = 0;  
       

//ojeto persona 
        Persona persona = new Persona(  nombre,  edad,  DNI,  sexo,   peso,  altura );
        System.out.println(persona.toString());
       
        Double RespuestaIMC = persona.calcularIMC();
        if(RespuestaIMC <= 20 ){
            System.out.println( " Su peso esta por debajo de su peso ideal ");
        } else if(RespuestaIMC > 25){
            System.out.println( " usted tiene sobre peso ");
        } else {
            System.out.println(" Su peso es ideal con respecto a ssu altura ");
        }
        
        String DefEdad = persona.CalculoEdad();
        System.out.println(DefEdad);

        int GeneraDni = persona.GeneracionDNI();
        System.out.println( "Su Dni es " + GeneraDni);
    }
    


    }
}
