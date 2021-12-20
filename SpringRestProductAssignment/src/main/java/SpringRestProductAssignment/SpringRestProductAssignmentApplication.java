package SpringRestProductAssignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringRestProductAssignment.model.Product;
import SpringRestProductAssignment.repository.ProductRepository;

@SpringBootApplication
public class SpringRestProductAssignmentApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringRestProductAssignmentApplication.class, args);
	}
    
	@Autowired
    ProductRepository productrepository;
	
	@Override
	public void run(String... args) throws Exception 
	{
		List<Product> listOfProducts = new ArrayList<Product>();
		
		Product p1 = new Product("HP", "HP is Widely Used Brand For Laptops",50000.00);
		Product p2 = new Product("Dell", "Dell is Widely Used Brand For Laptops",60000.00);
		Product p3 = new Product("Samsung", "Samsung Mobiles Are Famous",180000.00);
		Product p4 = new Product("Vivo", "Vivo Mobiles Are Known For Cameras",180000.00);
		Product p5 = new Product("Capgemini", "It is One Of The Big MNC Company",122233443.00);
		Product p6 = new Product("Santoor", "Best Soaps",29.00);
		Product p7 = new Product("Boat", "Best Earphones And Earpods",577777.00);
		
		listOfProducts.add(p1);
		listOfProducts.add(p2);
		listOfProducts.add(p3);
		listOfProducts.add(p4);
		listOfProducts.add(p5);
		listOfProducts.add(p6);
		listOfProducts.add(p7);
		
		productrepository.insert(listOfProducts);
		
	}
	
	

}
