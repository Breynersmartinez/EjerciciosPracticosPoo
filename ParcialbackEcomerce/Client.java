package ParcialbackEcomerce;
import java.util.*;

public class Client {
//Cedula
private String idCard;
//Nombre
private String name;

public Client(String idCard, String name) {
    this.idCard = idCard;
    this.name = name;
}

public String getIdCard() {
    return idCard;
}

public void setIdCard(String idCard) {
    this.idCard = idCard;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}
// Metodo para añadir cliente
public static void add(ArrayList<Client>clients, String idCard, String name)
{
Client client = new Client(idCard, name);
clients.add(client);
}


@Override
public String toString() {
    return " Cliente { Cedula= " + idCard + ", Nombre = " + name + " }";
}


}
