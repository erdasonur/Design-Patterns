public class Banker extends Employee{

    @Override
    public void ProcessRequest(WithDraw request) {
        if(request.getAmount() <= 40000){
            System.out.println(request.getAmount() + " withdraw has been approved by Banker");
        }
        else if(NextApprover != null){
            System.out.println(request.getAmount() + " withdraw is out of my range. I will direct to my supervisor");
            NextApprover.ProcessRequest(request);
        }
    }
}