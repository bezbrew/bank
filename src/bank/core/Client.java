package bank.core;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name, surname;
    private String customerNumber;
    private List<Account> accountList;

    public Client(String name, String surname, String customerNumber) {
        this.name = name;
        this.surname = surname;
        this.customerNumber = customerNumber;
        accountList = new ArrayList<>();

    }

    private String pesel;

    public String getPesel() {
        return pesel;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }


    public boolean addAccount(AccountType accountType, String accountNumber){
        return accountList.add(new Account(accountNumber, accountType));
    }

    public boolean deleteAccount(String accountNumber) {
        for(Account account : accountList) {
            if(account.getAccountNumber().equals(accountNumber))
            if (account.getBalance().equals(BigDecimal.ZERO))
                return accountList.remove(account);
        }
        return false;
    }
}
