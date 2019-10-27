% Inheritance 


# Inheritance in Java

## Single inheritance

(diamond problem)

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Diamond_inheritance.svg/682px-Diamond_inheritance.svg.png" style="width: 30%"/>

## How to inherit? 

By extending a class:

```
public class Elephant {
...
}

public class AfricanElephant extends Elephant {
...
}

public class IndianElephant extends Elephant {
...
}

```

## Class Access Modifiers

* `public    `
* <code> &nbsp; &nbsp; &nbsp; </code> (package-default)
* `private` - only to inner classes,
* `protected` - only to inner classes,


## The Object

* In Java, all classes inherit from a single class, `java.lang.Object`.

* `java.lang.Object` is the only class that doesn’t have any parent classes.


<table style="width: 100%">
<tr>
<td>

```
class Whatever {
}
```

</td>
<td>

```
class Whatever extends Object {
}
```

</td>
</tr></table>

# Constructors in inherited classes


## Recap: constructors

Each class needs a constructor, if none declared a default no-argument constructor is added.  

<table style="width: 100%">
<tr>
<td>

```
class Whatever {



}
```

</td>
<td>

```
class Whatever {
   public Whatever() {

   }
}
```

</td>
</tr></table>

## Constructor in extended class 

First statement in constructor:

* `this()` - calls another constructor in the class
* `super()` - calls constructor of direct parent class


```
public class Elephant {
  private int weight;
  public Elephant(int weight) {
    super();
    this.weight = weight;
  }
}

public class AfricanElephant extends Elephant {
  public AfricanElephant(int weight) {
    super(weight);
  }
  public AfricanElephant() {
    this(4000);
  }
}
```


## Compilation Enhancements


<table style="width: 100%">
<tr>
<td>

```
class Whatever {



}
```

</td>
<td>

```
class Whatever {
   public Whatever() {

   }
}
```

</td>
<td>

```
class Whatever {
   public Whatever() {
      super();
   }
}
```

</td>
</tr></table>



## Constructor Definition Rules


---

Either `this()` or  `super()` is the first statement of every constructor.

---

* `super()` is added during compilation as the first statement of the constructor - if none `super()` is declared.
* `this()` is never called automatically, it needs to be called explicitly  


---

Neither `super()` nor `this()` cannot be used after the first statement of the constructor.

_Example_

```
class Whatever {
    public Whatever() {
        System.out.println("hello"); 
        super();                          // compile error
    }

	public Whatever(int i) {
		System.out.println("hello param");
		this();                           // compile error
	}
}
```


---

Parent with only parameterized constructors + child with no constructors => compilation error.

_Example_

---


Parent with only parameterized constructors => each child constructor must call parent constructor explicitly. 
 
_Example_


## Calling Constructors

The parent constructor executes before the child constructor.


```
public class Elephant {
  public Elephant() {
    System.out.println("Elephant");
  }
}
public class AfricanElephant {
  public AfricanElephant() {
    System.out.println("AfricanElephant");
  }
}
```

What would be the output when `new AfricanElephant()` is called?

# Using Inherited Methods and Fields

## Using Inherited Methods and Fields

`this.`

`super.`


## `super()` and `super`

```
public AfricanElephant(int weight) {
  super();
  super.setWeight(4000);
}
```


## Method Overriding

```
public class Elephant {
  public void hello() {
    System.out.println("Hi, I am Elephant");
  }
}
public class AfricanElephant {
  public void hello() {
    System.out.println("Hi, I am AfricanElephant");
  }
}

new Elephant().hello();
new AfricanElephant().hello();

```

### Method override rules

---

The method in the child class must have the same signature as the method in the parent
class.

_Example_

---

The method in the child class must be at least as accessible or more accessible than the
method in the parent class.

_Example_

---

The checked exception thrown from the child class may not broader than one in the parent class.

_Example_

---

Returned value must be the same or a subclass of the method in the
parent class (_covariant return types_).

_Example_



## Can we overload inherited methods?

```
public class Elephant {
  public void hello() {
    System.out.println("Hi, I am Elephant");
  }
}

public class AfricanElephant {
  public int hello() {                 // error
    System.out.println("Hi, I am AfricanElephant");
  }
}

```


## Can private method be inherited?

