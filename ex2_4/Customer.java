package bai2.ex2_4;

public class Customer {
    int id;
    String name;
    int discount;

    public Customer(int i, String n, int d){
        this.id = i;
        this.name = n;
        this.discount = d;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getDiscount(){
        return discount;
    }

    public void setDiscount(int d){
        this.discount = d;
    }

    @Override
    public String toString() {
        return "Customer[" +
                "id="
                + id
                + ", name='"
                + name
                + '\''
                + ", discount="
                + discount
                + ']';
    }
}
