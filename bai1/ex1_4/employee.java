package bai1.ex1_4;

public class employee {
    int id;
    int salary;
    String firstName;
    String lastName;

    public employee(int i, String firstName, String lastName, int salary){
        this.id = i;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("heheeeehehehehheheheheheheh");
    }

    public int getId(){
        return id = 8;
    }

    public String getFirstName(){
        return firstName= firstName;
    }

    public String getLastName(){
        return lastName= lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public int getSalary(){
        return salary= 2500;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        return salary*9;
    }

    @Override
    public String toString() {
        return "employee[" +
                "id=" + id +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ']';
    }


}
