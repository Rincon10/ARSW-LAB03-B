package edu.eci.arsw.myrestaurant.test;

import edu.eci.arsw.myrestaurant.beans.BillCalculator;
import edu.eci.arsw.myrestaurant.model.Order;
import edu.eci.arsw.myrestaurant.services.OrderServicesException;
import edu.eci.arsw.myrestaurant.services.RestaurantOrderServicesStub;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class RestapidemoApplicationTests {

    
    RestaurantOrderServicesStub ros;

    
    @Test
    public void contextLoads() throws OrderServicesException{
        
        
        try {
            Order o=new Order(99);
            o.addDish("PIZZA",3);
            o.addDish("COKE",3);
            ros.addNewOrderToTable(o);
            System.out.println("$$"+ros.calculateTableBill(99));
        } catch (OrderServicesException ex) {
            Logger.getLogger(RestapidemoApplicationTests.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

}
