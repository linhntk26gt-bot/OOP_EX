package bai1.ex1_7;

public class Date {
    int day;
    int month;
    int year;

    public Date (int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public int getDay(){
        return this.day = day;
    }

    public int getMonth(){
        return this.month = month;
    }

    public int getYear(){
        return this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }

    @Override
    public String toString() {
        return
                day +
                "/" + month +
                "/" + year;
    }
}
