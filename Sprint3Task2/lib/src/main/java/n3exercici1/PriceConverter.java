package n3exercici1;

public class PriceConverter {

    public String convertPrice(Product product, String coin) {
        if (coin.equals("EUR")){
            return "El preu en " + product.getCoin() + " és: " + product.getPrice()
                    + ", el preu en " + coin + " és: " + convertoEuro(product);
        } else {
            return "El preu en " + product.getCoin() + " és: " + product.getPrice()
                    + ", el preu en " + coin + " és: " + converEuroTo(coin, convertoEuro(product));
        }

    }
    public double converEuroTo(String coin, double price){
        if (coin.equals("DOL")) {
            return price * 1.065;
        } else if (coin.equals("YEN")) {
            return price * 140.545;
        } else if (coin.equals("GBP")) {
            return price * 0.885;
        } else {
            return price;
        }

    }
    public double convertoEuro(Product product){
        if (product.getCoin().equals("DOL")) {
            return product.getPrice() *  0.938;
        } else if (product.getCoin().equals("YEN")) {
            return product.getPrice() * 0.00711;
        } else if (product.getCoin().equals("GBP")) {
            return product.getPrice() * 1.129;
        } else {
            return product.getPrice();
        }

    }

}
