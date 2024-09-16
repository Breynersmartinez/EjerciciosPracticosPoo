package src.Services;
import src.Entity.NumeroEntity;
import src.Repository.NumeroRepository;

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
