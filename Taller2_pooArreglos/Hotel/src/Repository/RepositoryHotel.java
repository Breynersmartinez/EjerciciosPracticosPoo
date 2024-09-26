package src.Repository;
import java.util.ArrayList;
import java.util.List;
import src.Services.ServicesHotel;
import src.Entity.EntityHotel;


public class RepositoryHotel
{
ArrayList<EntityHotel> clientes = new ArrayList<EntityHotel>();


public  void añadir(ArrayList<EntityHotel>clientes, EntityHotel cliente, String nombre, String fechaEn, String fechaSal, int nHabitacion)
{ 
    EntityHotel entityHotel = new EntityHotel(  nombre,  fechaEn,  fechaSal,  nHabitacion);
clientes.add(cliente);

}

    public List<EntityHotel> findAll() {
        return clientes;
    }

}