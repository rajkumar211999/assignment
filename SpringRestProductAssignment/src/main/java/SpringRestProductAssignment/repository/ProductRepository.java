package SpringRestProductAssignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import SpringRestProductAssignment.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>  
{
	

}
