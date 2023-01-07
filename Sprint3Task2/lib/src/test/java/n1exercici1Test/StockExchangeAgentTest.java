package n1exercici1Test;

import n1exercici1.Company;
import n1exercici1.StockExchangeAgency;
import n1exercici1.StockExchangeAgent;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;
import static org.assertj.core.api.Assertions.assertThat;

public class StockExchangeAgentTest {
    StockExchangeAgent agent = new StockExchangeAgent();
    //Aqui podriem fer codi per afegir i trure companyies de borsa, canviar el preu de les accions i notificar a les agencies que estiguin subscrites.
    Company com1 = new Company("com1", 50, 20);
    Company com2 = new Company("com2", 100, 12.5);
    Company com3 = new Company("com3", 20, 35);
    StockExchangeAgency agency1 = new StockExchangeAgency();
    StockExchangeAgency agency2 = new StockExchangeAgency();
    StockExchangeAgency agency3 = new StockExchangeAgency();

    @BeforeTest
    public void initTest(){
        agent.getEvents().subscribe(agency1);
        agent.getEvents().subscribe(agency2);
        agent.getEvents().subscribe(agency3);
        agency1.addCompany(com1, 10);
        agency1.addCompany(com2, 20);
        agency2.addCompany(com1, 20);
        agency2.addCompany(com2, 10);
    }
    @Test
    public void testSubscribe(){
        assertThat(agent.getEvents().getAgencies()).contains(agency1);
    }

}
