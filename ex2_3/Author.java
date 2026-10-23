package bai2.ex2_3;

public class Author {
    String name;
    String email;

    public Author(String n, String e){
        this.name = n;
        this.email = e;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ']';
    }
}

