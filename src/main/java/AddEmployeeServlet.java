import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddEmployeeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve employee information from request parameters
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String department = request.getParameter("department");
        String position = request.getParameter("position");

        // Create an Employee object
        Employee employee = new Employee(name, email, phoneNumber, department, position);

        // Create an instance of EmployeeManagementService
        EmployeeManagementService service = new EmployeeManagementService();

        // Add the new employee
        service.addEmployee(employee);

        // Redirect back to the employees list page
        response.sendRedirect("employees_list.jsp");
    }
}
