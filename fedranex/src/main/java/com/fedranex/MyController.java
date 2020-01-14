package com.fedranex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
@RequestMapping("/books")
public class MyController {

    public MyController() {
        System.out.println("MyController skonstruowany");
    }

    @GetMapping
    public Book hello(
            @RequestParam(required = false, defaultValue = "Jan Kowalski") String name
            /*HttpServletResponse response*/
    ) throws IOException {
//        response.setStatus(204);
//        response.addCookie();
//        response.getWriter().println("hahaha");
//        throw new IllegalStateException("Aaaaa");
        return new Book().setId(123).setName(name);
    }

    @GetMapping("/ok/**")
    public String ok() {
        return "redirect:/api/cars";
    }

    @GetMapping("/ok/{bookId:\\d+}")
    public Long ok(@PathVariable(name = "bookId") Long id) {
        return id*2;
    }

    @GetMapping("/ok/{bookId:[a-z]+}")
    public String ok2(@PathVariable String bookId) {
        return bookId + bookId;
    }

//    @GetMapping(value = "/ok/{bookId:[a-z]+}", params = "magic=true")
//    public String ok3(@PathVariable String bookId, HttpServletResponse httpServletResponse) {
//        httpServletResponse.setStatus(321);
//        return bookId + bookId + bookId;
//    }

    /*
    W Postmanie request headers:

    Content-Type:application/json;charset=UTF-8
    Accept:application/json;charset=UTF-8
    */
    @PostMapping(consumes = "application/json")
    public String post(@RequestBody Book book) {
        return "Hello " + book.getName();
    }

    @PostMapping//(consumes = "text/plain")
    public String post(@RequestBody String book) {
        return "Hello " + book;
    }

}
