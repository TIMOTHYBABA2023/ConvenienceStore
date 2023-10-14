package Models;

import Enums.Qualification;
import Enums.Residence;
import Exceptions.NotHired;
import Exceptions.OutOfJurisdictionException;
import Services.ManagerServiceImpl;

import java.util.List;

public class Store {

    private Manager manager;
    private List<Product> product;

    public Store() {
    }

    public Store(Manager manager, List<Product> product) {
        this.manager = manager;
        this.product = product;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public String availableProduct() {
        int i = 1;
        for (Product productByName: product){
            if (productByName.getProductQuantity()> 0) {
            System.out.println("Product " + i++ +":  "+ productByName.getProductName() +"; Price-> "
                    + productByName.getProductPrice() );
            }
        }

       return "These are the available Products";
    }




    @Override
    public String toString() {
        return "Store{" +
                "manager=" + manager +
                ", product=" + product +
                '}';
    }


}
