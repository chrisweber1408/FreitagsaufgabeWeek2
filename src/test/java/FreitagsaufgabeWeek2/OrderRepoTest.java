package FreitagsaufgabeWeek2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class OrderRepoTest {

    @Test
    void shouldListTheOrder(){


        Order wasser = new Order("Wasser");
        Order cola = new Order("Cola");

        Map<String, Order> orders = new HashMap<>();

        orders.put(wasser.getId(), wasser);
        orders.put(cola.getId(), cola);

        OrderRepo orderRepo = new OrderRepo(orders);

        String actual = orderRepo.list().values().toString();
        String expected = "[Order{id= " + wasser.getId() + " name= Wasser}, Order{id= " + cola.getId() + " name= Cola}]";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void shouldGetOneOrder() {
        Order wasser = new Order("Wasser");
        Order cola = new Order("Cola");

        Map<String, Order> orders = new HashMap<>();

        orders.put(wasser.getId(), wasser);
        orders.put(cola.getId(), cola);

        OrderRepo orderRepo = new OrderRepo(orders);

        String expected = orderRepo.getOneOrder(wasser.getId()).toString();
        String actual = orderRepo.getOneOrder(wasser.getId()).toString();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldAddAnOrder(){

        Order bier = new Order("Bier");
        Order fanta = new Order("Fanta");

        Map<String, Order> orders = new HashMap<>();

        orders.put(bier.getId(), bier);
        orders.put(fanta.getId(), fanta);

        OrderRepo orderRepo = new OrderRepo(orders);

        Order wasser = new Order("Wasser");
        orderRepo.addOneOrder(wasser);

        int actual = orderRepo.list().size();

        Assertions.assertEquals(3,actual);
    }
}
