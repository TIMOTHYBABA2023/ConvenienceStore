package Models;

import Services.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Customer implements CustomerServiceImpl {
    private String firstName;
    private String lastName;
    private Double cashAsset;
    private List<Product> cart = new ArrayList<>();


    public Customer(String firstName, String lastName, Double cashAsset) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cashAsset = cashAsset;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCashAsset() {
        return cashAsset;
    }

    public void setCashAsset(Double cashAsset) {
        this.cashAsset = cashAsset;
    }

    public List<Product> getCart() {
        return cart;
    }

    public void setCart() {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cashAsset=" + cashAsset +
                ", cart=" + cart +
                '}';
    }

    @Override
    public List<Product> buyProduct(Store store, Product product, int productAmount) {
        List<Product> cart = getCart();
        List<Product> storeProduct = store.getProduct();
        int productAmountBought = productAmount;
        for (Product productAdded : storeProduct) {
            if (product.getProductName().equals(productAdded.getProductName())) {
                cart.add(productAdded);
            }
        }
        return cart;
    }

}
