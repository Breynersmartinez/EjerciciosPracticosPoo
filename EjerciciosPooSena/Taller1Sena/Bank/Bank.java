import java.util.*;

public class Bank {

    //nombre
private String name;

//Empleados
private ArrayList<Employee> employees;

//clientes
private ArrayList<Client>  clients;

//Empresas inversoras
private ArrayList<InvestmentCompany>  InvestmentCompanies;

public Bank(String name, ArrayList<Employee> employees, ArrayList<Client> clients,
        ArrayList<InvestmentCompany> investmentCompanies) {
    this.name = name;
    this.employees = employees;
    this.clients = clients;
    InvestmentCompanies = investmentCompanies;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public ArrayList<Employee> getEmployees() {
    return employees;
}

public void setEmployees(ArrayList<Employee> employees) {
    this.employees = employees;
}

public ArrayList<Client> getClients() {
    return clients;
}

public void setClients(ArrayList<Client> clients) {
    this.clients = clients;
}

public ArrayList<InvestmentCompany> getInvestmentCompanies() {
    return InvestmentCompanies;
}

public void setInvestmentCompanies(ArrayList<InvestmentCompany> investmentCompanies) {
    InvestmentCompanies = investmentCompanies;
}

@Override
public String toString() {
    return "Bank [name=" + name + ", employees=" + employees + ", clients=" + clients + ", InvestmentCompanies="
            + InvestmentCompanies + "]";
}




}
