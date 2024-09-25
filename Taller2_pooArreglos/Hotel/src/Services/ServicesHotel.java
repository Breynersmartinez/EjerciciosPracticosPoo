package src.Services;
import java.util.ArrayList;

import src.Repository.RepositoryHotel;
public class ServicesHotel 
{


 RepositoryHotel repositoryHotel = new RepositoryHotel();



public static void cancelarRecerva(ArrayList<ServicesHotel>clientes, int nHabitacion)
{
for ( ServicesHotel servicesHotel : clientes)
{
    if (servicesHotel.nHabitacion == nHabitacion) {
        clientes.remove(servicesHotel);
        System.out.println("  reserva eliminada : " + servicesHotel.toString());
    } else
    {
System.out.println(" Reserva no eliminada " + servicesHotel.toString());
    }
    return;
}




}
}