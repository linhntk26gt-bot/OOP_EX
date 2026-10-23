package bai2.ex2_5;

public class Account {
    int id;
    Customer customer;
    double balance;

    public Account(int i, Customer c, double b) {
        this.id = i;
        this.customer = c;
        this.balance = b;
    }

    public Account(int i, Customer c) {
        this.id = i;
        this.customer = c;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer.toString()
                + "balance=$"
                + String.format("%.2f", balance);
    }

    public String getCustomerName() {
        return this.customer.getName();
    }
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }
    public Account withdraw(double amount){
        if(this.balance >= amount) {
            this.balance -= amount;
        }else {
            System.out.println("amount withdrawn exceeds the current balance");
        }
        return this;
    }
}

