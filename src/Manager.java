public class Manager extends Staff{

    private Cashier cashier;
    public Product product;

// All args constructor


    public Manager(String firstName, String lastName, String gender, String residentialState, Cashier cashier, Product product) {
        super(firstName, lastName, gender, residentialState);
        this.cashier = cashier;
        this.product = product;
    }

    public Manager(String firstName, String lastName, String gender, String residentialState, Cashier cashier) {
        super(firstName, lastName, gender, residentialState);
        this.cashier = cashier;
    }


    //Cashier constructor
    public Manager(Cashier cashier) {
        this.cashier = cashier;
    }
    //Manager constuctor
    public Manager(Product product) {
        this.product = product;
    }

    //No-args constructor
    public Manager() {
    }

    //Method to hire Cashier.
    public void hireCashier(){
        System.out.println("Congratulations " + cashier.getFirstName() +
                ". You have been hired to work in my firm.");
    }


    @Override
    public String toString() {
        return "Manager{" +
                "cashier=" + cashier +
                ", product=" + product +
                '}';
    }
}
