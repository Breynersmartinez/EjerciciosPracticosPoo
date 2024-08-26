class Persona {
    private String nombre;
    private int edad;
    private Double DNI;
    private String sexo;
    private String hombre;
    private String mujer;
    private Double peso;
    private Double altura;

    public Persona( String nombre, int edad, Double DNI, String sexo, String hombre, String mujer, Double peso, Double altura){

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


    return peso/(altura*altura);
 }
        
       
}



