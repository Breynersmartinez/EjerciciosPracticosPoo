
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

public static void cancelarRecerva(ArrayList<Hotel>clientes, int nHabitacion)
{
for ( Hotel hotel : clientes)
{
    if (hotel.nHabitacion == nHabitacion) {
        clientes.remove(hotel);
        System.out.println("  reserva eliminada : " + hotel.toString());
    } else
    {
System.out.println(" Reserva no eliminada " + hotel.toString());
    }
    return;
}
}
    public String toString()
    {
        return  " Cliente: { Nombre: "+nombre+", Fecha de entrada:"+  fechaEn+",  Fecha de salida:"+fechaSal+",  Numero de habitacion:"+nHabitacion+ " } ";
    }
}
