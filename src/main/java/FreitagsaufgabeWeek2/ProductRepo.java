package FreitagsaufgabeWeek2;

import java.util.*;

public class ProductRepo {

    private final Map<String, Product> products;

    public ProductRepo(Map<String, Product> products) {
        this.products = products;
        }

    public Map<String, Product> list(){
        return this.products;
    }

    public Product getOneProduct(String key){
        return products.get(key);
    }
}
