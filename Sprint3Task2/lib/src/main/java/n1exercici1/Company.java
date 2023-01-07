package n1exercici1;

public class Company {

    private String companyName;
    private int stockQuantity;
    private double stockPrice;

    public Company(String companyName, int initialStockQuantity, double initialStockPrice) {
        this.companyName = companyName;
        this.stockQuantity = initialStockQuantity;
        this.stockPrice = initialStockPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void increaseStockPrice(double price){
        this.stockPrice += price;
    }
    public void decreaseStockPrice(double price){
        this.stockPrice -= price;
    }
    public void increaseStockQuantity(int quantity) {
        this.stockQuantity += quantity;
    }
    public void decreaseStockQuantity(int quantity) {
        this.stockQuantity -= quantity;
    }
    public double calculateStockPrice(int quantity) {
        return this.stockPrice * quantity;
    }

}
