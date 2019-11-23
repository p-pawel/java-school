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

## Parameters from annotation

## Parameters from annotation - task

## Parameters from Method 

## Parameters from Method - task

## Parameters from CSV-file

## Parameters from CSV-file - task



# Utilities

## assertj / fest? Czy warto przy ju5? 

## Coverage

# Tdd

## przykład 
## Zadania 

# inne 
## Spock 
## testng? 
## bdd/cucumber 

http://testerzy.pl/baza-wiedzy/behaviour-driven-development

# Mocks, stubs, fake, dummy

## Why mocking?


## Mockito 

![](https://raw.githubusercontent.com/mockito/mockito.github.io/master/img/logo%402x.png)



# best practices
<!--
simple mocking:

https://www.vogella.com/tutorials/Mockito/article.html
https://stackoverflow.com/questions/28295625/mockito-spy-vs-mock

https://blog.pragmatists.com/test-doubles-fakes-mocks-and-stubs-1a7491dfa3da

https://www.baeldung.com/mockito-mock-methods




adnotacje
https://www.baeldung.com/mockito-annotations

j8
https://www.baeldung.com/mockito-2-java-8

inne
https://www.baeldung.com/mockito-series & https://www.baeldung.com/?s=mockito


-->