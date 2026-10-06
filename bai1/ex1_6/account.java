package bai1.ex1_6;

public class account {
    String id;
    String name;
    int balance;

    public account (String id, String name){
        this.id = id;
        this.name = name;
    }

    public account (String i, String n,int b){
        this.id = i;
        this.name = n;
        this.balance = b;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit(int amount){
        this.balance += amount;
        return  balance;
    }

    public int debit(int amount){
        if (amount <= balance){
            this.balance -= amount;
            return balance;

        }
        else{
            System.out.println("Amount exeeded balance");
            return balance;
        }
    }
    public int transferTo( account another, int amount){
        if (amount <= balance){
            this.balance -= amount;
            another.balance += amount;
            return balance;

        }
        else{
            System.out.println("Amount exeeded balance");
            return balance;
        }

    }

    @Override
    public String toString() {
        return "account[" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ']';
    }
}
