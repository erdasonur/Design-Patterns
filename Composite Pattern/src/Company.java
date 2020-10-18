public class Company {
    public static void main(String[] args){
        Developer developer1 = new Developer("Onur", 1,"Junior Developer");
        Developer developer2 = new Developer("Ahmet",2,"Senior Developer");

        CompanyDirectory engineerDirectory = new CompanyDirectory();

        engineerDirectory.addEmployee(developer1);
        engineerDirectory.addEmployee(developer2);

        Manager manager1 = new Manager("Melisa",3,"General Manager");
        Manager manager2 = new Manager("Kamil",4,"Manager");

        CompanyDirectory managerDirectory = new CompanyDirectory();

        managerDirectory.addEmployee(manager1);
        managerDirectory.addEmployee(manager2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engineerDirectory);
        directory.addEmployee(managerDirectory);
        directory.showIEmployeeDetails();

    }
}
