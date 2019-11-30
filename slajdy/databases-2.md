% Databases - ⅔

# Intro

## SQL


<!--
https://opensource.com/article/18/2/getting-started-sql


https://learntocodewith.me/posts/sql-guide/





-->

* SQL - Structured Query Language

* 1970s: SEQUEL (Structured English Query Language)
 
## Database sub-languages

Database sub-languages are special-purpose languages, which allow one or more of the following tasks, sometimes distinguished as sublanguages:

* **Data definition language (DDL)** – defines data types such as creating, altering, or dropping tables and the relationships among them;
* **Data manipulation language (DML)** – performs tasks such as inserting, updating, or deleting data occurrences;
* **Data query language (DQL)** – allows searching for information and computing derived information.


##

* **Transaction Query Language (TQL)** - Transaction control statement are use to apply the changes permanently save into database.
* **Data control language (DCL)** – Data control statements are use to give privileges to access limited data or share the information between users
* **Session Control Language (SCL)** - Session control statement are manage properties dynamically of a user session.


<a href="https://www.interviewsansar.com/2018/11/16/sql-sub-languages/" target="_top">[more info]</a>

## Query types

* execute/update

* procedures

* view

## Popular engines



<a href="https://db-engines.com/en/ranking" target="_blank"></a>

<hr/>

<a href="https://www.oracle.com/database/technologies/xe-downloads.html" >
<img src="https://upload.wikimedia.org/wikipedia/commons/5/50/Oracle_logo.svg" style="height:1em; vertical-align: middle; margin: 0;" /> 
</a>
<a href="https://dev.mysql.com/downloads/mysql/">
<img src="https://upload.wikimedia.org/wikipedia/en/6/62/MySQL.svg" style="width:200px; vertical-align: bottom; margin: 0 1em;" />
</a>
<a href="https://www.microsoft.com/en-us/sql-server/sql-server-downloads">
<img src="https://upload.wikimedia.org/wikipedia/commons/9/96/Microsoft_logo_%282012%29.svg" style="width:200px; vertical-align: bottom; margin: 0 1em;" /> 
</a>

<a href="https://www.postgresql.org/download/">
<img src="https://upload.wikimedia.org/wikipedia/commons/2/29/Postgresql_elephant.svg" style="height:3em; vertical-align: bottom; margin: 0 1em;" />
</a>
<a href=""> 
<img src="https://upload.wikimedia.org/wikipedia/commons/3/38/SQLite370.svg" style="width:200px; vertical-align: bottom; margin: 0 1em;" />
</a>
<a href="https://downloads.mariadb.org/">
<img src="https://upload.wikimedia.org/wikipedia/commons/c/c9/MariaDB_Logo.png" style="width:200px; vertical-align: bottom; margin: 0 1em;" /> 
</a>

<hr/>
Light embedded engines:
<a href="https://mvnrepository.com/artifact/org.hsqldb/hsqldb">
<img src="http://hsqldb.org/images/hypersql_logo.png" style="width:200px; vertical-align: bottom; margin: 0 1em;" />
</a>
<a href="https://mvnrepository.com/artifact/com.h2database/h2">
<img src="https://upload.wikimedia.org/wikipedia/commons/a/a1/H2_logo.png" style="height: 1em; vertical-align: bottom; margin: 0 1em;" />
</a>

## Database engines - task 

* <a href="databases-2-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>

# Data definition language (DDL)

## Create new database schema

```
CREATE DATABASE database_name;
```
 
```
CREATE SCHEMA schema_name;
```

<!-- 
* https://launchbylunch.com/posts/2014/Feb/16/sql-naming-conventions/
* https://stackoverflow.com/questions/7662/database-table-and-column-naming-conventions
-->


## Create new table


Simplified statement:

```	
CREATE TABLE table_name(
    field1 FIELD_TYPE,
    field2 FIELD_TYPE,
    ...
);
```

E.g.
```	
CREATE TABLE animal (
    id BIGINT,
    name TEXT
);
```


## Data types

Data types are specific to database engines.

