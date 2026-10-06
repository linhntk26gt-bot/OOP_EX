package bai1.ex1_5;

public class invoice {
    String id;
    String desc;
    int qty;
    double unitPrice;

    public invoice ( String i, String d, int q, double u) {
        this.id = i;
        this.desc =d;
        this.qty = q;
        this.unitPrice = u;
    }
    public String getId(){
        return id= id;
    }

    public String getDesc(){
        return desc= desc;
    }

    public int getQty(){
        return qty= qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return unitPrice*qty;
    }

    @Override
    public String toString() {
        return "invoice{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
