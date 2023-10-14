package Models;

import Enums.Residence;
import Services.CashierServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Cashier extends Staff implements CashierServiceImpl {

    private static Integer id = 0;

    public Cashier() {
    }

    public Cashier(String firstName, String lastName, String gender,
                   Residence residentialState) {
        super(firstName, lastName, gender, residentialState);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String sellProducts(Customer customer){

        List<Product> cart = customer.getCart();
        Double totalAmountSpent = 0.0;
        int productQuantity;
        List<String> productsBought = new ArrayList<>();
        Double customerCashAsset = 0.0;
        String customerFirstName = customer.getFirstName();
        String customerLastName = customer.getLastName();
        for (Product product: cart) {
            if (product.getProductQuantity() < 1) {
                return customerFirstName + " " + customerLastName + "," + product.getProductName() + " is out of Stock";
            } else {
                productQuantity = product.getProductQuantity();

                if (customer.getCashAsset() - product.getProductPrice() < 0.0) {
                    return customerFirstName + " " + customerLastName + ", you have insufficient fund to purchase " + product.getProductName();
                } else {
                    totalAmountSpent += product.getProductPrice();
                    Double cashAsset = customer.getCashAsset() - product.getProductPrice();
                    customer.setCashAsset(cashAsset);
                    customerCashAsset = cashAsset;
                    productQuantity -= 1;
                    product.setProductQuantity(productQuantity);
                    productsBought.add(product.getProductName());
                }
            }
        }
        return issueReceipt(productsBought,customerCashAsset,totalAmountSpent, customerFirstName, customerLastName );
    }


    private String issueReceipt(List<String> arrayOfProductsBought, Double newCashAsset, Double totalAmountSpent, String customerName, String customerLastName) {

        return customerName + " "+ customerLastName +", you have successfully purchased " + arrayOfProductsBought + " at " + totalAmountSpent + "\n"
                + " and your remaining balance is " + newCashAsset + "." + "\n" +
                "Receipt issued by " + this.getFirstName() + " " + this.getLastName() + "."
                ;
    }

    @Override
    public String toString() {
        return "Cashier{} " + super.toString();
    }
}
