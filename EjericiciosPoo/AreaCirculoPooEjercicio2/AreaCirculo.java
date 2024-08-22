class AreaCirculo {
    private Double radio;
    
    public  AreaCirculo( Double radio ){
    this.radio = radio; //atributo
    }

    public Double CalculoArea(){
       
        final double PI = 3.1416;  //Constante
        return  PI * (radio * radio); //Operacion
         
    }
}
