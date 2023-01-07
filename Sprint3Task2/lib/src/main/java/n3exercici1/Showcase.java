package n3exercici1;

import java.util.ArrayList;

public class Showcase {

    private ArrayList<Product> products;

    public Showcase(){
        this.products = new ArrayList<>();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void removeProduct(Product product) {
        this.products.remove(product);
    }
    public void showProducts(String coin){
       this.products.forEach(product ->  System.out.println(product.toString(coin)));
    }
}
