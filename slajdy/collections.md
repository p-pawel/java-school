% The Collection Framework 
% Paweł Puślecki 




#  Intro

# Generic types

~ parameterized types

## Problem?
Example: Lion/Tiger container

## Generic classes

```
class Container<T> {
 private T tenant;

 public T getTenant() {
  return tenant;
 }

 public Container<T> setTenant(T tenant) {
  this.tenant = tenant;
  return this;
 }
}
```

## Generic interfaces

```
public interface Containable<T> {
  T gut();
  void put(T t);
}
```

## Generic methods

```
public static <T> T getThat(T t) {
  return t;
}
```
## Type erasure
<table><tr>
<td>

```
class Container<T> {
 private T tenant;

 public T getTenant() {
  return tenant;
 }

 public Container<T> setTenant(T tenant) {
  this.tenant = tenant;
  return this;
 }
}
```

</td>
<td>

```
class Container {
 private Object tenant;

 public Object getTenant() {
  return tenant;
 }

 public Container setTenant(Object tenant) {
  this.tenant = tenant;
  return this;
 }
}
```

</td>
</tr></table>

## Generics - Limitations 1/2 
* cannot instantiate with primitive types
```
Pair<int, char> p = new Pair<>(8, 'a');  // compile error
```
* cannot create instances of type parameters 
```
public static <E> void append(List<E> list) {
    E elem = new E();                    // compile error
}
```

* cannot cast or instanceof with parameterized types
```
x instanceof ArrayList<Integer> // compile-time error
x instanceof ArrayList          // OK
```


---

* cannot create arrays of parameterized types 
```
List<Integer>[] a = new List<Integer>[2];  // compile error
List<Integer>[] a = new List[2];           // OK
```

* cannot create, catch, or throw generic exceptions
```
class MyException<T> extends Throwable {   // compile error
```

* can't overload with params erased to same type
```
public void print(Set<String> strSet) { }   // compile error
public void print(Set<Integer> intSet) { }
```

* cannot declare static fields of parameterized type
```
class MyClass<T> {static T staticField;}    // compile error
```

<a href="https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html" target="_blank">[reference]</a>


## Recap: autoboxing/unboxing


|     |     |
| --- | --- |
| `boolean` | `Boolean` |
| `char` | `Character` |
| `byte` | `Byte` |
| `short` | `Short` |
| `integer` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |

## Diamond operator
Type Inference for Generic Instance Creation

```
// before Java 7:

Container<Lion> container = new Container<Lion>(); 
                                           

// OK from Java 7:

Container<Lion> container = new Container<>();       


// unchecked conversion warning:

Container<Lion> container = new Container();          
```

<a href="https://docs.oracle.com/javase/7/docs/technotes/guides/language/type-inference-generic-instance-creation.html" target="_blank">[reference]</a>

# One array-type to rule them all?
Nope. Arrays are not enough...

## Recap: Arrays


```
		int[] myArray1 = {1, 2, 3, 4, 5};
		int x = myArray1[0];

		String[] myArray2 = new String[2];
		myArray2[0] = "Hello";
		myArray2[1] = "Hi";
```


* fixed-size collections
* special syntax for declare, initialize and element access
* can store primitive and object values
* length property


## Recap: Arrays
### Warm up 

```
public class Exercise1 {

    ...

}
```
<a href="collections-exercises.html#/zadanie-1" target="_blank">[Task 1]</a>
```
Number 1 is 20
```


## Arrays challenges

Fixed size, so:

* cannot append new elements
<a href="https://stackoverflow.com/questions/2843366/how-to-add-new-elements-to-an-array" target="_blank">[more]</a>
 
* cannot remove array elements 
* cannot easy concatenate arrays
 <a href="https://stackoverflow.com/questions/80476/how-can-i-concatenate-two-arrays-in-java" target="_blank">[more]</a>



## Array vs ArrayList
<div style="font-size: 60%">
|       | array | ArrayList |
| ------ | ------ | -------|
| create | `new String[4];` | `new ArrayList<String>` |
| read | `String x = myArray[2]` | `String x = myArrayList.get(2)` |
| set | `myArray[2] = "Hello"` | `myArrayList.set(2, "Hello")` |
| append | - | `myArrayList.put("Hi")` |
| length | `myArray.length` | `myArrayList.size()` |
</div>

## Array vs ArrayList
<a href="collections-exercises.html#/zadanie-2" target="_blank">[Task 2]</a>


