public class Customer {
    private String firstName;
    private String lastName;
    private int cashAsset;
    private Product product;

    public Customer(String firstName, String lastName, int cashAsset, Product product) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cashAsset = cashAsset;
        this.product = product;
    }

    public Customer() {
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

    public int getCashAsset() {
        return cashAsset;
    }

    public void setCashAsset(int cashAsset) {
        this.cashAsset = cashAsset;
    }

    public Product getProduct() {
        return product;
    }
}
