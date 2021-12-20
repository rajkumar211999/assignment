package SpringRestOrderAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringRestOrderAssignment.model.Order;
import SpringRestOrderAssignment.repository.OrderRepo;

@RestController
public class Controller {
	
	@Autowired
	OrderRepo repos;
	
	@PostMapping("/order")
	public void placeOrder( @RequestBody Order order ) {
		repos.insert( order );
	}
	
	@GetMapping("/all")
	public List<Order> showAllOrders() {
		return repos.findAll();		
	}
	
	@GetMapping("/order/{itemName}")
	public Order findOrder ( @PathVariable String itemName ){
		return repos.findOrdersByName( itemName );
	}
	
	@PutMapping("/update/{id}")
    public String updateOrder(@RequestBody Order order, @PathVariable String id) {
        order.setId( id );
        repos.save(order);
        return ("Updated Successfully");
    }
		
	@GetMapping("/delete/{id}")
	public String deleteOrder( @PathVariable String id )	{
		repos.deleteById( id );
		return ("Deleted Successfully");
	}
	
}