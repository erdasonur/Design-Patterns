public class Manager extends Employee{
    @Override
    public void ProcessRequest(WithDraw request) {
        if(request.getAmount() <= 140000){
            System.out.println(request.getAmount() + " withdraw has been approved by Manager");
        }
        else if(NextApprover != null){
            System.out.println(request.getAmount() + " withdraw is out of my range. I will direct to my general manager");
            NextApprover.ProcessRequest(request);
        }
    }
}
