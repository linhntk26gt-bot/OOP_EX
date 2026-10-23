package bai2.ex2_2;

public class Book {
    private String name;
    private Author[] author;
    private double price;
    private int qlt=0;

    public Book(String n,Author[] a, double p, int q){
        this.name = n;
        this.author = a;
        this.price = p;
        this.qlt = q;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQlt() {
        return qlt;
    }

    public void setQlt(int qlt) {
        this.qlt = qlt;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", qlt=" + qlt +
                '}';
    }


}
