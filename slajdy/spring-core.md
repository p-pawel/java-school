% Spring Framework (Core)

# Introduction

## Spring Framework Overview

* Aims to create Java enterprise applications easily. 

* Leave the flexibility to create architectures depending on an application’s needs.

* Spring supports a wide range of application scenarios: server, cloud, standalone etc.
 
* Spring is open source with large active community 

* Provides out-of-the-box support for modern JDK (as of Spring 5.1, it requires JDK 8+ and supports JDK up to 11 LTS)

* Supports Groovy and Kotlin as alternative languages on the JVM.
 

<aside class="notes">

1) Focuses on enterprise application. Technically it provides everything we need to encircle an enterprise environment with the Java language.
 
2) Provides flexibility to create many kinds of architectures depending on an application’s needs: server, cloud, standalone etc.


3) In a large enterprise, applications often exist for a long time and have to run on a JDK and application server whose upgrade cycle is beyond developer control. 
Others may run as a single jar with the server embedded, possibly in a cloud environment. 
Yet others may be standalone applications (such as batch or integration workloads) that do not need a server.

4) that provides continuous feedback based on a diverse range of real-world use cases. This has helped Spring to successfully evolve over a very long time.


5) As of Spring Framework 5.1, Spring requires JDK 8+ (Java SE 8+) and provides out-of-the-box support for JDK 11 LTS. 
Java SE 8 update 60 is suggested as the minimum patch release for Java 8, but it is generally recommended to use a recent patch release.

6) languages can vary within single project
 
</aside>


## What `Spring` means?



The term `Spring` means different things in various contexts: 

* It can be used to refer to the Spring Framework project itself, which is where it all started.

* Most often, when people say "Spring", they mean the entire family of projects built on top of the Spring Framework over time.  
  
  
  
## What `Core` means?


The Spring Framework is divided into modules. 
Applications can choose which modules they need. 


* At the heart are the modules of the `core` container - including a configuration model and a dependency injection mechanism. 

* Beyond `core` the Spring Framework modules provide support for: different architectures, messaging, 
persistence, transactional, web (Servlet-based Spring MVC web framework, and the Spring WebFlux reactive web framework).

## Spring modules and JDK 9

Spring’s modules allow for deployment to JDK 9’s module path (`Jigsaw`) with stable language-level module names 
(e.g. `spring.core`, `spring.context` etc) independent from jar artifact names (e.g. `spring-core` and `spring-context`). 

Of course, Spring’s framework jars keep working fine on the classpath on both JDK 8 and 9+.

## Spring history

<img src="spring-core-expertoneonone.jpg" style="width: 20%; float: right"/>

The first version of the Spring framework was written by Rod Johnson in 2002 along with a book *"Expert One-on-One J2EE Design and Development"* 

Spring came into being in 2003 as a response to the complexity of the early J2EE specifications. 

## Spring vs Java EE

* ~~competition~~ -> complementary to Java EE
 
* The Spring programming model integrates with carefully selected individual specifications from Java EE:

<small>
* Servlet API (JSR 340)
* WebSocket API (JSR 356)
* Concurrency Utilities (JSR 236)
* JSON Binding API (JSR 367)
* Bean Validation (JSR 303)
* JPA (JSR 338)
* JMS (JSR 914)
* JTA/JCA,
* Dependency Injection (JSR 330) 
* Common Annotations (JSR 250)
</small>



Spring bv5 bases on Java EE 7 specifications (e.g. Servlet 3.1+, JPA 2.1+) and provides
 integration with new APIs from Java EE 8 (e.g. Servlet 4.0, JSON Binding API).
 
 Spring is fully compatible with e.g. Tomcat 8 and 9, WebSphere 9, and JBoss EAP 7.  

<aside class="notes">

While usually considered to be in competition, Spring is, in fact, complementary to Java EE.


The Spring programming model does not embrace the Java EE platform specification; rather, it integrates with carefully selected individual specifications from the EE umbrella:


