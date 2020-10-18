public class ChainOfResponsibilityPattern {
    public static void main(String[] args){
        WithDraw withdraw = new WithDraw("a6e193dc-cdbb-4f09-af1a-dea307a9ed15", 300000, "TRY", "TR681223154132432141412");
        Employee banker = new Banker();
        Employee supervisor = new Supervisor();
        Employee manager = new Manager();
        Employee generalManager = new GeneralManager();
        banker.SetNextApprover(supervisor);
        supervisor.SetNextApprover(manager);
        manager.SetNextApprover(generalManager);

        withdraw.Process(banker,withdraw);
    }
}
