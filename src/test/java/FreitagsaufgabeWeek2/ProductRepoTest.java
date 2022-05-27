package FreitagsaufgabeWeek2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class ProductRepoTest {

    @Test
    void shouldListTheProducts(){


        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");
        List<Product> products = List.of(wasser,cola);
        ProductRepo productRepo = new ProductRepo(products);

        Collection<Product> actual = productRepo.list();

        Assertions.assertEquals(2, actual.size());
        Assertions.assertTrue(actual.containsAll(products));
    }



    @Test
    void shouldGetOneProduct() {
        Product wasser = new Product("Wasser");
        Product cola = new Product("Cola");

        List<Product> products = List.of(wasser, cola);

        ProductRepo productRepo = new ProductRepo(products);

        String expected = productRepo.getOneProduct(wasser.getId()).toString();
        String actual = productRepo.getOneProduct(wasser.getId()).toString();
        Assertions.assertEquals(expected, actual);
    }
}
