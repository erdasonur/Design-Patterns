import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;
    public void setState(int state){
        this.state = state;
        notifyAllUsers();
    }
    public int getState(){
        return state;
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
    public void notifyAllUsers(){
        for(Observer observer : observers){
            observer.update();
        }
    }
}
