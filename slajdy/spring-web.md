% Web in Spring


# Intro

## Recap: deployable Java web-application

`WAR`
 
## Recap: deployment descriptor

`src/main/webapp/WEB-INF/web.xml`

```
<?xml version="1.0" encoding="UTF-8"?>
<web-app>
    <display-name>Archetype Created Web Application</display-name>
</web-app>
```

## Recap: servlet

```
<servlet>
    <servlet-name>MyServlet</servlet-name>
    <servlet-class>com.example.MyServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>MyServlet</servlet-name>
    <url-pattern>/my-servlet</url-pattern>
</servlet-mapping>
```
or
```
@WebServlet(urlPatterns = "/my-servlet")
public class MyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        ...
	}
}
```

## Intro - tasks

* <a href="spring-web-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>

* <a href="spring-web-tasks.html#/zadanie-2" target="_blank">[Task 2]</a>

# Java web-application + Spring

## Enabling Spring

```
  <listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
  </listener>
```

```
/WEB-INF/applicationContext.xml
```

## DispatcherServlet

```
  <servlet>
    <servlet-name>app</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
    <init-param>
      <param-name>contextConfigLocation</param-name>
      <param-value></param-value>
    </init-param>
    <load-on-startup>1</load-on-startup>
  </servlet>

  <servlet-mapping>
    <servlet-name>app</servlet-name>
    <url-pattern>/*</url-pattern>
  </servlet-mapping>
```

<aside class="notes">
Spring MVC, as many other web frameworks, is designed around the front controller pattern where a central Servlet, the DispatcherServlet, provides a shared algorithm for request processing, while actual work is performed by configurable delegate components. This model is flexible and supports diverse workflows.
</aside>

## DispatcherServlet - details


![](https://docs.spring.io/spring/docs/current/spring-framework-reference/images/mvc-context-hierarchy.png)


<!--
1.15.4. Convenient ApplicationContext Instantiation for Web Applications


```
<context-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/daoContext.xml /WEB-INF/applicationContext.xml</param-value>
</context-param>

<listener>
    <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
```
-->



# Spring MVC


Model - View - Controller



# Controllers

## Example controller

```
@RestController
public class MyController {

    @RequestMapping
    public String hello() {
        return "hello";
    }
}
```

## `@Controller` and `@RestController` 



@RestController is a composed annotation that is itself meta-annotated with @Controller and @ResponseBody to indicate a controller whose every method inherits the type-level @ResponseBody annotation and, therefore, writes directly to the response body versus view resolution and rendering with an HTML template.

## Request mapping


*    `@RequestMapping`

*    `@GetMapping`

*    `@PostMapping`

*    `@PutMapping`

*    `@DeleteMapping`

*    `@PatchMapping`

## URI patterns

`@PathVariable`

```
@GetMapping("/owners/{ownerId}/pets/{petId}")
public Pet findPet(@PathVariable Long ownerId, @PathVariable Long petId) {
    // ...
}
```

## URI patterns - wildcards

Wildcards:

* `?` one character

* `*` zero or more characters within a path segment

* `**` zero or more path segments

```
@GetMapping("/{name:[a-z-]+}-{version:\\d\\.\\d\\.\\d}{ext:\\.[a-z]+}")
public void handle(@PathVariable String version, @PathVariable String ext) {
    // ...
}
```

## Pattern Comparison

When multiple patterns match a URL, they must be compared to find the best match. This is done by using AntPathMatcher.getPatternComparator(String path), which looks for patterns that are more specific.

E.g The default mapping pattern `/**` is excluded from scoring and always sorted last.


## Consumable Media Types


You can narrow the request mapping based on the `Content-Type` of the request, as the following example shows:

```
@PostMapping(path = "/pets", consumes = "application/json") 
public void addPet(@RequestBody Pet pet) {
    // ...
}
```

## Producible Media Types

You can narrow the request mapping based on the Accept request header and the list of content types that a controller method produces, as the following example shows:

```
@GetMapping(path = "/pets/{petId}", produces = "application/json") 
@ResponseBody
public Pet getPet(@PathVariable String petId) {
    // ...
}
```

## Parameters, headers mapping

You can narrow request mappings based on request parameter conditions. You can test for the presence of a request parameter (myParam), for the absence of one (!myParam), or for a specific value (myParam=myValue).

```
@GetMapping(path = "/pets/{petId}", params = "myParam=myValue") 
public void findPet(@PathVariable String petId) {
    // ...
}
```

## Headers mapping



You can also use the same with request header conditions, as the following example shows:

```
@GetMapping(path = "/pets", headers = "myHeader=myValue") 
public void findPet(@PathVariable String petId) {
    // ...
}
```

## Mappings - tasks

* <a href="spring-web-tasks.html#/zadanie-3" target="_blank">[Task 3]</a>
* <a href="spring-web-tasks.html#/zadanie-4" target="_blank">[Task 4]</a>

# Handle methods

## `@RequestParam`



You can use the `@RequestParam` annotation to bind Servlet request parameters (that is, query parameters or form data) to a method argument in a controller.


```
@Controller
@RequestMapping("/pets")
public class EditPetForm {

    @GetMapping
    public String setupForm(@RequestParam("petId") int petId, Model model) { 
        Pet pet = this.clinic.loadPet(petId);
        model.addAttribute("pet", pet);
        return "petForm";
    }

}
```

## `@RequestHeader`

You can use the `@RequestHeader` annotation to bind a request header to a method argument in a controller.


```
@GetMapping("/demo")
public void handle(
        @RequestHeader("Accept-Encoding") String encoding, 
        @RequestHeader("Keep-Alive") long keepAlive) { 
    //...
}
```

## `@CookieValue`



You can use the `@CookieValue` annotation to bind the value of an HTTP cookie to a method argument in a controller.

```
@GetMapping("/demo")
public void handle(@CookieValue("JSESSIONID") String cookie) { 
    //...
}
```


## `@RequestBody`

You can use the @RequestBody annotation to have the request body read and deserialized into an Object through an HttpMessageConverter. 

```
@PostMapping("/accounts")
public void handle(@RequestBody Account account) {
    // ...
}
```

## `@ResponseBody`

You can use the @ResponseBody annotation on a method to have the return serialized to the response body through an HttpMessageConverter. 

```
@GetMapping("/accounts/{id}")
@ResponseBody
public Account handle() {
    // ...
}
```

Note: @ResponseBody is also supported at the class level, in which case it is inherited by all controller methods. This is the effect of @RestController, which is nothing more than a meta-annotation marked with @Controller and @ResponseBody.

## Handle methods - tasks

* <a href="spring-web-tasks.html#/zadanie-5" target="_blank">[Task 5]</a>
* <a href="spring-web-tasks.html#/zadanie-6" target="_blank">[Task 6]</a>
