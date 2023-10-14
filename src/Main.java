import Enums.*;
import Models.*;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        CashierApplicant applicant1 = new CashierApplicant("Bob", "Faithful", "male", "bob@gmail.com", Qualification.DEGREE, Residence.ABUJA);
        CashierApplicant applicant2 = new CashierApplicant("Timothy", "Baba", "Male", "tim@gmail.com", Qualification.DEGREE, Residence.LAGOS);
        CashierApplicant applicant3 = new CashierApplicant("Joe", "Lade", "Male", "joe@gmail.com", Qualification.MASTERS, Residence.OTHER_STATES);
        CashierApplicant applicant4 = new CashierApplicant("Joy", "James", "Female", "joy@gmail.com", Qualification.MASTERS, Residence.LAGOS);
        CashierApplicant applicant5 = new CashierApplicant("Layla", "Bob", "Female", "layla@gmail.com", Qualification.DEGREE, Residence.OTHER_STATES);


        Manager hiringManager = new Manager("Timmy", "Tammy");
        Cashier cashier1 = hiringManager.hireCashier(applicant1);
        Cashier cashier2 = hiringManager.hireCashier(applicant2);
        Cashier cashier3 = hiringManager.hireCashier(applicant3);
        Cashier cashier4 = hiringManager.hireCashier(applicant4);
        Cashier cashier5 = hiringManager.hireCashier(applicant5);


        Manager groceryManager = new Manager("Tob", "Bellamy");
        Manager jewelryManager = new Manager("Emily", "Page");
        Manager clothingManager = new Manager("Tessa", "Reigns");

        //Models.Product Object...
        //Grocery Store...
        Product milk = new Product("Milk", 500, 7);
        Product bread = new Product("Bread", 1000, 5);
        Product cookies = new Product("Cookies", 400, 10);
        Product cake = new Product("Cake", 2400, 3);
        Product eggs = new Product("Eggs", 200, 24);

        //Jewelry Store...
        Product necklace = new Product("Necklace", 600, 10);
        Product bracelet = new Product("Bracelet", 50, 17);
        Product earrings = new Product("Earrings", 300, 5);
        Product rings = new Product("Rings", 1500, 10);
        Product beads = new Product("Beads", 150, 2);
        Product chains = new Product("Chains", 750, 3);

        //Clothing Store...
        Product ankara = new Product("Ankara", 2500, 5);
        Product skirt = new Product("Skirt", 670, 8);
        Product sleeveless = new Product("Sleeveless", 830, 10);
        Product handbag = new Product("Handbag", 400, 4);

        //Grocery Products Lists...
        List<Product> groceryProductList = new ArrayList<>();
        groceryProductList.add(milk);
        groceryProductList.add(bread);
        groceryProductList.add(cookies);
        groceryProductList.add(cake);
        groceryProductList.add(eggs);

        //Jewelry Products Lists...
        List<Product> jewelryProductList = new ArrayList<>();
        jewelryProductList.add(necklace);
        jewelryProductList.add(bracelet);
        jewelryProductList.add(earrings);
        jewelryProductList.add(rings);
        jewelryProductList.add(beads);
        jewelryProductList.add(chains);

        //Clothing Products Lists...
        List<Product> clothingProductList = new ArrayList<>();
        clothingProductList.add(ankara);
        clothingProductList.add(skirt);
        clothingProductList.add(sleeveless);
        clothingProductList.add(handbag);


        Store groceryStore = new Store(groceryManager, groceryProductList);

        System.out.println(groceryStore.availableProduct());


        Store jewelryStore = new Store(jewelryManager, jewelryProductList);

        System.out.println(jewelryStore.availableProduct());


        Store clothingStore = new Store(clothingManager, clothingProductList);

        System.out.println(clothingStore.availableProduct());


       List<Product> cart1 = new ArrayList<>();


        Customer customer1 = new Customer("Linda", "Tob", 8000.00);
        customer1.buyProduct(clothingStore,ankara);
        customer1.buyProduct(clothingStore,ankara);
        customer1.buyProduct(jewelryStore, beads);
        customer1.buyProduct(jewelryStore, beads);

        String solo = cashier1.sellProducts(customer1);

        System.out.println(solo);

        Customer customer2 = new Customer("Tessa", "Tobi", 7000.00);
        customer2.buyProduct(clothingStore,ankara);
        customer2.buyProduct(clothingStore,ankara);

        String solar = cashier2.sellProducts(customer2);

        System.out.println(solar);



        //I/O Manipulation...



    }

}