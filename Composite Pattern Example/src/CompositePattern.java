public class CompositePattern {
    public static void main(String[] args){
        Employee CEO = new Employee("Kemal", "Development",50000);
        Employee Manager = new Employee("Kamil", "Development",30000);
        Employee Captain = new Employee("Kadir","Development",20000);
        Employee SeniorDeveloper = new Employee("Kasım","Development",15000);
        Employee JuniorDeveloper = new Employee("Kıraç","Development",10000);

        CEO.addEmployee(Manager);
        Manager.addEmployee(Captain);
        Captain.addEmployee(SeniorDeveloper);
        Captain.addEmployee(JuniorDeveloper);

        System.out.println(CEO);

        for (Employee headEmployee : CEO.getEmployeeList()){
            System.out.println(headEmployee);
            for (Employee secondHeadEmployee : headEmployee.getEmployeeList()){
                System.out.println(secondHeadEmployee);
                for (Employee employee : secondHeadEmployee.getEmployeeList()){
                    System.out.println(employee);
                }
            }
        }

    }

}
