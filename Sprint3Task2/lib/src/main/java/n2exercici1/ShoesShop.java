package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoesShop {

    private String name;
    private ArrayList<Shoe> shoes;

    public ShoesShop(String name) {
        this.name = name;
        this.shoes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Shoe> getShoes() {
        return shoes;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double calculateTotalPrice(Shoe... shoes){
        double finalPrice = 0;
        for (Shoe s: shoes) { finalPrice += s.getPrice();
        }
        return finalPrice;
    }

    public void checkSell(PaymentType paymentType, Shoe... shoes){
        PaymentGateway gateway = new PaymentGateway(this, paymentType, shoes);
       gateway.execute();
    }
    public String sell(Shoe... shoes) {
        return "S'han venut les sabates " + Arrays.toString(shoes) + " per un total de " + this.calculateTotalPrice(shoes);
    }
}
