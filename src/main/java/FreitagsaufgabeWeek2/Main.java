package FreitagsaufgabeWeek2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {



    public static void main(String[] args) {

        Order bier = new Order("Bier");
        Order fanta = new Order("Fanta");
        List<Order> orders = List.of(bier, fanta);
        OrderRepo orderRepo = new OrderRepo(orders);

        Order wasser = new Order("Wasser");
        orderRepo.addOneOrder(wasser);


        System.out.println(orderRepo);
    }


}
