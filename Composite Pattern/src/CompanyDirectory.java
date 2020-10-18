import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{
    private List<Employee> employeeList= new ArrayList<Employee>();

    @Override
    public void showIEmployeeDetails() {
        for (Employee employee : employeeList){
            employee.showIEmployeeDetails();
        }
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
}
