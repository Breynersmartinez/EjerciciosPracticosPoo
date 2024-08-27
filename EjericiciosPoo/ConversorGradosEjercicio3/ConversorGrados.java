 class ConversorGrados {
private Double grados_c;
private Double grados_f;

public ConversorGrados(Double grados_c, Double grados_f ){
    this.grados_c = grados_c;
    this.grados_f = grados_f;
}

public Double ConversionCen_Fahr(){
double grados_f = 0.0;
return  grados_f = (grados_c * (9.0/5.0)) + 32.0;
}
public Double  ConversionFahr_Cen(){
double grados_c = 0.0;
return  grados_c = (grados_f - 32.0) * (5.0/9.0);
}

}
