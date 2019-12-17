package com.example.rest;

import javax.annotation.PostConstruct;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Path("orders")
public class OrdersResource {

	List<String> list = new ArrayList<>();

	@PostConstruct
	public void init() {
		list.add("aaa");
		list.add("bbb");
	}

	@GET
	@Produces("application/json")
	public List<String> getAll() {

		return list;
	}

	// TODO - to nie działa w tej postaci
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public String getOne(@PathParam("id") Long id) {

		return id.toString();
	}

}
