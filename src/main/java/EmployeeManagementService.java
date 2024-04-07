import java.util.List;
import java.util.Iterator;

public class EmployeeManagementService {
    private List<Employee> employees;

    // Constructor
    public EmployeeManagementService(List<Employee> employees) {
        this.employees = employees;
    }

    // Method to update employee information
    public void updateEmployee(Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getEmail().equals(updatedEmployee.getEmail())) {
                // Update the employee information
                employee.setName(updatedEmployee.getName());
                employee.setPhoneNumber(updatedEmployee.getPhoneNumber());
                employee.setDepartment(updatedEmployee.getDepartment());
                employee.setPosition(updatedEmployee.getPosition());
                break;
            }
        }
    }

    // Method to delete an employee
    public void deleteEmployee(String email) {
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmail().equals(email)) {
                iterator.remove();
                break;
            }
        }
    }

}