EE = to przede wszystkim "specyfikacja" -> inspiracja dla "alternatyw", więc w pewnym sensie podwaliny dla wszystkich innych frameworków jak Spring
</aside>

## Role of Java EE and Spring



The role of JavaEE in application development evolved over time:
 
* In the early days of Java EE and Spring, applications were created to be deployed to an application server.
  
* Today, with the help of Spring Boot, applications are created in a devops- and cloud-friendly way, with the Servlet container embedded and trivial to change. 

* As of Spring Framework 5, a WebFlux application does not even use the Servlet API directly and can run on servers (such as Netty) that are not Servlet containers.




# Spring IoC Container

## Inversion of Control principle 

Spring Framework implements the Inversion of Control (IoC) principle. IoC is also known as dependency injection (DI). 

Dependencies = other objects our object work with
 
In plain OOP we can define dependencies by instantiating them when needed. 

## Injection of dependencies 

In DI process, objects do not instantiate dependencies itself, but they define their dependencies only through:

* constructor arguments,
* arguments to a factory method, or
* properties that are set on the object instance (after it is constructed or returned from a factory method).
 
The container then injects those dependencies when it creates the bean. 

This process is the inverse of the bean itself controlling
 the instantiation and location of its dependencies.

## IoC container

The basis for Spring Framework’s IoC container:

* `BeanFactory` - provides an advanced configuration mechanism capable of managing any type of object
(provides the configuration framework and basic functionality)

* `ApplicationContext` - extends `BeanFactory` with more enterprise-specific functionality

Note: `BeanFactory` should be treated as framework 
 
## Container magic

![](https://docs.spring.io/spring/docs/current/spring-framework-reference/images/container-magic.png)


## Application context implementations



Several implementations of the `ApplicationContext` interface are supplied with Spring:
 
* In stand-alone applications, it is common to create an instance of `ClassPathXmlApplicationContext` or `FileSystemXmlApplicationContext`.
Also for annotation- or Java-based configuration 

* Sometimes we are not required to instantiate a Spring IoC container manually, e.g in web applications it is enough to config listener in `web.xml` file.

<aside class="notes">
1) While XML has been the traditional format for defining configuration metadata, you can instruct the container to use Java annotations or code as the metadata format by providing a small amount of XML configuration to declaratively enable support for these additional metadata formats.

2) jutro przy webówce więcej
</aside>


## Application context implementations - task

* <a href="spring-core-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>

## Metadata configuration 

* Traditional XML format configuration
 
* Annotation-based configuration

* Java-based configuration


<aside class="notes">
1) Configuration metadata is traditionally supplied in a simple and intuitive XML format, 
which is what most of this chapter uses to convey key concepts and features of the Spring IoC container.
</aside>


## XML-based configuration

<div style="font-size: 80%">

```
<?xml version="1.0" encoding="UTF-8"?>
<beans 
    xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd"
>

    <bean id="..." class="...">
  
    </bean>

</beans>

```
</div>

<aside class="notes">
    1) more bean definitions go here 
    
    2) collaborators and configuration for this bean go here
</aside>



## Instantiating containers 


```
ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
```

## Application context implementations - task

* <a href="spring-core-tasks.html#/zadanie-2" target="_blank">[Task 2]</a>


# Beans

## 1.3. Bean Overview


```
<bean id="..." class="...">  
  <!-- collaborators and configuration for this bean -->
</bean>

<bean id="..." class="...">
  <!-- collaborators and configuration for this bean -->
</bean>
```

## Bean Naming Conventions

The convention is to use the standard Java convention for instance field names when naming beans.
That is, bean names start with a lowercase letter and are camel-cased from there. 

Examples of such names include `accountManager`, `accountService`, `userDao`, `loginController`, and so forth.

## Bean `name` and `id`

* In simple scenarios mutually replaceable
  * ids correlate directly to the XML element

* One id, more names

