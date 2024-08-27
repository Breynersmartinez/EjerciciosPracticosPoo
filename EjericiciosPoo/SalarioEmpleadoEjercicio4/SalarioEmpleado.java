class SalarioEmpleado {
    private Double SalBruto;
    private Double deducciones;
    private Double comision;
 
    public SalarioEmpleado(Double SalBruto, Double deducciones, Double comision){
        this.SalBruto = SalBruto;
        this.deducciones = deducciones;
        this.comision = comision;
      
    }

    public Double CalculoSalNeto(){
        return (SalBruto - deducciones) + comision;
    }

   
}
