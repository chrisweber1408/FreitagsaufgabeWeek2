package FreitagsaufgabeWeek2;

import java.util.*;

public class ProductRepo {

    private Map<String, Product> products;

    public ProductRepo(List<Product> products) {
        this.products = new HashMap<>();
        for (Product product : products){
            this.products.put(product.getId(), product);
        }
    }

    public Collection<Product> list(){
        return products.values();
    }

    public Product getOneProduct(String key){
        return products.get(key);
    }
}
