package n2exercici1;

//Aquesta classe no sap quin pagament s'esta realitzant, unicament instancia la interficie
public class PaymentGateway {
    private PaymentType paymentType;
    private Shoe[] shoes;
    private ShoesShop shop;

    public PaymentGateway(ShoesShop shop, PaymentType paymentType, Shoe... shoes){
        this.shop = shop;
        this.paymentType = paymentType;
        this.shoes = shoes;
    }

    public void execute(){
        System.out.println(paymentType.execute());
        System.out.println(shop.sell(this.shoes));

    }
}
