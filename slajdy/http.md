% Web application fundamentals

# HTTP

## Network model

![](https://upload.wikimedia.org/wikipedia/commons/8/8d/OSI_Model_v1.svg)


<!--
levells

http://www.cellbiol.com/bioinformatics_web_development/chapter-1-internet-networks-and-tcp-ip/the-tcpip-family-of-internet-protocols/

https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol
-->


## HTTP

HTTP is an application layer protocol designed within the framework of the Internet protocol suite. Its definition presumes an underlying and reliable transport layer protocol,[8] and Transmission Control Protocol (TCP) is commonly used. 


## URI & URL
HTTP resources are identified and located on the network by Uniform Resource Locators (URLs), using the Uniform Resource Identifiers (URI's) schemes http and https. For example, including all optional components: 

<div style="font-size: 64%">
```
            userinfo          host        port
        ┌───────┴───────┐ ┌────┴────────┐ ┌┴┐
 http://john.doe:password@www.example.com:123/forum/questions/?tag=networking&order=newest#top
 └─┬─┘ └───────────┬────────────────────────┘└─┬─────────────┘└────────┬──────────────────┘└┬─┘
 scheme         authority                      path                  query             fragment
```
</div>

## Request and Response

HTTP is an asymmetric request-response client-server protocol:

* client sends a request message to an HTTP server  
* server, in turn, returns a response message  

HTTP is a pull protocol. 

![](https://www.ntu.edu.sg/home/ehchua/programming/webprogramming/images/HTTP.png)


---

![](https://www.ntu.edu.sg/home/ehchua/programming/webprogramming/images/HTTP_Steps.png)

[more](https://www.ntu.edu.sg/home/ehchua/programming/webprogramming/HTTP_Basics.html)

## HTTPS Methods

<table>
<tr><td>

* `GET` (safe)
* `POST` (unsafe)
* `PUT` (unsafe)
* `DELETE` (unsafe)

</td>
<td>

* `HEAD` (safe)
* `OPTIONS` (safe)
* `PATCH` (unsafe)
* `CONNECT` (unsafe)
* `TRACE` (safe)

</td></tr>
</table>


## Sample GET request

```
GET /questions HTTP/1.0
Host: stackoverflow.com
User-Agent: Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:69.0) Gecko/20100101 Firefox/69.0
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
Accept-Language: pl,en-US;q=0.7,en;q=0.3
Accept-Encoding: gzip, deflate, br
Connection: keep-alive


```

## Example: request

```
telnet stackoverflow.com 80
```

```
GET /questions HTTP/1.0
Host: stackoverflow.com



```

## Example: request

```
curl -v stackoverflow.com/questions
```

## Response statuses

* `100+` - info
* `200+` - OK
* `300+` - redirect
* `400+` - user errors <div class="clicker" tabindex="1" style="display: inline;" onclick="window.dispatchEvent(new Event('resize'))"></div><div class="hiddendiv">_you f%cked up_</div>  
* `500+` - server erorrs <div class="clicker" tabindex="1" style="display: inline;" onclick="window.dispatchEvent(new Event('resize'))"></div><div class="hiddendiv">_we f%cked up_</div> 


## Mime types

A media type (also known as a Multipurpose Internet Mail Extensions or MIME type) is a standard that indicates the nature and format of a document, file, or assortment of bytes. It is defined and standardized in IETF's RFC 6838.

`type/subtype` or `type/subtype;parameter=value`

E.g.
* `text/plain`
* `text/css`
* `text/html`
* `text/javascript`
* `image/jpeg`
* `application/json`

<!--
## HTTPS
-->


# REST

REST - acronym for *REpresentational State Transfer*, 

## Constraints

* Client-Server
* Stateless
* Cacheable
* Layered System
* Code on Demand (optional)
* Uniform Interface Contract

<a href="https://www.restapitutorial.com/lessons/whatisrest.html" target="_blank">[more]</a>
<a href="https://www.guru99.com/restful-web-services.html" target="_blank">[more]</a>
<a href="https://www.edureka.co/blog/what-is-rest-api/" target="_blank">[more]</a>

### Client-server
<aside class="notes">* The c-s arch separates c from suniform interface separates clients from servers. This separation of concerns means that, for example, clients are not concerned with data storage, which remains internal to each server, so that the portability of client code is improved. Servers are not concerned with the user interface or user state, so that servers can be simpler and more scalable. Servers and clients may also be replaced and developed independently, as long as the interface is not altered. </aside>

### Stateless
<aside class="notes">* The concept of stateless means that it's up to the client to ensure that all the required information is provided to the server. This is required so that server can process the response appropriately. The server should not maintain any sort of information between requests from the client. It's a very simple independent question-answer sequence. The client asks a question, the server answers it appropriately. The client will ask another question. The server will not remember the previous question-answer scenario and will need to answer the new question independently.</aside>

### Cacheable
<aside class="notes">* As on the World Wide Web, clients can cache responses. Responses must therefore, implicitly or explicitly, define themselves as cacheable, or not, to prevent clients reusing stale or inappropriate data in response to further requests. Well-managed caching partially or completely eliminates some client–server interactions, further improving scalability and performance.
</aside>

### Layered System
<aside class="notes">* A client cannot ordinarily tell whether it is connected directly to the end server, or to an intermediary along the way. Intermediary servers may improve system scalability by enabling load-balancing and by providing shared caches. Layers may also enforce security policies.</aside>

### Code on Demand (optional)
<aside class="notes">* Servers are able to temporarily extend or customize the functionality of a client by transferring logic to it that it can execute. Examples
</aside>

### Uniform Interface Contract
<aside class="notes">The client-server architecture enables a uniform interface and separates clients from the servers.  This enhances the portability across multiple platforms as well as the scalability of the server components.
</aside>

## Uniform Interface Contract Principles

* Resource-Based
* Manipulation of Resources Through Representations
* Self-descriptive Messages
* HATEOAS (Hypermedia as the Engine of Application State)

<aside class="notes">https://www.restapitutorial.com/lessons/whatisrest.html
       https://stackoverflow.com/questions/25172600/rest-what-exactly-is-meant-by-uniform-interface
</aside>

### Resource-Based
<aside class="notes">Individual resources are identified in requests using URIs as resource identifiers. The resources themselves are conceptually separate from the representations that are returned to the client. For example, the server does not send its database, but rather, some HTML, XML or JSON that represents some database records expressed, for instance, in Finnish and encoded in UTF-8, depending on the details of the request and the server implementation.</aside>



### Manipulation of Resources Through Representations
<aside class="notes">When a client holds a representation of a resource, including any metadata attached, it has enough information to modify or delete the resource on the server, provided it has permission to do so.</aside>


### Self-descriptive Messages
<aside class="notes">Each message includes enough information to describe how to process the message. For example, which parser to invoke may be specified by an Internet media type (previously known as a MIME type). Responses also explicitly indicate their cache-ability.</aside>

### HATEOAS (Hypermedia as the Engine of Application State)
<aside class="notes">
* You use hyperlinks and possibly URI templates to decouple the client from the application specific URI structure. You can annotate these hyperlinks with semantics e.g. IANA link relations, so the client will understand what they mean.
* While services are still useful without them, APIs become more self-descriptive and discoverable when links are returned in the response. At
</aside>



## Implementation

RESTful works on the HTTP web layer and uses the HTTP methods to work with resources on the server:

* `GET` - to **retrieve** a resource from the server
* `POST` - to **create** a resource on the server
* `PUT` - to complete **replacement** of a document
* `PATCH` - to **modify** (also **partially**) an existing HTTP resource.
* `DELETE` - to **remove** or delete a resource from the server


## REST - recommended concepts

* Use HTTP Verbs to Make Your Requests Mean Something

* Provide Sensible Resource Names

* Use HTTP Response Codes to Indicate Status

* Offer Both JSON and XML

* Consider Connectedness


## Resource names conventions (1)

* in URLs identifiers instead of in the query-string, e.g. `/users/12345` (query string keep for filtering (e.g. `/api?type=user&id=23`)

* Leverage the hierarchical nature of the URL to imply structure, e.g. `/posts/123/comments/456`

* Design for your clients, not for your data.

* Use lower-case in URL segments, separating words with `_` or `-`. Some servers ignore case so it's best to be clear.

* Keep URLs as short as possible, with as few segments as makes sense.

## Resource names conventions (2)

* Resource names should be **nouns**. Avoid verbs as resource names, to improve clarity. Use the HTTP methods to specify the verb portion of the request.

* Use **plurals** in URL segments to keep your API URIs consistent across all HTTP methods, using the collection metaphor.
  * Recommended: /customers/33245/orders/8769/lineitems/1
  * Not: /customer/33245/order/8769/lineitem/1

* Avoid using collection verbiage in URLs, e.g. instead of ~~`customer_list`~~ use pluralization to indicate 
the collection metaphor `customers`



# Data formats in REST


## XML

**XML (Extensible Markup Language)** - is a markup language similar to HTML, but without predefined tags to use. 

Declaration:
```
<?xml version="1.0" encoding="UTF-8"?>
```

Example:
```
<?xml version="1.0" encoding="UTF-8"?>
<message>
    <warning>
         Hello World
    </warning>
</message>
```

XSD and DTD for declaring XML schema.


## JSON

**JavaScript Object Notation (JSON)** - is a syntax for serializing objects, arrays, numbers, strings, booleans, and null. It is based upon JavaScript syntax but is distinct from it (JSON can be JS, but some JavaScript is not JSON).

Example:
```
{
  "message": {
    "warning": "Hello World"
  }
}
```

## Task

# REST server

## Ratpack server setup

Maven:
```
<dependency>
  <groupId>io.ratpack</groupId>
  <artifactId>ratpack-core</artifactId>
  <version>1.7.3</version>
</dependency>
```



## Simple handle 

Java code:
```
RatpackServer.start(server -> server
  .handlers(
    chain -> chain
      .get(ctx -> ctx.render("Hello World!"))
  )
);
```

## URL dependent handle

```
RatpackServer.start(server -> server
  .handlers(
    chain -> chain
      .get("/hello", ctx -> ctx.render("Hello Ratpack"))
  )
);
```

## Return JSON

```
RatpackServer.start(server -> server
  handlers(
    chain -> chain
      .get(ctx -> ctx.render(Jackson.json(new Car())))
  )
);
```

## Handle response - task

* <a href="http-tasks.html#/zadanie-2" target="_blank">[Task 2]</a>
* <a href="http-tasks.html#/zadanie-3" target="_blank">[Task 3]</a>

## Parameterized URL

```
.get("orders/:id", ctx -> {
  String id = ctx.getPathBinding().getAllTokens().get("id");
  ctx.render(Jackson.json(new Product(id)));
})
```


## Parameterized URL - task

* <a href="http-tasks.html#/zadanie-4" target="_blank">[Task 4]</a>


## Connect to database

```
<dependency>
  <groupId>io.ratpack</groupId>
  <artifactId>ratpack-guice</artifactId>
  <version>1.7.5</version>
</dependency>
<dependency>
  <groupId>io.ratpack</groupId>
  <artifactId>ratpack-hikari</artifactId>
  <version>1.7.5</version>
</dependency>
```

```
.registry(Guice.registry(bindings ->
  bindings.module(HikariModule.class, config -> {
    config.setDataSourceClassName("org.postgresql.ds.PGSimpleDataSource");
    config.setUsername("postgres");
    config.setPassword("postgres");
    config.addDataSourceProperty("URL", "jdbc:...");
   })
))
```

## Handle database connection

```
.get("products", ctx -> Blocking
  .get(() -> {
    try (Connection connection = ctx.get(DataSource.class).getConnection()) {
      connection.createStatement("SELECT * FROM product");
	  ResultSet resultSet = statement.executeQuery();
	  resultSet.next();
	  return resultSet.getString(1);
    }
  })
  .then(e -> ctx.render(Jackson.json(e)))
)
```

## Aside: Dependency Injection

The core principle is to _separate behaviour from dependency resolution_.

## Handle database connection - tasks

* <a href="http-tasks.html#/zadanie-5" target="_blank">[Task 5]</a>
* <a href="http-tasks.html#/zadanie-6" target="_blank">[Task 6]</a>
* <a href="http-tasks.html#/zadanie-7" target="_blank">[Task 7]</a>


## Handle REST operations - tasks

* <a href="http-tasks.html#/zadanie-7" target="_blank">[Task 7]</a>
* <a href="http-tasks.html#/zadanie-8" target="_blank">[Task 8]</a>
* <a href="http-tasks.html#/zadanie-9" target="_blank">[Task 9]</a>
* <a href="http-tasks.html#/zadanie-10" target="_blank">[Task 10]</a>
* <a href="http-tasks.html#/zadanie-11" target="_blank">[Task 11]</a>

# Testing REST server

## Setup tests

```
<dependency>
  <groupId>io.ratpack</groupId>
  <artifactId>ratpack-test</artifactId>
  <version>1.7.5</version>
  <scope>test</scope>
</dependency>
``` 


## Tests
```
public class ApplicationTest {
	static MainClassApplicationUnderTest mainClassApplicationUnderTest;

	@BeforeClass
	public static void setup() {
		mainClassApplicationUnderTest = new MainClassApplicationUnderTest(Application.class);
	}

	@AfterClass
	public static void cleanup() {
		mainClassApplicationUnderTest.close();
	}

	@Test
	public void testHelloWorld() throws Exception {
		mainClassApplicationUnderTest.test(
				httpClient -> assertEquals("Hello world!", httpClient.get("/api/orders").getBody().getText())
		);
	}
}
```


## Testing API - tasks
* <a href="http-tasks.html#/zadanie-12" target="_blank">[Task 12]</a>

# Advanced handling

## Query with JOINs - tasks
* <a href="http-tasks.html#/zadanie-13" target="_blank">[Task 13]</a>
* <a href="http-tasks.html#/zadanie-14" target="_blank">[Task 14]</a>
* <a href="http-tasks.html#/zadanie-15" target="_blank">[Task 15]</a>
* <a href="http-tasks.html#/zadanie-16" target="_blank">[Task 16]</a>
* <a href="http-tasks.html#/zadanie-17" target="_blank">[Task 17]</a>

## Filter by query parameters

## Filter by query parameters - task

* <a href="http-tasks.html#/zadanie-18" target="_blank">[Task 18]</a>

## HATEOAS compliance

## HATEOAS compliance - task

* <a href="http-tasks.html#/zadanie-19" target="_blank">[Task 19]</a>

# The end