package FreitagsaufgabeWeek2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class OrderRepoTest {

    @Test
    void shouldListTheOrder(){


        Order wasser = new Order("Wasser");
        Order cola = new Order("Cola");
        List<Order> orders = List.of(wasser,cola);
        OrderRepo orderRepo = new OrderRepo(orders);

        Collection<Order> actual = orderRepo.list();

        Assertions.assertEquals(2, actual.size());
        Assertions.assertTrue(actual.containsAll(orders));
    }

    @Test
    void shouldAddAnOrder(){

        Order bier = new Order("Bier");
        Order fanta = new Order("Fanta");
        List<Order> orders = List.of(bier, fanta);
        OrderRepo orderRepo = new OrderRepo(orders);

        Order wasser = new Order("Wasser");
        orderRepo.addOneOrder(wasser);


    }
}
