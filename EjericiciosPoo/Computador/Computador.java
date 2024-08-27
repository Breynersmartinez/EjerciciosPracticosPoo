 class computador {
    private String marca;
    private String color;
    private String modelo;
    private int serie;
    private Double pulgadas;

    public computador( String marca, String color, String modelo, int serie, Double pulgadas){
        
        
        //es un puntero hacia la instancia del objeto o una autoreferecnai 
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.serie = serie;
        this.pulgadas = pulgadas;
    }

    public boolean encender(){
        return true;
    }
    public boolean apagar(){
        return true;
    }
    public void  recibir( String oficina){
        System.out.println( " El computador de marca "+marca+" El computador se reubico en la oficina " + oficina);
    }
    public void  asignar(String trabajador){
        System.out.println(" El computador con serie "+ serie +" fue asignado a " +trabajador);
    }

    /* Metodo toString  es la mama de los metodos, sirve para mostrar el objeto */
    public String toString(){
        return "Computador{ marca: "+marca+" color: "+color+" modelo: " + modelo + " serie: "+ serie+ " Pulgadas: " + pulgadas + "}";
    }
}
