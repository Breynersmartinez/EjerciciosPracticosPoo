package src.Repository;

import java.util.ArrayList;
import java.util.List;

import src.Entity.NumeroEntity;
import src.Services.ServicesHotel;
import src.Entity.EntityHotel;
public class RepositoryHotel
{
ArrayList<EntityHotel> clientes = new ArrayList<EntityHotel>();


public  void añadir(EntityHotel cliente, String nombre, String fechaEn, String fechaSal, int nHabitacion)
{ 
clientes.add(cliente);

}

    public List<EntityHotel> findAll() {
        return clientes;
    }

}