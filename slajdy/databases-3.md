% Databases - JDBC

# Connecting to database

## Connection URL


_protocol_ `:` _product-name_ `:` _connection-details (DB specific)_

E.g.
```
jdbc:postgresql://localhost:5432/my-database
jdbc:postgresql://localhost:5432/my-database?currentSchema=my-schema
```

```
jdbc:h2:~/temp-database;IGNORECASE=TRUE;MODE=MYSQL;DATABASE_TO_UPPER=false
```

```
jdbc:mysql://localhost:3306/my-database?useUnicode=yes&characterEncoding=UTF-8
```


## Creating connection

```
import java.sql.*;


Connection c = DriverManager.getConnection("jdbc:derby:db");
```

## Connection properties

```
String url = "...";

Properties props = new Properties();
props.setProperty("user","user-name");
props.setProperty("password","secret");

Connection c = DriverManager.getConnection(url, props);
```
## Connecting - Task

* <a href="databases-3-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>


# Querying

## Executing statements

* Update statements
```
Statement statement = conn.createStatement();
int result = statement.executeUpdate("delete * from log");
```

* Query statements

```
ResultSet resultSet = statement.executeQuery("select * from product");
```

## Execute statements - task 

* <a href="databases-3-tasks.html#/zadanie-2" target="_blank">[Task 2]</a>


## Prepared statements

SQL-injection vulnerable:
```
Statement statement = conn.createStatement();
String sql = "delete * product where name = '" + name + "'";
System.out.println(sql);
statement.executeUpdate(sql);
```

With prepared statement:
```
PreparedStatement statement = conn.prepareStatement("delete from product where name = ?");
statement.setString(1, name);
statement.execute();
```

## Prepared statements - task

* <a href="databases-3-tasks.html#/zadanie-3" target="_blank">[Task 3]</a>


## Reading ResultSet

* `ResultSet.get...(int)` - by index (from 1)
* `ResultSet.get...(String)` - by name 

E.g.
```
while (resultSet.next()) {
    int id = resultSet.getInt("id");
    String name = resultSet.getString(2);
    
    System.out.println(id + " " + name);
}
```

## Reading primitives, String, Object

* `boolean getBoolean(...)`
* `int getInt(...)`
* `long getLong(...)`
* `float getFloat(...)`
* `double getDouble(...)`
* `String getString(...)`
* `String getObject(...)`

## Null treatment

Note: `getInt` for `NULL` values returns `0`
 
```
int nValue = rs.getInt(strColName);
return rs.wasNull() ? null : nValue;
```

## Reading - task


* <a href="databases-3-tasks.html#/zadanie-4" target="_blank">[Task 4]</a>


## Reading dates

* `java.sql.Time getTime(...)`
* `java.sql.Time getTimeStamp(...)`
* `java.sql.Time getDate(...)`

Then:

* `LocalTime localTime = sqlTime.toLocalTime();`
* `LocalDateTime localTime = sqlTime.toLocalDateTime();`

## Reading dates - task


* <a href="databases-3-tasks.html#/zadanie-5" target="_blank">[Task 5]</a>


## Result Set cursor

* `connection.createStatement();`
* `connection.createStatement(int type, int concurrency);`
* `connection.createStatement(int type, int concurrency, int holdability);`

E.g.
```
conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
```

---

* `resulsSet.next()`
* `resulsSet.previous()`
* `resulsSet.beforeFirst()`
* `resulsSet.afterLast()`

# Final

## Closing connection

* try-with-resources
```
try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres")) {
   ...
}
```

* closing a resource cause close of any resources it created, e.g. `Connection` -> `Statement` -> `ResultSet`

## Exceptions

A checked `SQLException` can be thrown by JDBC-methods. The exception provides few useful methods:

* `getMessage()` - returns a human-readable message as to what went wrong
* `getSQLState()` - returns a code as to what went wrong
* `getErrorCode()` - retrieves the vendor-specific exception code
* `getNextException()` - retrieves the exception chained to this exception

## Exceptions - task

* <a href="databases-3-tasks.html#/zadanie-6" target="_blank">[Task 6]</a>


# The End

* <a href="databases-3-tasks.html#/zadanie-7" target="_blank">[Task 7]</a>
