// Botón genérico
class Button {
    //tipo de boton
    private String type;
    //Estado del botn 
    private String state;

    public Button(String type, String state) {
        this.type = type;
        this.state = state;
    }
    
    
    //Retorna el tipo de boton
    public String getType() {
        return type;
    }
    //Retorna el estado del boton 
    public String getState() {
        return state;
    }
}
