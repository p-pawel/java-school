package com.example.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWebService {

    private final String message = "Hello, ";

    public HelloWebService() {
    }

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}
