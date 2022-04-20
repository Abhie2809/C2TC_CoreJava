package tnsif.c2tc.m07.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.m07.entity.Shop;
import tnsif.c2tc.m07.service.ShopService;

@RestController
public class ShopController {
	@Autowired
	ShopService service;
	@PostMapping("/addShop")
	public void addShop(@RequestBody Shop s)
	{
		service.addShop(s);
	}
	@GetMapping("/getShop/{id}")
	public Shop getShop(@PathVariable long id)
	{
		return service.getShop(id);
	}
	@PutMapping("/updateShop")
	public void updateShop(@RequestBody Shop s)
	{
		service.updateShop(s);
	}
	@DeleteMapping("/deleteShop/{id}")
	public long deleteShop(@PathVariable long id)
	{
		return service.deleteShop(id);
	}

}
