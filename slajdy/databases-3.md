% Databases - JDBC

# Connecting to database

## Connection URL


_protocol_ `:` _product-name_ `:` _connection-details (DB specific)_

E.g.
```
jdbc:postgresql://localhost:5432/my-schema
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

Utwórz projekt typu Maven, dodaj zależność do sterownika do bazy danych Postgres na podstawie danych [stąd](https://mvnrepository.com/artifact/org.postgresql/postgresql) 

W programie utwórz obiekt typu `java.sql.Connection`, który połączy się z Twoją lokalną bazą danych PostgreSQL. 

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

## Reading dates

* `java.sql.Time getTime(...)`
* `java.sql.Time getTimeStamp(...)`
* `java.sql.Time getDate(...)`

Then:
* `LocalTime localTime = sqlTime.toLocalTime();`
* `LocalDateTime localTime = sqlTime.toLocalDateTime();`


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

```
try (Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres")) {

   ...

}

```

## Exceptions