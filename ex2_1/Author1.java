package bai2.ex2_1;

public class Author1 {

    String name;
    String email;
    char gender;

    public Author1(String n, String e, char g ){
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;

    }

    public void setEmail(String e){
        this.email = email;
    }

    public char getGender(){
        return gender;
    }


    @Override
    public String toString() {
        return "Author1[" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ']';
    }
}
