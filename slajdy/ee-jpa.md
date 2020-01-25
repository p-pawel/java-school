% JPA


# Intro

## Recap: SQL, JDBC


# Persistence deployment descriptor 

```
META-INF/persistence.xml
```

<!--
https://wiki.eclipse.org/EclipseLink/Examples/JPA/Configure
-->

## Minimal `persistence.xml` file

```
<persistence>
    <persistence-unit name="[REQUIRED_PERSISTENCE_UNIT_NAME_GOES_HERE]">
        SOME_PROPERTIES
    </persistence-unit>
</persistence>
```

## Data source in Java EE by JNDI  

<div style="font-size: 80%">

```
<persistence>
    <persistence-unit name="[REQUIRED_PERSISTENCE_UNIT_NAME_GOES_HERE]">
        <!--GLOBAL_JNDI_GOES_HERE-->
        <jta-data-source>jdbc/myDS</jta-data-source>
    </persistence-unit>
</persistence>
```
</div>

<div class="yagni"></div>

## Data source in Java SE

<div style="font-size: 80%">

```
<properties>
    <property name="javax.persistence.jdbc.driver" value="org.postgresql.Driver" />
    <property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/my-schema" />
    <property name="javax.persistence.jdbc.user" value="postgres" />
    <property name="javax.persistence.jdbc.password" value="postgres" />
</properties>
```

</div>

<aside class="notes">
https://stackoverflow.com/questions/14131114/does-jpa-require-the-datasources-come-from-jndi
</aside>

## Mapped classes

```
<class>com.example.model.CarEntity</class>
<class>com.example.model.EngineEntity</class>
``` 

```
<exclude-unlisted-classes>false</exclude-unlisted-classes>
```

## JPA properties

```
<persistence>
    <persistence-unit name="my-perstistence">

		<properties>
            
            ...

		</properties>

    </persistence-unit>
</persistence>
```



## Property map

```
Map<String, String> properties = new HashMap<>();

properties.put("javax.persistence.jdbc.driver", "org.apache.derby.jdbc.EmbeddedDriver");

properties.put("javax.persistence.jdbc.url", "jdbc:derby:simpleDb;create=true");

properties.put("javax.persistence.jdbc.user", "test");

properties.put("javax.persistence.jdbc.password", "test");

Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME, properties);
```

<!--
https://wiki.eclipse.org/EclipseLink/Examples/JPA/OutsideContainer
-->

## JPA implementations


-    `Hibernate`: The most advanced and widely used (A lot of libraries are used, especially with JBoss)
-    `Toplink`: Only supports the basic JPA specs. (This was oracle’s free version of the JPA implementation)
-    `EclipseLink`: Is based on TopLink, and is the intended path forward for persistence for Oracle and TopLink
-    `Apache OpenJPA`: Best documentation but seems very buggy. Open source implementation for JPA
-    `DataNucleus`: Well documented, open source; also JDO
-    `ObjectDB`: well documented
-    `CMobileCom JPA`: light-weight implementation for both Java and Android.

<a href="https://stackoverflow.com/questions/17883971/which-provider-should-be-used-for-the-java-persistence-api-jpa-implemenation" target="_blank">Discussions</a>


## Schema generation 

```
javax.persistence.schema-generation.database.action
```

* `none` - no schema creation or deletion
* `create` - creates the database schema on application deployment, and artifacts will remain unchanged after redeployment
* `drop-and-create` - deletes any artifacts in the database, and re-creates the database on deployment
* `drop` - schema deleted on application deployment

<small>
E.g. `<property name="javax.persistence.schema-generation.database.action" value="create"/>`
</small>

<a href="https://docs.oracle.com/javaee/7/tutorial/persistence-intro005.htm" target="_blank">docs</a>

## Schema generation - unified properties

Since JPA 2.1 (2013):
<small>
```
<property name="javax.persistence.schema-generation.database.action" value="drop-and-create"/>
<property name="javax.persistence.schema-generation.create-source" value="script"/>
<property name="javax.persistence.schema-generation.create-script-source" value="META-INF/sql/create.sql" />
<property name="javax.persistence.sql-load-script-source" value="META-INF/sql/data.sql" />
<property name="javax.persistence.schema-generation.drop-source" value="script" />
<property name="javax.persistence.schema-generation.drop-script-source" value="META-INF/sql/drop.sql" />
```
</small>
It replaced earlier implementation specific properties:
<small>

