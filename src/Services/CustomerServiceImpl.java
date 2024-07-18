package Services;

import Models.Customer;
import Models.Product;
import Models.Store;

import java.util.List;

public interface CustomerServiceImpl {

    public List<Product> buyProduct(Store store, Product product, int productAmount);
}
