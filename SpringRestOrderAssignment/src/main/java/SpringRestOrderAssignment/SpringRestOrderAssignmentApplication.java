package SpringRestOrderAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringRestOrderAssignment.repository.OrderRepo;

@SpringBootApplication
public class SpringRestOrderAssignmentApplication {

	/*
	 * @Autowired private OrderRepo orderrepo;
	 * 
	 * @Override public void run(String... args) throws Exception {
	 * System.out.println(orderrepo.findAll());
	 * 
	 * }
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringRestOrderAssignmentApplication.class, args);
	}

}
