class AreaCuadrado{
    //El atributo que almacena el numero
    private Double BaseCuadrado;
    
    //Constructor que inicializa el numero
    public AreaCuadrado(Double BaseCuadrado){
        this.BaseCuadrado = BaseCuadrado;
    }


    //Metodo para hacer  la operacion 
    public Double CalculoArea(){
        return BaseCuadrado * BaseCuadrado;
    }
}