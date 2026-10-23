package bai2.ex2_5;

public class Customer {
    int id;
    String name;
    char gender;
    int discount;

    public Customer(int i, String n, int d){
        this.id = i;
        this.name = n;
        this.discount = d;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public char getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return
                this.name + "(" + id + ")";
    }
}

