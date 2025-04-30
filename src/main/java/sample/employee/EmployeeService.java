package sample.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

   @Autowired
   EmployeeRepository employeeRepository;

    public List<Employee> getEmployees()
    {

        return employeeRepository.findAll();

    }

    public void saveEmployees(Employee employee)
    {
        employeeRepository.save(employee);


    }

    public void updateEmployees(Employee employee)
    {
        employeeRepository.save(employee);


    }

    public void deleteEmployees(Long id)
    {
        employeeRepository.deleteById(id);

    }


}
