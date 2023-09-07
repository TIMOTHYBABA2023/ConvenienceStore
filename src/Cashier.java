public class Cashier extends Staff{

    private Product product;

    public Cashier(String firstName, String lastName,
                   String gender, String residentialState) {
        super(firstName, lastName, gender, residentialState);
    }

    public Cashier() {
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Cashier{}";
    }
}
