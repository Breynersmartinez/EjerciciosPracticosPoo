package Parcial1_cargos;

public class Consultar extends Cargo{
private double venta;
private double comision;

public Consultar(double venta, double comision) {
    this.venta = venta;
    this.comision = comision;
}

//Metodo proceso de la clase 
public Double pagar()
{
    return comision*venta;
}
@Override
public String toString() {
    return "Consultar [venta=" + venta + ", comision=" + comision + "]";
}

}
