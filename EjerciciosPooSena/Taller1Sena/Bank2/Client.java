import java.util.*;
public class Client {
    private String clientId;
    private String name;
    private ArrayList<Account> accounts;

    public Client(String clientId, String name) {
        this.clientId = clientId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public double getTotalBalance() {
        double total = 0;
        for (Account account : accounts) {
            total += account.getBalance();
        }
        return total;
    }
}
