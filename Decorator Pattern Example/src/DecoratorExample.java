public class DecoratorExample {
    public static void main(String[] args){
        Vehicle car = new Car(210,"Mondeo");
        car.showInfos();
        Vehicle redMc = new RedVehicleDecorator(new Motorcycle(350,"Yamaha"));
        redMc.showInfos();
    }
}
