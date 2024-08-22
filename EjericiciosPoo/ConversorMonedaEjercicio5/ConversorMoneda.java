 class ConversorMoneda {
    /*convertir pesos a dolares y pesos a euros */
    //atributos
    private Double PesosDolares;
    private Double PesosEuros;

    public ConversorMoneda(Double PesosDolares, Double PesosEuros){
        this.PesosDolares = PesosDolares;
        this.PesosEuros = PesosEuros;
    }

    public Double CalculoDolares(){
        Double Dolar = 4.072;
        return PesosDolares*Dolar;
    }

    public Double CalculoEuros(){
        Double Euro = 4.524;
        return PesosEuros*Euro;
    }
}