* numeric types: `smallint`, `integer`, `bigint`, `decimal`, `numeric`, `real`, `double precision`, `smallserial`, `serial`, `bigserial` 
<a href="https://www.postgresql.org/docs/current/datatype.html" target="_blank"></a>, monetary type: `money`
<a href="https://www.postgresql.org/docs/current/datatype-money.html" target="_blank"></a>
* character type: `character varying(n), varchar(n)`, `character(n), char(n)`, `text`
<a href="https://www.postgresql.org/docs/current/datatype-character.html" target="_blank"></a>
* binary data type: `bytea`
<a href="https://www.postgresql.org/docs/current/datatype-binary.html" target="_blank"></a>
* date-time types: `timestamp`, `date`, `time`, `interval` 
<a href="https://www.postgresql.org/docs/current/datatype-datetime.html" target="_blank"></a>

* enumerated, geometric, network address, bit string, text search, UUID, XML, JSON, array, range, domain... 

## Deleting table

```
DROP TABLE table_name;
```
```
DROP TABLE IF EXISTS table_name;
```

## Deleting database

<a href="https://www.youtube.com/watch?v=1aEqd4bl6Bs">
![](https://i.ytimg.com/vi/1aEqd4bl6Bs/hqdefault.jpg?sqp=-oaymwEZCPYBEIoBSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLCnsdSIpSNjaKvGTMg61OylWZMeMQ)
</a>

## Creating structures - task

* <a href="databases-2-tasks.html#/zadanie-2" target="_blank">[Task 2]</a>

## Modifying table structure

`ALTER TABLE table_name actions...`

Sample actions:

```
ALTER TABLE table_name
  RENAME TO new_table_name;
```

```
ALTER TABLE table_name
  ADD new_column1 column_definition,
  ADD new_column2 column_definition,
```

```
ALTER TABLE table_name
  ALTER COLUMN column_name TYPE column_definition;
```

```
ALTER TABLE table_name
  RENAME COLUMN old_name TO new_name;
```

## Modifying table structure - task


* <a href="databases-2-tasks.html#/zadanie-3" target="_blank">[Task 3]</a>




# Data Manipulation Language (DML)


## Modifications of data

* insert
* update
* delete

## Insert

`INSERT` -- create new rows in a table 

Simplified query:
```
INSERT INTO table_name (..., ...) VALUES ( ..., ... )
```

## Insert - example

Insert single full row:
```
INSERT INTO films VALUES
    ('UA502', 'Bananas', 105, '1971-07-13', 'Comedy', '82 minutes');
```


Insert selected fields (another are default if set):
```
INSERT INTO films (code, title, did, date_prod, kind)
    VALUES ('T_601', 'Yojimbo', 106, '1961-06-16', 'Drama');
```

Insert multiple rows:
```
INSERT INTO films (code, title, did, date_prod, kind) VALUES
    ('B6717', 'Tampopo', 110, '1985-02-10', 'Comedy'),
    ('HG120', 'The Dinner Game', 140, DEFAULT, 'Comedy');
```

And <a href="https://www.postgresql.org/docs/9.2/sql-insert.html" target="_blank">more</a>.

## Update

`UPDATE` -- update rows of a table

Simplified query:
```
UPDATE table_name
    SET column_name = expression,
    SET column_name = expression
```
 
## Update - example

```
UPDATE films SET kind = 'Dramatic' WHERE kind = 'Drama';
```

## Delete

`DELETE` -- delete rows of a table

```
DELETE FROM table_name
    WHERE condition
```

## Delete - example


Delete all films but musicals:
```
DELETE FROM films WHERE kind <> 'Musical';
````

Clear the table films:

```
DELETE FROM films;
```

## Auto increment column
```	
CREATE TABLE table_name(
    id SERIAL
);
```

## Auto increment column - task 

* <a href="databases-2-tasks.html#/zadanie-7" target="_blank">[Task 7]</a>
* <a href="databases-2-tasks.html#/zadanie-2" target="_blank">[Task 2]</a> - auto increment


# DQL

## Select all
```
SELECT * FROM table_name;
```

## Select all - task
* <a href="databases-2-tasks.html#/zadanie-8.1" target="_blank">[Task 8.1]</a>

## Select columns
```
SELECT id, name FROM table_name;
```

## Select columns - task
* <a href="databases-2-tasks.html#/zadanie-8.2" target="_blank">[Task 8.2]</a>


## Aliases
```
SELECT id, name AS full_name FROM table_name;
```

## Select count

```
SELECT COUNT(*) FROM table_name;
```

```
SELECT COUNT(name) FROM table_name;
```

## Select count - task
* <a href="databases-2-tasks.html#/zadanie-8.3" target="_blank">[Task 8.3]</a>


# Subquery `Where`
 
## Where equal

```
SELECT * FROM table_name WHERE id = 1;
```


## Where equal - task
* <a href="databases-2-tasks.html#/zadanie-8.4" target="_blank">[Task 8.4]</a>

## Where operators

```
SELECT * FROM table_name WHERE id > 3 AND name LIKE 'Adam%';
```

## Where operators - task
* <a href="databases-2-tasks.html#/zadanie-8.5" target="_blank">[Task 8.5]</a>


## Null values

```
SELECT * FROM table_name WHERE column IS NULL;
```
```
SELECT * FROM table_name WHERE column IS NOT NULL;
```

## Null values - task

* <a href="databases-2-tasks.html#/zadanie-8.6" target="_blank">[Task 8.6]</a>


## Like

* Percent `%`  for matching any sequence of characters.
* Underscore `_`  for matching any single character.

## Like - task

* <a href="databases-2-tasks.html#/zadanie-8.7" target="_blank">[Task 8.7]</a>


## Ordering

Simplified query:
```
SELECT * FROM table_name
WHERE conditions
ORDER BY expression [ ASC | DESC ]
```

## Ordering - task
* <a href="databases-2-tasks.html#/zadanie-8.8" target="_blank">[Task 8.8]</a>


## Distinct

```
SELECT DISTINCT column1, column2 FROM table_name; 
```


# Grouping results

## Grouping
```
SELECT * FROM table_name
GROUP BY expression
```


## Grouping - task
* <a href="databases-2-tasks.html#/zadanie-8.9" target="_blank">[Task 8.9]</a>


## Aggregate functions

Functions: `MIN`, `MAX`, `AVG`...

## Grouping - task
* <a href="databases-2-tasks.html#/zadanie-8.10" target="_blank">[Task 8.10]</a>


## Having

```
SELECT * FROM table_name
GROUP BY expression
HAVING condition
```

## Having - task
* <a href="databases-2-tasks.html#/zadanie-8.11" target="_blank">[Task 8.11]</a>



# Constraints

## Foreign key

```
CREATE TABLE table_name
  ...
  some_column REFERENCES another_table(id)
  ...
```

## Foreign keys - task

* <a href="databases-2-tasks.html#/zadanie-9" target="_blank">[Task 9]</a>

## Indexes

```
CREATE INDEX idx_name 
ON table_name(field_name);
```

# Joining tables

## Join

* Inner
* Outer
  * Left
  * Right
  * Full

## Inner
![](https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/SQL_Join_-_07_A_Inner_Join_B.svg/330px-SQL_Join_-_07_A_Inner_Join_B.svg.png)
```
SELECT * FROM table_A
INNER JOIN table_B ON table_B.parent_id = table_A.id
```
## Inner join - task
* <a href="databases-2-tasks.html#/zadanie-10.1" target="_blank">[Task 10.1]</a>

## Left Outer Join

![](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f6/SQL_Join_-_01_A_Left_Join_B.svg/330px-SQL_Join_-_01_A_Left_Join_B.svg.png)
```
SELECT * FROM table_A
LEFT JOIN table_B ON table_B.parent_id = table_A.id
```
## Left outer join - task
* <a href="databases-2-tasks.html#/zadanie-10.2" target="_blank">[Task 10.2]</a>

## Right Outer Join

![](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5f/SQL_Join_-_03_A_Right_Join_B.svg/330px-SQL_Join_-_03_A_Right_Join_B.svg.png)
```
SELECT * FROM table_A
RIGHT JOIN table_B ON table_B.parent_id = table_A.id
```

## Left outer join - task
* <a href="databases-2-tasks.html#/zadanie-10.3" target="_blank">[Task 10.3]</a>


## Full Outer Join

![](https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/SQL_Join_-_05b_A_Full_Join_B.svg/330px-SQL_Join_-_05b_A_Full_Join_B.svg.png)
```
SELECT * FROM table_A
FULL JOIN table_B ON table_B.parent_id = table_A.id
```

## Joining best practices

* nested joining may be expensive (but on other hand, databases are well suited to do it efficiently)
* indexing columns may speeds up the joining
<!--* `NULL` -->


# Others

## Transactions

```
BEGIN;

COMMIT;
```

## Data dump
[https://stackoverflow.com/questions/14486241/how-can-i-export-the-schema-of-a-database-in-postgresql](https://stackoverflow.com/questions/14486241/how-can-i-export-the-schema-of-a-database-in-postgresql)

# To be continued