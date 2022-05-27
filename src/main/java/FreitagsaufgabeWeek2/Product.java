package FreitagsaufgabeWeek2;

import java.util.UUID;

public class Product {

    private String productName;
    private String id = UUID.randomUUID().toString();

    public Product(String name) {
        this.productName = name;
    }

    public String getProductName() {
        return productName;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id= " + id  +
                " name= " + productName +
                '}';
    }
}
