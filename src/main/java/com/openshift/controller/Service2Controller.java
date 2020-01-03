package com.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/service2")
public class Service2Controller {
	
	@GetMapping("/info")
	public String welcome() {
		return "++++++++++++++++++++++++++++  -: Welcome to Service 2 :- +++++++++++++++++++++++++++++++++ ";
	}

	@GetMapping(path="/products", produces = "application/json")
	public List<Products> products() {
		
		 List<Products> productList = new ArrayList<Products>();
		 Products products1= new Products("Britannia", 11);
		 Products products2= new Products("Anmol", 22);
		 Products products3= new Products("Marie", 33);
		 Products products4= new Products("GoodDay", 44);
		 productList.add(products1);
		 productList.add(products2);
		 productList.add(products3);
		 productList.add(products4);

		 return productList;
	}
}
