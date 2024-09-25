package Services;
import Repository.RepositoryCajero;
import Entity.EntityCajero;



public class ServicesCajero {
    private RepositoryCajero repositoryCajero = new RepositoryCajero();

    public void depositar(EntityCajero cuenta, Double deposito) {
        cuenta.setSaldo(cuenta.getSaldo() + deposito);
        repositoryCajero.save(cuenta);
    }

    public Double saldo(EntityCajero cuenta) {
        return cuenta.getSaldo();
    }

    public void retirar(EntityCajero cuenta, Double retiro) {
        if (cuenta.getSaldo() >= retiro) {
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
            repositoryCajero.save(cuenta);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}


