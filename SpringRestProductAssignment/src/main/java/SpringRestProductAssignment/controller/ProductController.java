package SpringRestProductAssignment.controller;

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

import SpringRestProductAssignment.model.Product;
import SpringRestProductAssignment.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	ProductService productService;
	
    @GetMapping("/")
    public List<Product> getAll()
    {
    	return productService.getAll();
    }
    
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product prod)
    {
    	return productService.addProduct(prod);
    }
    
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product prod)
    {
    	return productService.updateProduct(prod);
    }
    
    @DeleteMapping("/{id}")
    public void deleteProduct(@RequestParam("id") String id)
    {
    	productService.deleteProduct(id);
    }
    

}
