package FreitagsaufgabeWeek2;

import java.util.UUID;

public class Order {

    private String orderName;
    private String id;

    public Order(String products) {
        this.orderName = products;
        this.id = UUID.randomUUID().toString();
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