# The Collection Framework


## 
<img src="https://upload.wikimedia.org/wikipedia/commons/a/ab/Java.util.Collection_hierarchy.svg" width="48%" />
<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Java.util.Map_hierarchy.svg/1280px-Java.util.Map_hierarchy.svg.png" width="48%" />


# interface List
An ordered collection (also known as a sequence).





## class ArrayList
* object that contains other objects 
* cannot contain primitives
* preferred when more random read is expected than add/remove  


## ArrayList - example

<a href="collections-exercises.html#/zadanie-3" target="_blank">[Task 3]</a>


## class LinkedList


<a href="https://dzone.com/articles/arraylist-vs-linkedlist-vs" target="_blank">[more]</a>


## LinkedList - example

<a href="collections-exercises.html#/zadanie-4" target="_blank">[Task 4]</a>





# interface Set
A collection that contains no duplicate elements.

```
set.add(element)

set.addAll(elements)

set.size()

set.remove(element)

set.contains(element)
```

## class HashSet<>

* This class implements the Set interface, backed by a hash table.
* It makes no guarantees as to the iteration order of the set; 
* in particular, it does not guarantee that the order will remain constant over time. 
* This class permits the null element.

<a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html" target="_blank">[reference]</a>

## Recap: equals & hashCode contract

## HashSet - example

<a href="collections-exercises.html#/zadanie-4" target="_blank">[Task 4]</a>


## class LinkedHashSet

Defines the iteration ordering, which is the order in which elements were inserted into the set (insertion-order).

<a href="https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashSet.html" target="_blank">[reference]</a>

## LinkedHashSet - example

<a href="collections-exercises.html#/zadanie-5" target="_blank">[Task 5]</a>


## TreeSet
The elements are ordered using their natural ordering, or by a Comparator provided at set creation time, depending on which constructor is used.


## TreeSet - example

<a href="collections-exercises.html#/zadanie-6" target="_blank">[Task 6]</a>

# Comparable, Comparator

## interface Comparable

```
public interface Comparable<T> {
  public int compareTo(T o);
}
```

## Comparator

```
public interface Comparator<T> {
  int compare(T o1, T o2);
}
```

## Comparator - task

<a href="collections-exercises.html#/zadanie-7" target="_blank">[Task 7]</a>

# interface Map

* An object that maps keys to values.
* In another languages known as "dictionary" type

```
map.put(key, value)

value = map.get(key)

map.putIfAbsent(key, value);

map.getOrDefault(key, defaultValue);
```

## HashMap


* Hash table based implementation of the Map interface. 
* This implementation provides all of the optional map operations, and permits null values and the null key.
* makes no guarantees as to the order of the map 
* it does not guarantee that the order will remain constant over time 

## HashMap - example

<a href="collections-exercises.html#/zadanie-8" target="_blank">[Task 8]</a>

## LinkedHashMap

Map with predictable iteration order, which is normally the order in which keys were inserted into the map (insertion-order). 

<a href="https://docs.oracle.com/javase/8/docs/api/java/util/LinkedHashMap.html" target="_blank">[reference]</a>

## HashMap - example

<a href="collections-exercises.html#/zadanie-9" target="_blank">[Task 9]</a>

## TreeMap

The map is sorted according to the natural ordering of its keys, or by a `Comparator` provided at map creation time, depending on which constructor is used. 

<a href="https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html" target="_blank">[reference]</a>


## HashMap - example

<a href="collections-exercises.html#/zadanie-10" target="_blank">[Task 10]</a>


# Tasks

* <a href="collections-exercises.html#/zadanie-11" target="_blank">[Task 11]</a>
 <a href="collections-exercises.html#/zadanie-12" target="_blank">[Task 12]</a>
* <a href="collections-exercises.html#/zadanie-13" target="_blank">[Task 13]</a>
<a href="collections-exercises.html#/zadanie-14" target="_blank">[Task 14]</a>
<a href="collections-exercises.html#/zadanie-15" target="_blank">[Task 15]</a>

* <a href="collections-exercises.html#/zadanie-16" target="_blank">[Task 16]</a>
<a href="collections-exercises.html#/zadanie-17" target="_blank">[Task 17]</a>
<a href="collections-exercises.html#/zadanie-18" target="_blank">[Task 18]</a>

# others

## interface Queue
A collection designed for holding elements prior to processing.

