import java.util.Random;

class Persona {
    //Atributos
    private String nombre;
    private String sexo;
    private int DNI;
    private Double peso;
    private Double altura;
    private int edad;

    //Consteuctor 
    public Persona(String nombre, int edad, int DNI, String sexo,  Double peso, Double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        
    }

    //Metodo para comprobar si el peso es el indicado
    
 public Double calcularIMC(){
    return peso/altura*altura;
 }
 //Metodo para comprobar si es o no mayor de edad
 public String   CalculoEdad(){
    if(edad>=18)
    {
        return " Usted es mayor de edad ";
    }else{
       return " Usted es menor de edad ";
    }
   
 }

 // Metodo generacion DNI automaticamente con random
 public int GeneracionDNI(){
    Random aleatorio = new Random(System.currentTimeMillis());
// Producir nuevo int aleatorio entre 0 y 99
int intAletorio = aleatorio.nextInt(100000000);

return intAletorio;


 }

//Mama de los metrodos = toString()
    public String toString(){
        return " Persona: " + " Nombre: "+nombre+","+" Edad: " +edad+","+" DNI: "+DNI+","+" Sexo: " +sexo+","+ " Peso: " + peso +","+ " Altura: " +altura+".";
    }    
       
   
}





