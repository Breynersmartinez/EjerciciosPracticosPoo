package Parcial1_cargos;
import java.util.*;

public class Nomina  {
    
private ArrayList<Cargo> cargo = new ArrayList<Cargo>() ;

public Nomina(ArrayList<Cargo>cargo) {
    this.cargo = cargo;
    
}


/* metodos  */
public void generarPagos()
{
   for(Cargo c : cargo)
   {
    System.out.println("pago generado "+ c.pagar());
   }
}


public ArrayList<Cargo> getCargo() {
    return cargo;
}


}
