package bai2.ex2_5;

public class testMain {public static void main(String[] args) {
    Customer c1 = new Customer(1, "Alice", 10);
    Customer c2 = new Customer(2, "Bob", 20);


    Account a1 = new Account(101, c1, 1000.0);
    Account a2 = new Account(102, c2);


    System.out.println(a1.getId());
    System.out.println(a1.getCustomer());
    System.out.println(a1.getBalance());
    System.out.println(a2.getId());
    System.out.println(a2.getCustomer());
    System.out.println(a2.getBalance());


    System.out.println(a1.getCustomerName());
    System.out.println(a2.getCustomerName());


    a1.setBalance(500.75);
    System.out.println(a1.getBalance());


    a1.deposit(50.25);
    System.out.println(a1.getBalance());


    a1.withdraw(100.25);
    System.out.println(a1.getBalance());

    a1.deposit(100.0);
    a1.withdraw(150.0);
    System.out.println(a1.getBalance());


    a2.deposit(200.0).withdraw(50.0);
    System.out.println(a2.getBalance());


    Account a3 = new Account(103, c1, 1234.567);
    System.out.println(a3);
}
}
