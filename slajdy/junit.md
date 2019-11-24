% JUnit

# Intro

## Test levels

![](http://www.duncannisbet.co.uk/wp-content/uploads/2012/07/test_pyramid-300x218.gif)

## V model

![](https://insights.sei.cmu.edu/assets/content/F1%20-%20Traditional%20V%20Model.jpg)

<!--

Intro o testach ogólnie i gdzie jest miejsce testowania w cyklu życia oprogramowania

http://testerzy.pl/baza-wiedzy/poziomy-testowania

http://testerzy.pl/praktyka-testowania/automatyzacja-w-procesie-testowania

-->

# JUnit 

## Where to get from?

---

[https://github.com/junit-team/junit5-samples/blob/r5.5.2/junit5-jupiter-starter-maven/pom.xml](https://github.com/junit-team/junit5-samples/blob/r5.5.2/junit5-jupiter-starter-maven/pom.xml)

## Simple test

```
public class MyUnitTest {

    @Test
    public void testSum() {
        assertEquals(3, 1 + 2);
    }
}
```

## Simple test - tasks


* <a href="junit-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>

## Testing exceptions

```
@Test
void testExpectedException() {
 
  Assertions.assertThrows(NumberFormatException.class, () -> {
    Integer.parseInt("One");
  });
 
}
```

## Testing exceptions - task

* <a href="junit-tasks.html#/zadanie-2" target="_blank">[Task 2]</a>


# Parameterized tests

## Series of tests

* <a href="junit-tasks.html#/zadanie-1" target="_blank">[Task 1]</a>

## Parameters from annotation
```
@ParameterizedTest
@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
void palindromes(String candidate) {
    assertTrue(StringUtils.isPalindrome(candidate));
}
```



## Parameters from annotation - task

* <a href="junit-tasks.html#/zadanie-3" target="_blank">[Task 3]</a>


## Parameters from Method 
## Parameters from Method - task
* <a href="junit-tasks.html#/zadanie-4" target="_blank">[Task 4]</a>

## Parameters from CSV-file
## Parameters from CSV-file - task
* <a href="junit-tasks.html#/zadanie-5" target="_blank">[Task 5]</a>



# Utilities

## AssertJ 

## Coverage

# Test Driven Development

## TDD 

<div style="height: 2em"></div>
<div style="font-size: 200%; font-weight: bold; color: #888">
<span style="color:red">Red</span>
<i class="fas fa-arrow-circle-right" ></i>
<span style="color:green">Green</span>
<i class="fas fa-arrow-circle-right"></i>
<span style="color:blue">Refactor</span>
 </div>

<div style="height: 2em"></div>
 
## TDD - example

Let's write method checking if given String is a palindrome (e.g. `kayak`).

## TDD - task
* <a href="junit-tasks.html#/zadanie-6" target="_blank">[Task 6]</a>

 

# Other testing frameworks
 

## TestNG
 
## Spock

```
def "two plus two should equal four"() {
    given:
        int left = 2
        int right = 2
 
    when:
        int result = left + right
 
    then:
        result == 4
}
``` 

## Behaviour Driven Development

```
Given...

When...

Then...
```


## BDD - Cucumber 


```
Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
```


# Test doubles

## Why mocking?

## Test doubles

* dummy
* fake
* mock
* stub 

## Dummy

Simple object just to satisfy compiler.

## Fake

Fakes are objects that have working implementations, but not same as production one. Usually they take some shortcut and have simplified version of production code.

## Mock

Mocks are objects that register calls they receive.
In test assertion we can verify on Mocks that all expected actions were performed.

## Stub

Stub is an object that holds predefined data and uses it to answer calls during tests. It is used when we cannot or don’t want to involve objects that would answer with real data or have undesirable side effects.

## Mockito 

![](https://raw.githubusercontent.com/mockito/mockito.github.io/master/img/logo%402x.png)

<!--
simple mocking:

https://www.vogella.com/tutorials/Mockito/article.html
https://stackoverflow.com/questions/28295625/mockito-spy-vs-mock

https://blog.pragmatists.com/test-doubles-fakes-mocks-and-stubs-1a7491dfa3da

https://www.baeldung.com/mockito-mock-methods



# best practices

-->



<!--
adnotacje
https://www.baeldung.com/mockito-annotations

j8
https://www.baeldung.com/mockito-2-java-8

inne
https://www.baeldung.com/mockito-series & https://www.baeldung.com/?s=mockito


-->

# The end