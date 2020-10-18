public class NullObjectPattern {
    public static void main(String[] args){
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Ali");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("AHMET");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Tolga");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Fatma");
        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

    }
}
