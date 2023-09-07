public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        Cashier cashier = new Cashier("Timothy","Baba", "male", "Gombe");
        Manager manager = new Manager("Joe", "", "", "", cashier);
        System.out.println(manager);
        manager.hireCashier();


    }
}