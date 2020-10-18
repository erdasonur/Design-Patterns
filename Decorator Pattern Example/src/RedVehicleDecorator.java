public class RedVehicleDecorator extends VehicleDecorator{
    public RedVehicleDecorator(Vehicle vehicle){
        super(vehicle);
    }
    @Override
    public void showInfos(){
        showColor(vehicle);
    }
    public void showColor(Vehicle vehicle){
        System.out.println("--------------------------");
        vehicle.showInfos();
        System.out.println("Color : Red");
        System.out.println("--------------------------");
    }
}
