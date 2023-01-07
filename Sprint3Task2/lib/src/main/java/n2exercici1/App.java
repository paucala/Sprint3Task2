package n2exercici1;

public class App {
    public static void main(String[] args) {
       ShoesShop shop = new ShoesShop("La sabateta");

       CardPayment cp = new CardPayment();
       PayPalPayment pp = new PayPalPayment();
       BankAccountPayment bp = new BankAccountPayment();

       Shoe shoe1 = new Shoe("1", "1", 40, 25.5);
       Shoe shoe2 = new Shoe("1", "2", 40, 34);
       Shoe shoe3 = new Shoe("1", "3", 40, 29.99);

       shop.checkSell(cp, shoe1, shoe2);
       shop.checkSell(pp, shoe2, shoe3);
       shop.checkSell(bp, shoe1, shoe2, shoe3);


    }
}
