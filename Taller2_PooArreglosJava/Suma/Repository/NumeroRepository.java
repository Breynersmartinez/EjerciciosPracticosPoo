package Repository;

import Entity.NumeroEntity;
import java.util.ArrayList;
import java.util.List;

public class NumeroRepository {
    private List<NumeroEntity> numeros = new ArrayList<>();

    public void save(NumeroEntity numero) {
        numeros.add(numero);
    }

    public List<NumeroEntity> findAll() {
        return numeros;
    }
}