```
<bean id="foo" name = "myFoo,kingBean,notBar" class="com.intertech.Foo" />
```

* Names Still Must Uniquely Identify

* Non-unique Bean Id or Name Across Bean Files

<aside class="notes">
https://www.intertech.com/Blog/clarifying-spring-framework-ids-and-names/
</aside>

## Aliasing a Bean

Aliasing a Bean outside the Bean Definition:

```
<alias name="fromName" alias="toName"/>
```

## Beans - tasks

* <a href="spring-core-tasks.html#/zadanie-3" target="_blank">[Task 3]</a>

* <a href="spring-core-tasks.html#/zadanie-4" target="_blank">[Task 4]*</a>

# Dependencies

* A typical enterprise application does not consist of a single object. 

* Even the simplest application has a few objects that work together to present what the end-user sees as a coherent application. 

 
## Dependency injection - recap

In DI process, objects do not instantiate dependencies itself.
 
## Dependency injection - profits 


Code is cleaner with the DI principle, and decoupling is more effective when objects are provided with their dependencies.

The object does not look up its dependencies and does not know the location or class of the dependencies.

As a result, your classes become easier to test, particularly when the dependencies are on interfaces or abstract base classes, which allow for stub or mock implementations to be used in unit tests.

## DI variants in Spring

DI exists in two major variants: 

* Constructor-based dependency injection 
* Setter-based dependency injection.
 

## Constructor-based dependency injection


```
public class CartService {

    private ProductRepository productRepository;

    public CartService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // ...
}
```

<aside class="notes">
<a target="_blank" href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-constructor-injection">Examples in docs</a>
</aside>

---

* Constructor Argument Resolution

```
<beans>
    <bean id="beanOne" class="x.y.ThingOne">
        <constructor-arg ref="beanTwo"/>
        <constructor-arg ref="beanThree"/>
    </bean>

    <bean id="beanTwo" class="x.y.ThingTwo"/>

    <bean id="beanThree" class="x.y.ThingThree"/>
</beans>
```

---

* Constructor argument type matching 

```
<bean id="exampleBean" class="examples.ExampleBean">
    <constructor-arg type="int" value="7500000"/>
    <constructor-arg type="java.lang.String" value="42"/>
</bean>
```

---

* Constructor argument index

```
<bean id="exampleBean" class="examples.ExampleBean">
    <constructor-arg index="0" value="7500000"/>
    <constructor-arg index="1" value="42"/>
</bean>
```


---

* Constructor argument name

```
<bean id="exampleBean" class="examples.ExampleBean">
    <constructor-arg name="years" value="7500000"/>
    <constructor-arg name="ultimateAnswer" value="42"/>
</bean>
```


## Setter-based dependency injection.

```
public class CartService {

    private ProductRepository productRepository;

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // ...
}
```

---

```


<bean id="exampleBean" class="examples.ExampleBean">
    <!-- setter injection using the nested ref element -->
    <property name="beanOne">
        <ref bean="anotherExampleBean"/>
    </property>

    <!-- setter injection using the neater ref attribute -->
    <property name="beanTwo" ref="yetAnotherBean"/>
    <property name="integerProperty" value="1"/>
</bean>

<bean id="anotherExampleBean" class="examples.AnotherBean"/>
<bean id="yetAnotherBean" class="examples.YetAnotherBean"/>

```

## Constructor-based vs setter-based DI?


The Spring team generally advocates constructor injection:

* it lets you implement application components as immutable objects 
* ensures that required dependencies are not null. 
* constructor-injected components are always returned to the client (calling) code in a fully initialized state
* a large number of constructor arguments is a bad code smell, implying that the class likely has too many responsibilities and should be refactored

---

Setter injection:

* should primarily only be used for optional dependencies that can be assigned reasonable default values within the class.
 Otherwise, not-null checks must be performed everywhere the code uses the dependency. 
* setter methods make objects of that class amenable to reconfiguration or re-injection later

## DI variants - tasks