* insert: `offer(e)`
* remove: `poll()`
* examine: `peek()`

<!-- ![](https://images.pexels.com/photos/761295/pexels-photo-761295.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260) -->


## interface Deque
A linear collection that supports element insertion and removal at both ends.

* insert: `offerFirst(e)`, `offerLast(e)`
* remove: `pollFirst()`, `pollLast()`  
* examine: `peekFirst()`, `peekLast()` 

     
## ~~Vector~~

* in Java since 1.0
* considered obsolete (however not deprecated)
* slow - synchronized on every get/set operation
* mixture of concerns: 
* for thread-safe list use decorator `Collections.synchronizedCollection(myList)` 

[1](https://stackoverflow.com/questions/1386275/why-is-java-vector-and-stack-class-considered-obsolete-or-deprecated)
[2](https://javaconceptoftheday.com/not-use-vector-class-code/)

## ~~Stack~~
* `class Stack<E> extends Vector<E>`
* use Queue or Deque instead

[](https://keithwilliamstechblog.wordpress.com/2016/02/13/why-the-java-stack-class-is-bad/)

# Stream API

## Stream operations
 
<img src="stream-operations.svg" alt="" style="border: none; background: none;"/>


## Stream: source

```
Stream.empty();

Stream.of(1);

Stream.of(1, 2, 3);

collection.stream();
```

## Stream: intermediate operation
```
filter()

distinct()

limit(), skip()

map()

flatMap()

sorted()

peek()

boxed()

```

## Stream: terminal operation
```
count()

min(), max()

findAny(), findFirst()

allMatch(), anyMatch(), noneMatch()

foreach()

reduce()

collect()

```

## Stream example



```
List<Integer> list = IntStream.range(1, 31)
    .filter(i -> i % 3 == 0)
    .map(e -> e % 7)
    .boxed()
    .collect(Collectors.toList());
```

## Stream tasks

Resolve these tasks with Stream API:


* <a href="collections-exercises.html#/zadanie-2" target="_blank">[Task 2]</a>
<a href="collections-exercises.html#/zadanie-3" target="_blank">[Task 3]</a>

* <a href="collections-exercises.html#/zadanie-4" target="_blank">[Task 4]</a>
<a href="collections-exercises.html#/zadanie-5" target="_blank">[Task 5]</a>
<a href="collections-exercises.html#/zadanie-6" target="_blank">[Task 6]</a>

* <a href="collections-exercises.html#/zadanie-8" target="_blank">[Task 8]</a>
<a href="collections-exercises.html#/zadanie-9" target="_blank">[Task 9]</a>
<a href="collections-exercises.html#/zadanie-10" target="_blank">[Task 10]</a>

* <a href="collections-exercises.html#/zadanie-11" target="_blank">[Task 11]</a>
 <a href="collections-exercises.html#/zadanie-12" target="_blank">[Task 12]</a>
* <a href="collections-exercises.html#/zadanie-13" target="_blank">[Task 13]</a>
<a href="collections-exercises.html#/zadanie-14" target="_blank">[Task 14]</a>
<a href="collections-exercises.html#/zadanie-15" target="_blank">[Task 15]</a>

* <a href="collections-exercises.html#/zadanie-16" target="_blank">[Task 16]</a>
<a href="collections-exercises.html#/zadanie-17" target="_blank">[Task 17]</a>
<a href="collections-exercises.html#/zadanie-18" target="_blank">[Task 18]</a>




# THE END


<style>
.reveal code {
    font-family: monospace;
    text-transform: none;
    /* font-weight: 700; */
    /* border: solid 1px #888; */
    background: #333;
    color: #ffff80;
}

section.level2 {
text-align:left;
}
section.level2 h2{
text-align:center;
}
</style>

<script>
    var Reveal;
    (function() {
        setTimeout(function () {
            Reveal.configure({ slideNumber: true });    
        }, 1000);
    })();
</script>
<style>
    a[target=_blank]::after {
        display: inline-block;
        font-style: normal;
        font-variant: normal;
        text-rendering: auto;
        -webkit-font-smoothing: antialiased;

        margin-left: 0.3em;
        font-family: "Font Awesome 5 Free"; font-weight: 900; content: "\f35d";
    }
</style>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css" />

<script async src="https://www.googletagmanager.com/gtag/js?id=UA-41987357-2"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());
  gtag('config', 'UA-41987357-2');
</script>