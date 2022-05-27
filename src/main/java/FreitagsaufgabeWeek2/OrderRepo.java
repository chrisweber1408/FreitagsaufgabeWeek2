package FreitagsaufgabeWeek2;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderRepo {

    private Map<String, Order> orders;

    public OrderRepo(List<Order> orders){
        this.orders = new HashMap<>();
        for (Order order : orders){
            this.orders.put(order.getId(), order);
        }
    }

    public Collection<Order> list(){
        return orders.values();
    }

    public Order getOneOrder(String key){
        return orders.get(key);
    }

    public void addOneOrder(Order newOrder){
        orders.put(newOrder.getId(), newOrder);
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }
}
