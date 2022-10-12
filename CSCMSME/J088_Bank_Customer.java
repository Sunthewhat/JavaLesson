import java.util.*;

public class J088_Bank_Customer {

    public static void main(String[] args) {
        // DO NOT MODIFY!!
        // Create SavingAccounts
        SavingAccount s1 = new SavingAccount(3000);
        SavingAccount s2 = new SavingAccount(1000);
        SavingAccount s3 = new SavingAccount(2000);

        // Create 1st Customer
        BankCustomer b1 = new BankCustomer("Tutor", 15);
        b1.AddAccount(s1);
        s1.withdraw(200);
        s1.deposit(500);
        b1.AddAccount(s2);
        System.out.println(b1.getName());
        System.out.println(b1.getTotalBalance());
        b1.AddAccount(s3);
        System.out.println(b1.getTotalBalance());
        s1.withdraw(200);
        s1.deposit(500);

        // Create 2nd Customer
        BankCustomer b2 = new BankCustomer("Boy", 15);
        System.out.println(b2.getName());
        System.out.println(b2.getTotalBalance());
        b2.AddAccount(s1);
        s2.deposit(5000);
        s2.withdraw(200);
        b2.AddAccount(s2);
        System.out.println(b2.getTotalBalance());
    }
}

class BankCustomer {
    ArrayList<SavingAccount> Acc = new ArrayList<SavingAccount>();
    Customer Cus = new Customer();

    public BankCustomer(String Name, int Age) {
        Cus.setName(Name);
        Cus.setAge(Age);
    }

    public void AddAccount(SavingAccount s) {
        Acc.add(s);
    }

    public double getTotalBalance() {
        double Balance = 0;
        for (SavingAccount iAccount : Acc) {
            Balance += iAccount.getBalance();
        }
        return Balance;
    }

    public String getName() {
        return Cus.getName();
    }
}

class Customer {
    private int Age;
    private String Name;

    public Customer() {

    }

    public Customer(String Name, int Age) {
        this.Age = Age;
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

}

class SavingAccount {
    private double Balance;

    public SavingAccount() {

    }

    public SavingAccount(double d) {
        Balance = d;
    }

    public void deposit(double a) {
        Balance += a;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public void withdraw(double a) {
        Balance -= a;
    }

}
