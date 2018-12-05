package delivery;

import com.sun.org.apache.xpath.internal.operations.Or;
import flower.Order;

public class MyDHLAPI extends DHLAPI{
    public String createOrder(Order order) {
        return eineBestellungErstellen(order);
    }

    public boolean send(String id) {
        return senden(id);
    }

    public boolean AvailiabilityCheck(String id){
        return verfugbarkeitPrufen(id);
    }

}
