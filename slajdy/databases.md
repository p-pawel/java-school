% Databases

# Intro


## What database is for?




## Importance of database systems

Databases are the heart of every information system.




## Benefits

* Better Data Access Within the Company

* Stronger Relationships Between Data

* Improved Data Security


## Task: Database ideas 

Let's gather couple database ideas.




# Elements of Relationship Model

## Relational Database

![](https://upload.wikimedia.org/wikipedia/commons/8/8d/Relational_model_concepts.png)

##

This model organizes data into one or more **tables** (or "relations") of columns and rows, 
with a unique key identifying each row. 

* Rows are also called **records** (or tuples)
* Columns are also called **attributes**

* Each table represents one **entity type** (e.g as "customer" or "product"). 
* The rows represent instances of that type of entity (such as "Lee" or "chair").
* The columns representing values attributed to that instance (e.g. "address" or "price"). 

---

<i class="fas fa-car" style="color:blue"></i>


## Database 

## Table

## Entity

## Columns types

* Numeric
* Date and Time
* Character and String
* Unicode Character and String
* Binary
* Miscellaneous


## Constraints

* Primary Key (PK)
* Unique
* Nullable
* Index
* Foreign Key (FK)

## Primary Key (PK)

A specific choice of a minimal set of attributes (columns) that uniquely specify a tuple (row)
 in a relation (table).
 
 Informally, a primary key is "which attributes identify a record", and in simple cases are simply a single attribute: a unique id. 

## Unique

The UNIQUE constraint ensures that all values in a column are different.

Both the UNIQUE and PRIMARY KEY constraints provide a guarantee for uniqueness for a column or set of columns.

A PRIMARY KEY constraint automatically has a UNIQUE constraint.

However, you can have many UNIQUE constraints per table, but only one PRIMARY KEY constraint per table.

## Nullable / Not Null

The NOT NULL constraint enforces a column to NOT accept NULL values.

This enforces a field to always contain a value, which means that you cannot insert a new record, or update a record without adding a value to this field.

## Index

The CREATE INDEX statement is used to create indexes in tables.

Indexes are used to retrieve data from the database more quickly than otherwise. The users cannot see the indexes, they are just used to speed up searches/queries.


## Foreign Key



A FOREIGN KEY is a key used to link two tables together.

A FOREIGN KEY is a field (or collection of fields) in one table that refers to the PRIMARY KEY in another table.

The table containing the foreign key is called the child table, and the table containing the candidate key is called the referenced or parent table.


 
## Database design - task

Let's design one database. 



<!--
# Database modeling

## ERD

## Entity

## Attribute etr...?


## Relations


## ERD - zad
-->

# Database Normalization

## Normal forms

Database normalization is the process of structuring a relational database in accordance with a series of so-called
 "normal forms" in order to reduce data redundancy and improve data integrity. 

## 1NF - First Normal Form

A relation is in first normal form if and only if the domain of each attribute contains only atomic (indivisible) values, and the value of each attribute contains only a single value from that domain
 
## 2NF - Second Normal Form

A relation is in the second normal form if it fulfills the following two requirements:

* It is in first normal form.
* It does not have any non-prime attribute that is functionally dependent on any proper subset of any candidate key of the relation. A non-prime attribute of a relation is an attribute that is not a part of any candidate key of the relation.
    
## 3NF - Third Normal Form

Third normal form (3NF) is a normal form that is used in normalizing a database design to reduce the duplication of data and ensure referential integrity by ensuring that:

* The entity is in second normal form.
* No non-prime (non-key) attribute is transitively dependent on any key i.e. no non-prime attribute depends on other non-prime attributes. All the non-prime attributes must depend only on the candidate keys.


## More normal forms

[https://en.wikipedia.org/wiki/Database_normalization#Normal_forms](https://en.wikipedia.org/wiki/Database_normalization#Normal_forms)

# Transactions

## Transaction

A transaction symbolizes a unit of work performed within a database management system
  against a database, 
  and treated in a coherent and reliable way independent of other transactions. 
  
  A transaction generally represents any change in a database. 

1. **Begin** the transaction.
2. Execute a set of data manipulations and/or queries.
3. If no errors: **commit** the transaction and end it.
4. If errors occur: **roll back** the transaction and end it. 

## ACID

* Atomicity
* Consistency
* Isolation
* Durability


## Isolation levels

* Serializable
* Repeatable reads
* Read committed
* Read uncommitted - "dirty reads" are allowed

# Relations

## Visualisations

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/ERD_Representation.svg/1200px-ERD_Representation.svg.png" style="width: 40%" />

## Crow's Foot (James Martin) Notation

![](https://i.stack.imgur.com/rb3Ig.jpg)

## Min-Max notation

![](https://image.slidesharecdn.com/erdexamples-111122070102-phpapp02/95/erd-examples-1-728.jpg?cb=1321945740)


## One-to-one
<!-- https://it.toolbox.com/blogs/craigborysowich/understanding-relationships-in-e-r-diagrams-020607 -->

![](https://farm1.static.flickr.com/131/381402223_c7cfa9ed5a.jpg)

## One-to-many

![](https://farm1.static.flickr.com/123/381402225_cc6b7b02b5.jpg?v=0)

## Many-to-many

![](https://farm1.static.flickr.com/148/381402227_8df41aef25.jpg?v=0)

## Relationships - task

Let's adjust our designs to handle relationships.


<!--
------

# view


-- - - -

https://en.wikipedia.org/wiki/Relational_model

https://en.wikipedia.org/wiki/Unnormalized_form
https://en.wikipedia.org/wiki/Database_normalization



https://www.sqlpedia.pl/projektowanie-i-normalizacja-bazy-danych/

-->

# Another types of databases

## NoSQL

* Object-oriented
* Document-oriented 
* Graph 


## Document databases

* MongoDB
* some aspects of PostreSQL
* Solr / Lucene

<a href="https://en.wikipedia.org/wiki/Document-oriented_database" target="_blank">more</a>


## Graph database

![](https://upload.wikimedia.org/wikipedia/commons/3/3a/GraphDatabase_PropertyGraph.png)

E.g. <quote>Neo4j


# To be continued

# JDBC