* `<property name="eclipselink.ddl-generation" value="create-tables" />`
* `<property name="hbm2ddl.auto">create-drop</property>`

</small>

## Getting started - task

* <a href="ee-jpa-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>

# Entity mappings

## Object-Relation Mapping (ORM)

_a square peg in a round hole_

<img src="https://m.wm.pl/2013/09/orig/dawid-podsiadlo-foto-lukasz-zietek-165769.jpg" width="70%" />

## Entity class

```
public class Employee {
   private long id;
   private String ename;

   // getters setters
}
```

* like data transfer objects we used earlier 

* must follow JavaBeans convention


## Obsolete XML mappings

<div style="font-size: 60%">

```
<? xml version="1.0" encoding="UTF-8" ?>

<entity-mappings xmlns="http://java.sun.com/xml/ns/persistence/orm"
   xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation="http://java.sun.com/xml/ns/persistence/orm    
   http://java.sun.com/xml/ns/persistence/orm_1_0.xsd"
   version="1.0">
      
   <entity class="Employee">        
      <table name="EMPLOYEETABLE"/>
      <attributes>
      
         <id name="eid">
            <generated-value strategy="TABLE"/>
         </id>

         <basic name="ename">
            <column name="EMP_NAME" length="100"/>
         </basic>
        
      </attributes>
   </entity>
</entity-mappings>
```
</div>

<div class="yagni"></div>

---