Static methods can be **redeclared** only, not overridden.

_Example: parent and child with the same private methods._ 


## Can static method be inherited?

Static methods can be **hidden** only, not overridden.

_Example: parent and child with the same private methods._

Overriding vs. Hiding Methods:

* overridden method replaces the parent method in calls defined in both the parent and child

* hidden method replaces the parent method in calls defined only in child



## Can final method be inherited?

_Example: attempt to inherit final method_


## Can field be inherited?

Fields are always hidden, not overridden.

_Example: child and parent both calling same name field._

**Field hiding is bad practice. Trap.**

_Example: polymorphic call to public overridden field_



# Abstract classes

## Defining an Abstract Class

Use `abstract` specifier.

_Example: declare abstract class_


## Creating a Concrete Class


By `extends` of abstract parent.

_Example: instantiate concrete class_

## Extending an Abstract Class

`public abstract class ... extends ...`

_Example: abstract class extending abstract class_

## AC vs Interface

An **interface** is a description of the behaviour an implementing class will have. The implementing class ensures, that it will have these methods that can be used on it. It is basically a contract or a promise the class has to make.

An **abstract class** is a basis for different subclasses that share behaviour which does not need to be repeatedly created. Subclasses must complete the behaviour and have the option to override predefined behaviour (as long as it is not defined as final or private).

<a href="https://beginnersbook.com/2013/05/abstract-class-vs-interface-in-java/">[more]</a> <a href="https://stackoverflow.com/a/18778228/2045440">[more]</a>




# Polymorphism

_Πολυμορφισμός_

## Example
```
public interface Mammable {
    void drinkMilk();
}

public interface Carnivore extends Mammable {
    void eatMeat();
}

public class Lion implements Carnivore {
    ...
}

public static void main(String[] args) {
    Lion lion = new Lion();
    Carnivore carnivore = lion;
    Mammable mammable = lion;
}
```

## Question

```
public interface Mammable {
    void drinkMilk();
}

public interface Carnivore extends Mammable {
    void eatMeat();
}

public class Lion implements Carnivore {
    ...
}

public static void main(String[] args) {
    Lion lion = new Lion();
    Carnivore carnivore = lion;
    Mammable mammable = lion;

    // Which will compile?
    lion.eatMeat();         // 1
    lion.drinkMilk();       // 2
    carnivore.eatMeat();    // 3
    carnivore.drinkMilk();  // 4
    mammable.eatMeat();     // 5
    mammable.drinkMilk();   // 6
}
```


## Object vs. Reference

1. The type of the object determines which properties exist within the object in memory.
2. The type of the reference to the object determines which methods and variables are
accessible to the Java program.

## Casting Objects

* Casting from a subclass to a superclass -> cast not required

* Casting from a superclass to a subclass -> an explicit cast required

* Casting to unrelated type -> compile error

* Casting from a superclass to child class -> runtime error
 
## Virtual methods

* a virtual method is a method in which the specific implementation is not determined until runtime. 

* there is no _virtual_ keyword (like in _C++_)
 
* in Java all methods (that are not final, static, or private) are virtual and can be overridden

* 
if you call a
method on an object that overrides a method, you get the overridden method, even if the
call to the method is on a parent reference or within the parent class.

* Dynamic binding means the JVM will decide at runtime which method implementation to invoke based on the class of the object.

Late bound (dynamic dispatch)
 
## Polymorphic Parameters

Any class that implements the interface can be passed to the method. 

Since you’re casting from a subtype to a supertype, an explicit cast is not required.

_Example: parent class, 1-2 children and use of them_

## Polymorphism and Method Overriding

All rules applied to method overriding enable polymorphism.

# To inherit or to compose?
  
## Inherit-compose example


# SOLID

## SOLID principles

* Single responsibility principle
* Open/closed principle
* Liskov substitution principle
* Interface segregation principle
* Dependency inversion principle

# Design patterns

## 

<table>
<tr>
<td>

![](https://static01.helion.com.pl/helion/okladki/326x466/wzoelv.jpg)

</td>
<td>

![](https://static01.helion.com.pl/helion/okladki/326x466/wzorvv.jpg)

</td>
</tr>
</table>

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

section.level2, section.level3 {
text-align:left;
}
section.level2 h2, section.level3 h3{
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