package Parcial1_cargos;
import java.util.*;
public class Persona {
private int id;
private String nombre;
private String apellidos;
public Persona(int id, String nombre, String apellidos) {
    this.id = id;
    this.nombre = nombre;
    this.apellidos = apellidos;
}



public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellidos() {
    return apellidos;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}
public static void añadir(ArrayList<Persona>pagos, int id, String nombre, String apellidos)
{
Persona persona = new Persona(  id,  nombre,  apellidos);
pagos.add(persona);
}
@Override
public String toString() {
    
    return "Persona [id= " + id + ", nombre= " + nombre + ", apellidos= " + apellidos + "]";
}

}
