package n2exercici1;

public class CardPayment implements PaymentType{

    @Override
    public String execute() {
        return "Pagament amb targeta acceptat";
    }
}
