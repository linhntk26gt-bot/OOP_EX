package bai2.ex2_3;

public class Book {
    String isbn;
    String name;
    Author author;
    double price;
    int qty;

    public Book(String i, String n, Author a, double p) {
        this.isbn = i;
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = 0;
    }

    public Book(String i, String n, Author a, double p, int q) {
        this.isbn = i;
        this.name = n;
        this.author = a;
        this.price = p;
        this.qty = q;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName (){
        return name;
    }

    @Override
    public String toString(){
        return "Book ["
                + "isbn ="
                + isbn
                +" ,name ="
                + name
                +" ,author ="
                + author
                +" ,price ="
                +price
                +" ,qty ="
                + qty;

    }
}



