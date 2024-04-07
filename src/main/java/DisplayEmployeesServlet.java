import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayEmployeesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create an instance of EmployeeManagementService
        EmployeeManagementService service = new EmployeeManagementService();

        // Retrieve all employees
        List<Employee> employees = service.getAllEmployees();

        // Set the employees as a request attribute
        request.setAttribute("employees", employees);

        // Forward the request to the employees list JSP page for display
        request.getRequestDispatcher("/employees_list.jsp").forward(request, response);
    }
}
