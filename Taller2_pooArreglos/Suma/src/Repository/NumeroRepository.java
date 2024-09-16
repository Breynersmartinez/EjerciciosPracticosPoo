package src.Repository;
import java.util.ArrayList;
import java.util.List;
import src.Entity.NumeroEntity;
public class NumeroRepository {
    private List<NumeroEntity> numeros = new ArrayList<>();

    public  void save(NumeroEntity numero) {
        numeros.add(numero);
    }

    public List<NumeroEntity> findAll() {
        return numeros;
    }
}
