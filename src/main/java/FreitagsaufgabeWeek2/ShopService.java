package FreitagsaufgabeWeek2;

import java.util.Map;

public class ShopService {

    private final ProductRepo productRepo;
    private final OrderRepo orderRepo;

    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Product getOneProduct(String id){
        return productRepo.getOneProduct(id);
    }
    public Map<String, Product> listProducts(){
        return productRepo.list();
    }
    public void addOrder(Order newOrder){
        if (!productRepo.list().toString().contains(newOrder.getOrderName())){
            throw new RuntimeException ("Dieses Produkt ist nicht vorhanden.");
        }
        orderRepo.addOneOrder(newOrder);

    }
    public Order getOrder(String key){
        return orderRepo.getOneOrder(key);
    }
    public Map<String, Order> listOrders(){
        return orderRepo.list();
    }
}
