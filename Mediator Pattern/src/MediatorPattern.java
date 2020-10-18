public class MediatorPattern {
    public static void main(String[] args){
        User person1 = new User("Ahmet");
        User person2 = new User("Mehmet");
        person1.sendMessage("hi");
        person2.sendMessage("hi");

    }
}