* <a href="spring-core-tasks.html#/zadanie-5" target="_blank">[Task 5]</a>
* <a href="spring-core-tasks.html#/zadanie-6" target="_blank">[Task 6]</a>



# DI configuration details

## Straight Values (Primitives, Strings, and so on)

```
<bean id="myDataSource" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
    <!-- results in a setDriverClassName(String) call -->
    <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
    <property name="url" value="jdbc:mysql://localhost:3306/mydb"/>
    <property name="username" value="root"/>
    <property name="password" value="masterkaoli"/>
</bean>
```

## Straight Values using `p-namespace`

```
xmlns:p="http://www.springframework.org/schema/p"
```

```
<bean id="myDataSource" class="org.apache.commons.dbcp.BasicDataSource"
    destroy-method="close"
    p:driverClassName="com.mysql.jdbc.Driver"
    p:url="jdbc:mysql://localhost:3306/mydb"
    p:username="root"
    p:password="masterkaoli"/>
```

## The `idref` element

```
<bean id="theTargetBean" class="..."/>

<bean id="theClientBean" class="...">
    <property name="targetName">
        <idref bean="theTargetBean"/>
    </property>
</bean>
```

## References to Other Beans (Collaborators)


```
<ref bean="someBean"/>
```

E.g.

```
<bean id="theTargetBean" class="..."/>

<bean id="theClientBean" class="...">
    <property name="target">
        <ref bean="theTargetBean"/>
    </property>
</bean>
```

## `ref` vs `idref`

* `ref` is used to pass the bean that the ref refers to.
* `idref` is used to pass the name of the bean (as a String) that is referred to.

## DI configuration - tasks

* <a href="spring-core-tasks.html#/zadanie-7" target="_blank">[Task 7]</a>
* <a href="spring-core-tasks.html#/zadanie-8" target="_blank">[Task 8]</a>
* <a href="spring-core-tasks.html#/zadanie-9" target="_blank">[Task 9]</a>





# Beans in detail

## 1.5. Bean Scopes



Basic scopes:

* `singleton` (default) - scopes a single bean definition to a single object instance for each Spring IoC container.
* `prototype` - scopes a single bean definition to any number of object instances.

In a web-aware context:

* `request`
* `session`
* `application`
* `websocket`

<aside class="notes">
When you create a bean definition, you create a recipe for creating actual instances of the class defined by that bean definition. The idea that a bean definition is a recipe is important, because it means that, as with a class, you can create many object instances from a single recipe.

You can control not only the various dependencies and configuration values that are to be plugged into an object that is created from a particular bean definition but also control the scope of the objects created from a particular bean definition. This approach is powerful and flexible, because you can choose the scope of the objects you create through configuration instead of having to bake in the scope of an object at the Java class level.
</aside>

## Scope: singleton

You can define a bean as shown in the following example:
```
<bean id="accountService" class="com.ex.DefaultAccountService"/>
```

The following is equivalent, though redundant (singleton scope is the default):

```
<bean id="accountService" class="com.ex.DefaultAccountService" scope="singleton"/>
```

## Scope: prototype


