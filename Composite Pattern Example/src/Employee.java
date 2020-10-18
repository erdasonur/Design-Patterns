import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String departmant;
    private int salary;
    private List<Employee> employeeList = new ArrayList<Employee>();

    public Employee(String name, String departmant, int salary){
        this.name = name;
        this.departmant = departmant;
        this.salary = salary;
        this.employeeList = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
    public List<Employee> getEmployeeList(){
        return employeeList;
    }
    public String toString(){
        return  ("Employee name : " + name
                 + " departmant : " + departmant
                 + " salary : " + salary
                 + " "
                );
    }
}
