 class PagoPArqueadero {
    //calcular el pago de un parqueadero por horas. Valor de  la hora $2000 también se debe discriminar el IVA del 20% que se paga
    private Double Horas;

    public PagoPArqueadero(Double Horas){
        this.Horas = Horas;
    }

    public Double CalculoHoras(){
        //Valor de hora, ya con el iva discriminado

        final Double  iva=0.20;
        Double  ValorHora =2000/(1+iva);
       
        return (ValorHora*1.20)*Horas;
    }
}
