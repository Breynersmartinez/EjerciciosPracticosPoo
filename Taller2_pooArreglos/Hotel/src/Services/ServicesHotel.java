package src.Services;
import java.util.ArrayList;
import src.Entity.EntityHotel;

public class ServicesHotel 
{


 



public static void cancelarRecerva(ArrayList<EntityHotel>clientes, int nHabitacion)
{
for ( EntityHotel cliente : clientes)
{
    if (cliente.getnHabitacion() == nHabitacion)
     {
        clientes.remove(cliente);
        System.out.println("  reserva eliminada : " + cliente.toString());
    } else
    {
System.out.println(" Reserva no eliminada " + cliente.toString());
    }
    return;
}




}
}