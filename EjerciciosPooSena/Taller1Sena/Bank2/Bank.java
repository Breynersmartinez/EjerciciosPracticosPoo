import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Client> clients;
    private ArrayList<Employee> employees;
    private ArrayList<InvestmentCompany> investmentCompanies;

    public Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.investmentCompanies = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addInvestmentCompany(InvestmentCompany company) {
        investmentCompanies.add(company);
    }
}
