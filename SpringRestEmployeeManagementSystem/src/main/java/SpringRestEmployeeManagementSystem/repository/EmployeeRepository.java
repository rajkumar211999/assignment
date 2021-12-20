package SpringRestEmployeeManagementSystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import SpringRestEmployeeManagementSystem.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> 
{

}
