package n1exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EventManager {
	List<StockExchangeAgency> agencies;

    public EventManager() {
        this.agencies  = new ArrayList<>();
    }

    public List<StockExchangeAgency> getAgencies() {
        return agencies;
    }

    public void subscribe(StockExchangeAgency agency) {
        this.agencies.add(agency);
    }

    public void unsubscribe(StockExchangeAgency agency) {
        this.agencies.remove(agency);
    }

    public void notify(String event, Company company) {
        for (StockExchangeAgency agency: agencies){
            if (agency.getCompanies().containsKey(company)){
                agency.update(event, company);
            }
        }
    }

}