![](https://docs.spring.io/spring/docs/current/spring-framework-reference/images/prototype.png)


```
<bean id="accountService" class="c.e.DefaultAccountService" scope="prototype"/>
```

Note: dependencies are resolved at instantiation time.

<aside class="notes">

When you use singleton-scoped beans with dependencies on prototype beans, be aware that dependencies are resolved at instantiation time. Thus, if you dependency-inject a prototype-scoped bean into a singleton-scoped bean, a new prototype bean is instantiated and then dependency-injected into the singleton bean. The prototype instance is the sole instance that is ever supplied to the singleton-scoped bean.

However, suppose you want the singleton-scoped bean to acquire a new instance of the prototype-scoped bean repeatedly at runtime. You cannot dependency-inject a prototype-scoped bean into your singleton bean, because that injection occurs only once, when the Spring container instantiates the singleton bean and resolves and injects its dependencies. If you need a new instance of a prototype bean at runtime more than once, see Method Injection

</aside>



## Method injection


We can inject `ApplicationContext` and try to instantiate prototype bean.

<aside class="notes">
<a target="_blank" href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-method-injection">docs</a>
</aside>


## Lookup method

```
<!-- a stateful bean deployed as a prototype (non-singleton) -->
<bean id="myCommand" class="fiona.apple.AsyncCommand" scope="prototype">
    <!-- inject dependencies here as required -->
</bean>

<!-- commandProcessor uses statefulCommandHelper -->
<bean id="commandManager" class="fiona.apple.CommandManager">
    <lookup-method name="createCommand" bean="myCommand"/>
</bean>

```

## Arbitrary Method Replacement

Possible, but not really useful:

```
<bean id="myValueCalculator" class="x.y.z.MyValueCalculator">
    <!-- arbitrary method replacement -->
    <replaced-method name="computeValue" replacer="replacementComputeValue">
        <arg-type>String</arg-type>
    </replaced-method>
</bean>

<bean id="replacementComputeValue" class="a.b.c.ReplacementComputeValue"/>
```

## Bean scopes - tasks

* <a href="spring-core-tasks.html#/zadanie-10" target="_blank">[Task 10]</a>

## Lifecycle Callbacks

* implement the Spring `InitializingBean` and `DisposableBean` interfaces with methods
 `afterPropertiesSet()` or `destroy()` respectively

* use  JSR-250 `@PostConstruct` and `@PreDestroy` annotations

* use `init-method` and `destroy-method` in XML bean definition metadata 


## Bean Definition Inheritance
```


<bean id="inheritedTestBean" abstract="true"
        class="org.springframework.beans.TestBean">
    <property name="name" value="parent"/>
    <property name="age" value="1"/>
</bean>

<bean id="inheritsWithDifferentClass"
        class="org.springframework.beans.DerivedTestBean"
        parent="inheritedTestBean" >  
    <property name="name" value="override"/>
    <!-- the age property value of 1 will be inherited from parent -->
</bean>

```

## Container Extension Points

* Customizing Beans by Using a `BeanPostProcessor` - <a target="_blank" href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-extension-bpp">docs</a>
* Customizing Configuration Metadata with a `BeanFactoryPostProcessor` - <a target="_blank" href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-extension-factory-postprocessors">docs</a>
* Customizing Instantiation Logic with a `FactoryBean` - <a target="_blank" href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-factory-extension-factorybean">docs</a>




# Configuration


## Annotation-based Container Configuration

Enabled by `<context:annotation-config/>`

* `@Required`
* `@Autowired` or JSR 330’s `@Inject`
* `@Resource(name="...")`


<aside class="notes">
<a target="_blank" href="https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html#beans-annotation-config">docs</a>
</aside>


## Classpath Scanning and Managed Components

```<context:component-scan base-package="org.example"/>```

*  `@Component` and Further Stereotype Annotations

## 1.11. Using JSR 330 Standard Annotations

```
<dependency>
    <groupId>javax.inject</groupId>
    <artifactId>javax.inject</artifactId>
    <version>1</version>
</dependency>
```

* `@Inject` and `@Named`
* `@Named` and `@ManagedBean` - standard Equivalents to the `@Component` Annotation

## 1.12. Java-based Container Configuration

## Basic Concepts: `@Bean` and `@Configuration`

## Instantiating the Spring Container by Using `AnnotationConfigApplicationContext`

## Composing Java-based Configurations


## 1.13. Environment Abstraction = Profiles


# Others

## Spring Expression Language (SpEL)

## 1.14. Registering a LoadTimeWeaver :-/

## 1.15. Additional Capabilities of the ApplicationContext

## BeanFactory vs ApplicationContext

## Constructor-based or setter-based DI?

?

# The end

## References

https://docs.spring.io/spring/docs/current/spring-framework-reference/core.html

