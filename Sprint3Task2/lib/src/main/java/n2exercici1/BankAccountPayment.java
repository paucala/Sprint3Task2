package n2exercici1;

public class BankAccountPayment implements PaymentType{
    @Override
    public String execute() {
        return "Pagament amb compte bancari accpetat";
    }
}
