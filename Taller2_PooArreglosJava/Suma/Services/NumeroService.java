package Services;

import Repository.NumeroRepository;
import Entity.NumeroEntity;
public class NumeroService {
    private NumeroRepository numeroRepository = new NumeroRepository();

    public void agregarNumero(int valor) {
        NumeroEntity numero = new NumeroEntity(valor);
        numeroRepository.save(numero);
    }

    public int sumarNumeros() {
        int suma = 0;
        for (NumeroEntity numero : numeroRepository.findAll()) {
            suma += numero.getValor();
        }
        return suma;
    }
}
