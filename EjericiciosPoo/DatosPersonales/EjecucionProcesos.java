import java.util.Scanner;
public class EjecucionProcesos {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        boolean repetir = false;
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
         Double DNI = 0.0;  
         String hombre = "";
         String mujer = "";

//ojeto persona 
        Persona persona = new Persona(  nombre,  edad,  DNI,  sexo,  hombre,  mujer,  peso,  altura );
        Double RespuestaIMC = persona.calcularIMC();
        if(RespuestaIMC <= 20 ){
            System.out.println( " Su peso esta por debajo de su peso ideal ");
        } else if(RespuestaIMC > 25){
            System.out.println( " usted tiene sobre peso ");
        } else {
            System.out.println(" Su peso es ideal con respecto a ssu altura ");
        }
        
    }
    


    }
}
