package SpringRestEmployeeManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringRestEmployeeManagementSystem.model.Employee;
import SpringRestEmployeeManagementSystem.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeerepository;

	public List<Employee> getAll() {
		return employeerepository.findAll();
	}

	public Employee addEmployee(Employee emp) {
		
		return employeerepository.insert(emp);
	}

	public Employee updateEmployee(Employee emp) {
		return employeerepository.save(emp);
	}

	public void deleteEmployee(String id) {
		employeerepository.deleteById(id);
	}

}
