package bai2.ex2_1;

public class Book {
    String name;
    Author1 author;
    double price;
    int qty;

    public Book (String n, Author1 a, double p){
        this.name = n;
        this.author = a;
        this.price = p;
    }

    public Book (String n, Author1 a, double p, int q){
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = q;
    }

    public String getName(){
        return name;
    }

    public Author1 getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