![](https://paczaizm.pl/content/wp-content/uploads/bije-bity-mozna-sie-przyzwyczaic-janek-koza.jpg)


## Annotation Mappings

```
@Entity
@Table(name = "EMPLOYEE")
public class Employee {

  // ...

}
```

# Entity members

## Persistable members

By default all members are persistable:
```
private String name;
```

Attributes (optional):

```
@Column(name="USER_NAME") 
private String name;
```

```
@Column(unique=true)           // default: false 
```

```
@Column(nullable=false)        // default: true 
```

```
@Column(insertable=false)      // default: true 
```

```
@Column(updatable=false)       // default: true 
```

```
@Column(length=32)             // default: 255 
```

```
@Column(precision=7, scale=2)  // default: 0 
```

## Persistable members - task

* <a href="ee-jpa.html#/zadanie-2" target="_blank">[Task 2]</a>

## Identifier

```
@Id
private Long id;
```  

```
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Long id;
```  

Generation strategies:  `AUTO`, `TABLE`, `SEQUENCE`, or `IDENTITY`.

## Identifier - task

* <a href="ee-jpa.html#/zadanie-3" target="_blank">[Task 3]</a>

## Enumeration column

* using ordinal numbers:
```
@Enumerated
private Status status;
```

* using string labels:
```
@Enumerated(EnumType.STRING)
private Status status;
```

## Enumeration column - task

* <a href="ee-jpa.html#/zadanie-4" target="_blank">[Task 4]</a>


## Transient - not persisted

`@Transient`


```
@Transient 
private String name;
```

## Transient column - task

* <a href="ee-jpa.html#/zadanie-5" target="_blank">[Task 5]</a>

## Large objects

```
@Lob
private String  body; 
```

```
@Lob
@Column(columnDefinition="BLOB NOT NULL")
protected byte[] pic;
```

## Large objects - task

* <a href="ee-jpa.html#/zadanie-6" target="_blank">[Task 6]</a>


# Entity manager - persisting

## Create

```
Employee employee = new Employee( ); 
employee.setId( 1201 );
employee.setName( "Gopal" );
      
entitymanager.persist( employee );
```

## Create - task

* <a href="ee-jpa.html#/zadanie-7" target="_blank">[Task 7]</a>

## Read

```
Employee employee = entitymanager.find( Employee.class, 1201 );
```

## Read - task
* <a href="ee-jpa.html#/zadanie-8" target="_blank">[Task 8]</a>


## Update

```
Employee employee = entitymanager.find( Employee.class, 1201 );

employee.setName("John Smith");

entitymanager.merge( employee );
```

## Update - task
* <a href="ee-jpa.html#/zadanie-9" target="_blank">[Task 9]</a>


## Delete

```
Employee employee = entitymanager.find( Employee.class, 1201 );
entitymanager.remove( employee );
```


## Delete - task

* <a href="ee-jpa.html#/zadanie-10" target="_blank">[Task 10]</a>

## Entity lifecycle


<img src="https://www.objectdb.com/files/images/manual/jpa-states.png" style="float: right" />
<small>

* **New/Transient** - unknown for EntityManager, does not exist in database

* **Managed** - object is persisted in database and managed by EntityManager

* **Detached** - object is still persisted in database, but no longer managed by EntityManager  
 
* **Removed** - object is deleted from database, and no longer managed by EntityManager

</small>

<aside class="notes">

* [https://dzone.com/articles/jpa-entity-lifecycle](https://dzone.com/articles/jpa-entity-lifecycle)

* [https://www.objectdb.com/java/jpa/persistence/managed](https://www.objectdb.com/java/jpa/persistence/managed)

</aside>



## Merge vs Persist vs Save vs Refresh

Place in entity lifecycle:

* persisting can be used only for new entities. 

* merging is required only for detached entities.

* saving is vendor specific method

* refreshing renews the state of the instance from the database, overwriting changes made to the entity, if any.

<!--
Specification vs 

JPA specification defines the persist method. 

merge

persist

refresh
-->

<aside class="notes">
https://thoughts-on-java.org/persist-save-merge-saveorupdate-whats-difference-one-use/
</aside>

## Re-attach entity

<div style="font-size: 70%">

```
Student student1 = entityManager.find(Student.class, 2L);// s1 is MANAGED
entityManager.clear();                                   // everyhing is DETACHED
            
student.setLastName("Vincent");             
Student student2 = entityManager.merge(student1);        // reattach

System.out.println(entityManager.contains(student1));    // false: s1 is still DETACHED 
System.out.println(entityManager.contains(student2));    // true: s2 is MANAGED 
```
</div>

<a href="https://javabydeveloper.com/merge-re-attaching-detached-entities" target="_blank">Example</a>

## Callback Methods on JPA Entities

```
@EntityListeners(UserListener.class)
public class User {
} 

```

Method annotated with
`@PrePersist`, `@PostPersist`, `@PostLoad`, `@PreUpdate`, `@PostUpdate`, `@PreRemove`, `@PostRemove`

E.g.

```
public class UserListener {
	@PrePersist
	public void userPrePersist(User ob) {
		System.out.println("Listening User Pre Persist : " + ob.getName());
	}
```
# Relations

## Recap: relations in DB

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/ERD_Representation.svg/1200px-ERD_Representation.svg.png" style="width: 40%;float: right" />
<div>

* one-to-one - `1:1`
* many-to-one - `n:1`
* one-to-many - `1:n`
* many-to-many - `n:n`

</div>

## Recap: relations in OOP

<img src="https://i.stack.imgur.com/bfBSY.png" style="width: 40%;float: right" />
<div>

* **Association** - two classes know about each other, but they do not affect each others lifetime
* **Aggregation** - classes refers to each other but both can live independently
* **Composition** - class `B` is an integral part of class `A` (`A` can't logically exist without having a class `B` object)
</div>

## How they match?


## 1:1 - one to one

![](jpa-1to1.svg)

`@OneToOne`

## 1:1 - one to one - example

```
@Entity
class Person {
    @Id
    private Long id;
    
    @OneToOne
    private Head head;
}

@Entity
class Head {
    @Id
    private Long id;
}
``` 


## 1:1 - one to one - task

* <a href="ee-jpa.html#/zadanie-11" target="_blank">[Task 11]</a>


## n:1 - many to one 

`@ManyToOne`

## n:1 - many to one - example 

```
@Entity
class OrderEntry {
    @Id
    private Long id;
    
    @ManyToOne
    private Product product;
}

@Entity
class Product {
    @Id
    private Long id;
}
``` 


## n:1 - many to one - task

* <a href="ee-jpa.html#/zadanie-12" target="_blank">[Task 12]</a>


## 1:n - one to many

`@OneToMany`

## n:1 - one to many - example

```
@Entity
class InvoiceEntry {
    @Id
    private Long id;
    
    @ManyToOne
    private Invoice invoice;   <---- mapped by
}

@Entity
class Invoice {
    @Id
    private Long id;

    @OneToMany(mappedBy="invoice")
    List<InvoiceEntry> entries;
}
``` 

## n:1 - one to many - task

* <a href="ee-jpa.html#/zadanie-13" target="_blank">[Task 13]</a>

## n:n - many to many 

`@ManyToMany`

## n:n - many to many - example

```
@Entity
class Post {
    @Id
    private Long id;
    
    @ManyToOne
    private List<Tag> tags = new ArrayList<>();
}

@Entity
class Tag {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "tags")
    private List<Post> posts;
}
``` 
 
## n:n - many to many: Join table

```
@ManyToMany
@JoinTable(name = "post_tag",
    joinColumns = @JoinColumn(name = "post_id"),
    inverseJoinColumns = @JoinColumn(name = "tag_id")
)
```

## n:n - many to many - task

* <a href="ee-jpa.html#/zadanie-14" target="_blank">[Task 14]</a>


## Column names  

* `@Column` - for a field

* `@JoinColumn(name = "invoice_id")` - for relation 


## Cascades


* `ALL`
* `PERSIST`
* `MERGE`
* `REMOVE`
* `REFRESH`
* `DETACH`

```
@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
private List<Address> addresses;
```

## Lazy- vs Eager-Loading


# Querying: JPQL

## JPQL

```
Query query = entitymanager.createQuery( "Select e from Employee e" );

List<Employee> list=(List<Employee>)query.getResultList( );
```

```
Query query = entitymanager.createQuery( "Select e from Employee e where e.salary Between 30000 and 40000" );

List<Employee> list=(List<Employee>)query.getResultList( );
```

## JPQL - task

* <a href="ee-jpa.html#/zadanie-15" target="_blank">[Task 15]</a>


# Querying: criteria

## Criteria - basics


## Order

## Group

## Having

# Entity inheritance

## Entity inheritance types

* `SINGLE_TABLE`

* `JOINED`

* `TABLE_PER_CLASS`

## Entity inheritance: single table
<div style="font-size: 60%">

```
@Entity
@Inheritance
@DiscriminatorColumn(name="PROJ_TYPE")
@Table(name="PROJECT")
public  class Project implements serializable{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  ...
}

@Entity
@DiscriminatorValue("L")
public class LargeProject extends Project {
  private BigDecimal budget;
}

@Entity
@DiscriminatorValue("S")
public class SmallProject extends Project {
}
```

</div>

## Entity inheritance: joined

<div style="font-size: 60%">

```
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="PROJ_TYPE")
@Table(name="PROJECT")
public abstract class Project {
  @Id
  private long id;
  
  private String name;
  ...
}

@Entity
@DiscriminatorValue("L")
@Table(name="LARGEPROJECT")
public class LargeProject extends Project {
  private BigDecimal budget;
}

@Entity
@DiscriminatorValue("S")
@Table(name="SMALLPROJECT")
public class SmallProject extends Project {
}
```

</div>


## Entity inheritance: table per class


<div style="font-size: 60%">

```
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Project {
  @Id
  private long id;
  ...
}

@Entity
@Table(name="LARGEPROJECT")
public class LargeProject extends Project {
  private BigDecimal budget;
}

@Entity
@Table(name="SMALLPROJECT")
public class SmallProject extends Project {
}
```

</div>

# Transactions


# Cache

## Two levels of cache

## Cache level 1

## Cache level 2


# The end

<!-- 

Official: 

* https://javaee.github.io/tutorial/partpersist.html

* https://hibernate.org/orm/documentation/6.0/ , https://hibernate.org/orm/documentation/getting-started/

Another:

* https://www.vogella.com/tutorials/JavaPersistenceAPI/article.html

* https://www.journaldev.com/3793/hibernate-tutorial

* https://www.objectdb.com/api/java/jpa

* https://openjpa.apache.org/builds/1.2.3/apache-openjpa/docs/manual.html
*

--> 