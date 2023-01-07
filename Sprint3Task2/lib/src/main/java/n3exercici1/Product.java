package n3exercici1;

public class Product {

    private String name;
    private double price;
    private String coin;
    private PriceConverter priceConverter;

    public Product(String name, double price, String coin) {
        this.name = name;
        this.price = price;
        this.coin = coin;
        this.priceConverter = new PriceConverter();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String toString(String coin) {
        return "Prodcute: " + this.name + " " + priceConverter.convertPrice(this, coin);
    }
}
