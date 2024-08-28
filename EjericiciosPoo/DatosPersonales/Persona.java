class Persona {
    private String nombre;
    private String hombre;
    private String mujer;
    private String sexo;
    private Double DNI;
    private Double peso;
    private Double altura;
    private int edad;
    
    public Persona(String nombre, int edad, Double DNI, String sexo, String hombre, String mujer, Double peso, Double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.hombre = hombre;
        this.mujer = mujer;
        this.peso = peso;
        this.altura = altura;
        
    }
    
 public Double calcularIMC(){
    return peso/altura*altura;
 }
        
       
}





