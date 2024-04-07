import java.util.List;
import java.util.Iterator;

public class EmployeeManagementService {
    private List<Employee> employees;

    // Constructor
    public EmployeeManagementService() {
        this.employees = employees;
    }

    // Method to delete an employee
    public void deleteEmployee(String email) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmail().equals(email)) {
                iterator.remove(); // Remove the employee from the list
                break; // Exit the loop once the employee is deleted
            }
        }
    }
}
