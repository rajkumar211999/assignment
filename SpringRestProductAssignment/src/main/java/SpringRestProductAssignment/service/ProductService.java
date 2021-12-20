package SpringRestProductAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringRestProductAssignment.model.Product;
import SpringRestProductAssignment.repository.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	ProductRepository productrepository;

	public List<Product> getAll() {
		return productrepository.findAll();
	}

	public Product addProduct(Product prod) {
		return productrepository.insert(prod);
	}

	public Product updateProduct(Product prod) {
		return productrepository.save(prod);
	}

	public void deleteProduct(String id) {
		productrepository.deleteById(id);	
	}
    

}
