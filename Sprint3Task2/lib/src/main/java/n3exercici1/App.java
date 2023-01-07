package n3exercici1;

public class App {
    public static void main(String[] args) {
        Product p1 = new Product("1", 25, "EUR");
        Product p2 = new Product("2", 12.5, "GBP");
        Product p3 = new Product("3", 29.99, "DOL");
        Product p4 = new Product("4", 1240.12, "YEN");

        Showcase showcase = new Showcase();

        showcase.addProduct(p1);
        showcase.addProduct(p2);
        showcase.addProduct(p3);
        showcase.addProduct(p4);

        showcase.showProducts("EUR");
        showcase.showProducts("YEN");
        showcase.removeProduct(p3);
        showcase.showProducts("DOL");
        showcase.showProducts("GBP");
    }
}
