package FreitagsaufgabeWeek2;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    //ArrayList
    private final Map<String, Order> orders;

    public OrderRepo(Map<String, Order> orders){
        this.orders = orders;
    }

    public Map<String, Order> list(){
        return orders;
    }

    public Order getOneOrder(String key){
        return orders.get(key);
    }

    public void addOneOrder(Order newOrder){
        orders.put(newOrder.getId(), newOrder);
    }
}
