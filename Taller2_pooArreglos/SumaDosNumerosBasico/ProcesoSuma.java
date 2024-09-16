import java.util.*;
class ProcesoSuma
{
    //Atributos del objeto 
private Double num;

    //Contructor de la clase 
    public ProcesoSuma(Double num)
    {
this.num = num;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ProcesoSuma [num=" + num + "]";
    }

    
}