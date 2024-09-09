
import java.util.ArrayList;
 class Hotel {
    private String nombre;
    // fecha entrada
    private String fechaEn;
    // fecha salida 
    private String fechaSal;
    // n habitacion 
    private int nHabitacion;
    public Hotel(String nombre, String fechaEn, String fechaSal, int nHabitacion)
    {

       this.nombre  = nombre;
        this.fechaEn = fechaEn;
        this.fechaSal = fechaSal;
        this.nHabitacion = nHabitacion;
    }

public static void añadir(ArrayList<Hotel>clientes, String nombre, String fechaEn, String fechaSal, int nHabitacion)
{
Hotel hotel = new Hotel(nombre,  fechaEn,  fechaSal,  nHabitacion);
clientes.add(hotel);
System.out.println(" Cliente " + hotel.toString());
}

    public String toString()
    {
        return  " Cliente: { Nombre: "+nombre+", Fecha de entrada:"+  fechaEn+",  Fecha de salida:"+fechaSal+",  Numero de habitacion:"+nHabitacion+ " } ";
    }
}
