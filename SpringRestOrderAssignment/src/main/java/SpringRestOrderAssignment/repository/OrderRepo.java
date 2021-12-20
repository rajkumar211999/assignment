package SpringRestOrderAssignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import SpringRestOrderAssignment.model.Order;

public interface OrderRepo extends MongoRepository< Order, String > {
	
	@Query("{ 'itemName' : ?0 }")
	Order findOrdersByName(String itemName);

}
