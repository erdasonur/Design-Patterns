public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Payer is in start state ");
        context.setState(this);
    }
    public String toString(){
        return "Start State";
    }
}
