package n1exercici1;

import java.util.HashMap;

public class StockExchangeAgency {
	 private HashMap<Company, Integer> companies;

	    public StockExchangeAgency() {
	        this.companies = new HashMap<Company, Integer>();
	    }

	    public HashMap<Company, Integer> getCompanies() {
	        return companies;
	    }
	    public void addCompany(Company company, int stockQuantity){
	        this.companies.put(company, stockQuantity);
	    }
	    public void removeCompany(Company company){
	        this.companies.remove(company);
	    }

	    //notifica els canvis si la agencia esta interessada (es a dir, si te accions a la companyia en la que hi ha hagut un canvi)
	    public void update(String event, Company company){
	        if(event.equals("Increase")) {
	            System.out.println("El valor de les accions de la companyia " + company.getCompanyName()
	                    + "ha pujat a " + company.getStockPrice() + ". Actualment les teves accions valen "
	                    + company.calculateStockPrice(this.companies.get(company).intValue()));
	        } else {
	            System.out.println("El valor de les accions de la companyia " + company.getCompanyName()
	                    + "ha baixat a " + company.getStockPrice() + ". Actualment les teves accions valen "
	                    + company.calculateStockPrice(this.companies.get(company).intValue()));
	        }
	    }
}
