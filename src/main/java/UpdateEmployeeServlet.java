import java.util.List;

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
                break; // Exit the loop once the employee is found and updated
            }
        }
    }

}
