 class PagoPArqueadero {
    //calcular el pago de un parqueadero por horas. Valor de  la hora $2000 también se debe discriminar el IVA del 20% que se paga
    private Double Horas;

    public PagoPArqueadero(Double Horas){
        this.Horas = Horas;
    }

    public Double CalculoHoras(){
        int ValorHora=2000;
        return (Horas * ValorHora)/20*100;
    }
}
