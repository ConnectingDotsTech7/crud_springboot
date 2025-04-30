package sample.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getEmployee()
    {
      return employeeService.getEmployees();
    }

    @PostMapping
    public void saveEmployee(@RequestBody Employee employee)
    {
        employeeService.saveEmployees(employee);
    }

    @PutMapping
    public void updateEmployee(@RequestBody Employee employee)
    {
        employeeService.updateEmployees(employee);
    }

    @DeleteMapping
    public void deleteEmployee(@RequestParam Long id)
    {
        employeeService.deleteEmployees(id);
    }
}
