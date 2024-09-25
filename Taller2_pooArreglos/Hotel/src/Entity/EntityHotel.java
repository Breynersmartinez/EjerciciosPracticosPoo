package src.Entity;

public class EntityHotel {
    private String nombre;
    // fecha entrada
    private String fechaEn;
    // fecha salida
    private String fechaSal;
    // n habitacion
    private int nHabitacion;

    public EntityHotel(String nombre, String fechaEn, String fechaSal, int nHabitacion) {

        this.nombre = nombre;
        this.fechaEn = fechaEn;
        this.fechaSal = fechaSal;
        this.nHabitacion = nHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaEn() {
        return fechaEn;
    }

    public void setFechaEn(String fechaEn) {
        this.fechaEn = fechaEn;
    }

    public String getFechaSal() {
        return fechaSal;
    }

    public void setFechaSal(String fechaSal) {
        this.fechaSal = fechaSal;
    }

    public int getnHabitacion() {
        return nHabitacion;
    }

    public void setnHabitacion(int nHabitacion) {
        this.nHabitacion = nHabitacion;
    }

    public String toString() {
        return " Cliente: { Nombre: " + nombre + ", Fecha de entrada:" + fechaEn + ",  Fecha de salida:" + fechaSal
                + ",  Numero de habitacion:" + nHabitacion + " } ";
    }
}
