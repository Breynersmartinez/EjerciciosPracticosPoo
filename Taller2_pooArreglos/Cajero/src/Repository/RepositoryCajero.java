package Repository;
import java.util.ArrayList;
import java.util.List;
import Entity.EntityCajero;

public class RepositoryCajero {
    private ArrayList<EntityCajero> movimientos = new ArrayList<>();

    public void save(EntityCajero movimiento) {
        movimientos.add(movimiento);
    }

    public List<EntityCajero> findAll() {
        return movimientos;
    }
}
