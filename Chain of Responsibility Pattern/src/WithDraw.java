public class WithDraw {
    private String customerId;
    private int amount;
    private String currencyType;
    private String soruceAccountId;

    public int getAmount(){
        return amount;
    }

    public WithDraw(String customerId, int amount, String currencyType, String soruceAccountId)
    {
        this.customerId = customerId;
        this.amount = amount;
        this.currencyType = currencyType;
        this.soruceAccountId = soruceAccountId;
    }

    public void Process(Employee employee, WithDraw withDraw){
        employee.ProcessRequest(withDraw);
    }
}
