package FreitagsaufgabeWeek2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;

public class ProductRepoTest {

    @Test
    void shouldListTheProducts(){


        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");

        Map<String, Product> products = new HashMap<>();

        products.put(wasser.getId(), wasser);
        products.put(cola.getId(), cola);

        ProductRepo productRepo = new ProductRepo(products);

        String actual = productRepo.list().values().toString();
        String expected = "[Product{id= " + wasser.getId() + " name= Wasser}, Product{id= " + cola.getId() + " name= Cola}]";

        Assertions.assertEquals(expected,actual);


    }

    @Test
    void shouldGetOneProduct() {
        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");

        Map<String, Product> products = new HashMap<>();

        products.put(wasser.getId(), wasser);
        products.put(cola.getId(), cola);

        ProductRepo productRepo = new ProductRepo(products);

        String actual = productRepo.getOneProduct(wasser.getId()).toString();
        String expected = "Product{id= " + wasser.getId() + " name= Wasser}";
    }

}
