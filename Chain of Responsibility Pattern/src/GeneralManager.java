public class GeneralManager extends Employee{

    @Override
    public void ProcessRequest(WithDraw request) {
        if(request.getAmount() <= 500000){
            System.out.println(request.getAmount() + " withdraw has been approved by General Manager");
        }
        else{
            System.out.println(request.getAmount() + " withdraw has been cancelled because it is out of limit");
        }
    }
}
