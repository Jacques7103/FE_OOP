package case1;

public class Sales {
    private String itemId;
    private double value;
    private int quantity;
    private double totalSales;

    public Sales(String id, double value, int quantity){
        this.itemId = id;
        this.value = value;
        this.quantity = quantity;
    }

    public String getId(){
        return this.itemId;
    }

    public double getValue(){
        return this.value;
    }
    public int getQuantity(){
        return this.quantity;
    }

    public void calcTotalSales(){
        this.totalSales = this.value * this.quantity;
    }

    public double getTotalSales(){
        return this.totalSales;
    }
}