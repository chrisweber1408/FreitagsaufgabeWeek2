package FreitagsaufgabeWeek2;

import java.util.UUID;

public class Order {

    private String id = UUID.randomUUID().toString();
    private String orderName;

    public Order(String products) {
        this.orderName = products;
    }

    public String getId() {
        return id;
    }

    public String getOrderName() {
        return orderName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id= " + id  +
                " name= " + orderName +
                '}';
    }
}
