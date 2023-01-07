package n1exercici1;

public class App {

	public static void main(String[] args) {
		//aqui escriuriem el codi per fer funcionar la app, per que l'agent de borsa introdugues canvis
		// i es notifiques els clients
		//Tota la app testada a la carpeta de test
		StockExchangeAgent agent = new StockExchangeAgent();
		//Aqui podriem fer codi per afegir i trure companyies de borsa, canviar el preu de les accions i notificar a les agencies que estiguin subscrites.
		Company com1 = new Company("com1", 50, 20);
		Company com2 = new Company("com2", 100, 12.5);
		Company com3 = new Company("com3", 20, 35);
		StockExchangeAgency agency1 = new StockExchangeAgency();
		StockExchangeAgency agency2 = new StockExchangeAgency();
		StockExchangeAgency agency3 = new StockExchangeAgency();
		agent.getEvents().subscribe(agency1);
		agent.getEvents().subscribe(agency2);
		agent.getEvents().subscribe(agency3);
		agency1.addCompany(com1, 10);
		agency1.addCompany(com2, 20);
		agency1.addCompany(com3, 50);
		agency2.addCompany(com1, 20);
		agency2.addCompany(com2, 10);

		//subscripcio
		System.out.println(agent.getEvents().getAgencies().contains(agency1));
		//baixa
		agent.getEvents().unsubscribe(agency3);
		System.out.println(!agent.getEvents().getAgencies().contains(agency3));
		//afegir companyia
		System.out.println(agent.getEvents().getAgencies().get(0).getCompanies().containsKey(com1));
		//treure companyia
		agent.getEvents().getAgencies().get(0).removeCompany(com3);
		//stockincrease
		agent.stockIncrease(com1, 10);
		System.out.println(com1.getStockPrice() == 30);
		//stockDecrease
		agent.stockDecrease(com2, 2);
		System.out.println(com2.getStockPrice() == 10.5);
	}

}
