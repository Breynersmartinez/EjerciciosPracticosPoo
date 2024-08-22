public class SalarioEmpleado {
    private Double SalBruto;
    private Double deducciones;
    private Double comision;
    private Double SalarioNeto;

    public SalarioEmpleado(Double SalBruto, Double deducciones, Double comision, Double SalarioNeto){
        this.SalBruto = SalBruto;
        this.deducciones = deducciones;
        this.comision = comision;
        this.SalarioNeto = SalarioNeto;
    }

    public Double CalculoSalNeto(){
        return SalarioNeto = (SalBruto - deducciones) + comision;
    }
}
