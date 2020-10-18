public class Motorcycle implements Vehicle{
    private int speed;
    private String model;

    public Motorcycle(int speed, String model){
        this.speed = speed;
        this.model = model;
    }
    @Override
    public void showInfos(){
        System.out.println("Model : " + model + " Speed : " + speed);
    }
}
