package SpringRestEmployeeManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import SpringRestEmployeeManagementSystem.model.Employee;
import SpringRestEmployeeManagementSystem.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
    @GetMapping("/")
    public List<Employee> getAll()
    {
    	return employeeService.getAll();
    }
    
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee emp)
    {
    	return employeeService.addEmployee(emp);
    }
    
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee emp)
    {
    	return employeeService.updateEmployee(emp);
    }
    
    @DeleteMapping("/{id}")
    public void deleteEmployee(@RequestParam("id") String id)
    {
    	employeeService.deleteEmployee(id);
    }
    
    
    
}
