package case1;

public class SalesPerson{
    private String id;  
    private Sales[] salesHistory = new Sales[100];
    private int count = 0;
    private double total = 0;
    private Sales largest;
    private double prev = 0;
    private String largestID;
    private double previous = 0;
    private int counter = 0;
    private boolean check = true;

    public SalesPerson(String id){
        this.id = id;
    }

    public SalesPerson(String id, Sales[] sales, int count){
        this.id = id;
        this.salesHistory = sales;
        this.count = count;
    }

    public int getCount(){
        return this.count;
    }
    
    public String getId(){
        return this.id;
    }

    public void setSalesHistory(Sales sales){
        this.salesHistory[this.count] = sales;
        this.count += 1;
    }

    public Sales getSalesHistory(int index){
        return this.salesHistory[index];
    }

    public double calcTotalSales(){
        for (int i = 0; i < this.count; i++){
            this.salesHistory[i].calcTotalSales();
            this.total += this.salesHistory[i].getTotalSales();
        }
        return this.total;
    }

    public Sales largestSale(){
        for (int i = 0; i < this.count; i++){
            this.salesHistory[i].calcTotalSales();
            if (this.salesHistory[i].getTotalSales() > this.prev){
                this.prev = this.salesHistory[i].getTotalSales();
                this.largest = this.salesHistory[i];
            }
        }
        return this.largest;
    }

    public int makeCounter(SalesPerson[] salesPeople){
        for (int i = 0; i < salesPeople.length; i++){
            if (salesPeople[i] != null){
                this.counter++;
            }
        }
        return this.counter;
    }

    public String highest(SalesPerson[] salesPeople){
        int num = makeCounter(salesPeople);
        for (int i = 0; i < num; i++){
            if (salesPeople[i].calcTotalSales() > this.previous){
                this.largestID = salesPeople[i].getId();
            }
        }
        return this.largestID;
    }

    public void addSales(SalesPerson[] salesPeople, Sales sales, String id){
        int num = makeCounter(salesPeople);
        for (int i = 0; i < num; i++){
            if (salesPeople[i] == null){
                "".isEmpty();
            } else {
                if (salesPeople[i].getId() == id){
                    salesPeople[i].setSalesHistory(sales);
                    System.out.println("The sales has been inputed !!");
                }
            }
        }
    }
}