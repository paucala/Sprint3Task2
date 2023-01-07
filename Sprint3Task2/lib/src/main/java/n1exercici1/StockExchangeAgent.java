package n1exercici1;

public class StockExchangeAgent {
	 
	private EventManager events;

	public StockExchangeAgent() {
	        this.events = new EventManager();
	    }

	public EventManager getEvents() {
	        return events;
	    }

	public void stockIncrease(Company company, double price){
	        company.increaseStockPrice(price);
	        events.notify("Increase", company);
	    }
	public void stockDecrease(Company company, double price){
	        company.decreaseStockPrice(price);
	        events.notify("Decrease", company);
	    }
}
