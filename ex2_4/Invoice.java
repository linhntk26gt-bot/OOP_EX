package bai2.ex2_4;

public class Invoice {
    int id;
    Customer customer;
    double amount;

    public Invoice(int i, Customer c, double a ){
        this.id = i;
        this.customer = c;
        this.amount = a;
    }

    public int getId(){
        return id;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer c){
        this.customer = c;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double a){
        this.amount = a;
    }

    public int getCustomerId(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount - (amount * customer.getDiscount()/100);
    }

    @Override
    public String toString() {
        return "Invoice[" +
                "id=" + id +
                ", customer=" + customer +
                ", amount=" + amount +
                ']';
    }
}
