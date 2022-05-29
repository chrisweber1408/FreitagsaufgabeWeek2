package FreitagsaufgabeWeek2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class ShopServiceTest {

    @Test
    void shouldGetOneProduct(){

        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");
        Product fanta = new Product("Fanta");

        Order ordWasser = new Order("Wasser");
        Order ordCola = new Order("Cola");
        Order ordFanta = new Order("Fanta");


        HashMap<String, Product> products = new HashMap<>();
        products.put(wasser.getId(), wasser);
        products.put(cola.getId(), cola);
        products.put(fanta.getId(), fanta);

        HashMap<String, Order> orders = new HashMap<>();
        orders.put(ordWasser.getId(), ordWasser);
        orders.put(ordCola.getId(), ordCola);
        orders.put(ordFanta.getId(), ordFanta);

        OrderRepo orderRepo = new OrderRepo(orders);
        ProductRepo productRepo = new ProductRepo(products);

        ShopService shopService = new ShopService(productRepo, orderRepo);

        String actual = shopService.getOneProduct(wasser.getId()).toString();
        String expected = productRepo.getOneProduct(wasser.getId()).toString();

        assertEquals(expected, actual);

    }

    @Test
    void shouldListTheProducts(){

        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");
        Product fanta = new Product("Fanta");

        Order ordWasser = new Order("Wasser");
        Order ordCola = new Order("Cola");
        Order ordFanta = new Order("Fanta");


        HashMap<String, Product> products = new HashMap<>();
        products.put(wasser.getId(), wasser);
        products.put(cola.getId(), cola);
        products.put(fanta.getId(), fanta);

        HashMap<String, Order> orders = new HashMap<>();
        orders.put(ordWasser.getId(), ordWasser);
        orders.put(ordCola.getId(), ordCola);
        orders.put(ordFanta.getId(), ordFanta);

        OrderRepo orderRepo = new OrderRepo(orders);
        ProductRepo productRepo = new ProductRepo(products);

        ShopService shopService = new ShopService(productRepo, orderRepo);

        String actual = shopService.listProducts().toString();
        String expected = productRepo.list().toString();

        assertEquals(expected, actual);

    }

    @Test
    void shouldAddAnOrder(){

        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");
        Product fanta = new Product("Fanta");
        Product bier = new Product("Bier");

        Order ordWasser = new Order("Wasser");
        Order ordCola = new Order("Cola");
        Order ordFanta = new Order("Fanta");


        HashMap<String, Product> products = new HashMap<>();
        products.put(wasser.getId(), wasser);
        products.put(cola.getId(), cola);
        products.put(fanta.getId(), fanta);
        products.put(bier.getId(), bier);

        HashMap<String, Order> orders = new HashMap<>();
        orders.put(ordWasser.getId(), ordWasser);
        orders.put(ordCola.getId(), ordCola);
        orders.put(ordFanta.getId(), ordFanta);

        OrderRepo orderRepo = new OrderRepo(orders);
        ProductRepo productRepo = new ProductRepo(products);

        ShopService shopService = new ShopService(productRepo, orderRepo);

        Order ordBier = new Order("Bier");

        shopService.addOrder(ordBier);

        int actual = orderRepo.list().size();

        Assertions.assertEquals(4,actual);

    }

    @Test
    void shouldGetAnOrder(){

        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");
        Product fanta = new Product("Fanta");

        Order ordWasser = new Order("Wasser");
        Order ordCola = new Order("Cola");
        Order ordFanta = new Order("Fanta");


        HashMap<String, Product> products = new HashMap<>();
        products.put(wasser.getId(), wasser);
        products.put(cola.getId(), cola);
        products.put(fanta.getId(), fanta);

        HashMap<String, Order> orders = new HashMap<>();
        orders.put(ordWasser.getId(), ordWasser);
        orders.put(ordCola.getId(), ordCola);
        orders.put(ordFanta.getId(), ordFanta);

        OrderRepo orderRepo = new OrderRepo(orders);
        ProductRepo productRepo = new ProductRepo(products);

        ShopService shopService = new ShopService(productRepo, orderRepo);

        String actual = shopService.getOrder(ordWasser.getId()).toString();
        String expected = orderRepo.getOneOrder(ordWasser.getId()).toString();

        assertEquals(expected, actual);
    }

    @Test
    void shouldListOrders(){

        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");
        Product fanta = new Product("Fanta");

        Order ordWasser = new Order("Wasser");
        Order ordCola = new Order("Cola");
        Order ordFanta = new Order("Fanta");


        HashMap<String, Product> products = new HashMap<>();
        products.put(wasser.getId(), wasser);
        products.put(cola.getId(), cola);
        products.put(fanta.getId(), fanta);

        HashMap<String, Order> orders = new HashMap<>();
        orders.put(ordWasser.getId(), ordWasser);
        orders.put(ordCola.getId(), ordCola);
        orders.put(ordFanta.getId(), ordFanta);

        OrderRepo orderRepo = new OrderRepo(orders);
        ProductRepo productRepo = new ProductRepo(products);

        ShopService shopService = new ShopService(productRepo, orderRepo);

        String actual = shopService.listOrders().toString();
        String expected = orderRepo.list().toString();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExeption(){

        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");
        Product fanta = new Product("Fanta");

        Order ordWasser = new Order("Wasser");
        Order ordBier = new Order("Bier");
        Order ordFanta = new Order("Fanta");


        HashMap<String, Product> products = new HashMap<>();
        products.put(wasser.getId(), wasser);
        products.put(cola.getId(), cola);
        products.put(fanta.getId(), fanta);

        HashMap<String, Order> orders = new HashMap<>();
        orders.put(ordWasser.getId(), ordWasser);
        orders.put(ordBier.getId(), ordBier);
        orders.put(ordFanta.getId(), ordFanta);

        OrderRepo orderRepo = new OrderRepo(orders);
        ProductRepo productRepo = new ProductRepo(products);

        ShopService shopService = new ShopService(productRepo, orderRepo);

        try {
            shopService.addOrder(ordBier);
        } catch (RuntimeException e){
            System.out.println(e);
        }
    }
}
