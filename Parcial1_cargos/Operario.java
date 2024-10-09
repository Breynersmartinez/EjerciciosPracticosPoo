package Parcial1_cargos;

public class Operario  {
private Double horas;
final Double valorHora = 5500.00;

public Operario(double horas) {
    this.horas = horas;
}
public Double pagar()
{
   
    return valorHora*horas;
}

}
