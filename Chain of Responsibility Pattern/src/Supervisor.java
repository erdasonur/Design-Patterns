public class Supervisor extends Employee{
    @Override
    public void ProcessRequest(WithDraw request) {
        if(request.getAmount() <= 70000){
            System.out.println(request.getAmount() + " withdraw has been approved by Supervisor");
        }
        else if(NextApprover != null){
            System.out.println(request.getAmount() + " withdraw is out of my range. I will direct to my manager");
            NextApprover.ProcessRequest(request);
        }
    }
}
