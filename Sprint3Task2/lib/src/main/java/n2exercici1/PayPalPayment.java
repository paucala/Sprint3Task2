package n2exercici1;

public class PayPalPayment implements PaymentType{
    @Override
    public String execute() {
        return "Pagament amb PayPal acceptat";
    }
}
