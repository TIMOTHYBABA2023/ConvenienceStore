package Models;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;
    private List<Product> productList;

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public Product() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void availableProducts(){

        productList.forEach(nameOfProducts -> {
            if (nameOfProducts.getProductQuantity() > 0) {
                System.out.println(nameOfProducts.getProductName());
            } else System.out.println(nameOfProducts.getProductName() + " is out of Stock");
        });
    }

    @Override
    public String toString() {
        return "Models.Product{" +
                "productName='" + productName + '\'' +
                ", productPrice='" + productPrice + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                '}';
    }
}
