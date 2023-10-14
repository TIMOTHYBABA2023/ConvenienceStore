package Services;

import Models.Customer;

public interface CashierServiceImpl {
    public String sellProducts(Customer customer);

    private String issueReceipt(Customer customer) {
        return null;
    }
}
