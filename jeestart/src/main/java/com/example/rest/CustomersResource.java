package com.example.rest;

import com.example.dto.Customer;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("customers")
public class CustomersResource {

	private List<Customer> list = new ArrayList<>();
	public CustomersResource() {
		list.add(new Customer(1, "aaa"));
		list.add(new Customer(2, "bbb"));
	}

	@GET
	@Produces("application/json")
	public List<Customer> getAll() {
		return list;
	}

}
