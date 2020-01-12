% Spring Framework (Core) - zadania 

## Zadanie 1

<div style="font-size: 0.75em;">
Utwórz nowy projekt Maven (bez archetypu) z zależnością: 


```
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context-support</artifactId>
    <version>5.2.2.RELEASE</version>
</dependency>
```

Zweryfikuj poprawność konfiguracji deklarując w metodzie `main` zmienną typu `ApplicationContext`.

PS.

```
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.0</version>
            <configuration>
                <release>8</release>
            </configuration>
        </plugin>
    </plugins>
</build>
```

</div> 


## Zadanie 2

W zasobach projektu (w podkatalogu `src\main\resources`) utwórz plik `beans.xml` o treści:

<div style="font-size: 0.8em;">

```
<?xml version="1.0" encoding="UTF-8"?>
<beans 
    xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd" >
</beans>
```
</div>

a następnie zainicjalizuj kontekst aplikacji oparty na tej konfiguracji XML.


## Zadanie 3

* W projekcie utwórz klasę `MyRandom` zawierającą pole `value`, którego losowa wartość będzie ustalana w
konstruktorze (bezparametrowym). Klasa powinna być zgodna z konwencją JavaBeans.

* Do utworzonego (pustego) kontekstu dodaj bean tego typu.

* W głównej metodzie aplikacji użyj tego beana wypisując zawartość pola `value`.


## Zadanie 4

Rozszerzenie poprzedniego zadania:

* Utwórz kilka beanów klasy `MyRandom` (różniących się tylko nazwami/id) i użyj ich w kodzie Java wypisując zawartość każdego z nich. 

* Sprawdź co się stanie jeśli spróbujesz użyć tego samego beana kilka razy - czy zwracana wartość będzie taka sama?

* Sprawdź jak zmieni się zachowanie jeżeli któryś z beanów będzie aliasowany.



## Zadanie 5

<div style="font-size: 0.9em">
Uwtórz klase `Car` o parametrach `int year` i `String name`, z konstruktorem wymagającym podania tych wartości.

W konfiguracji XML utwórz beany tego typu oraz sparametryzuj jego tworzenie wybranymi wartościami.
Skorzystaj z następujących sposobów parametryzowania beana:

a) Constructor Argument Resolution

b) Constructor argument type matching

c) Constructor argument index

d) Constructor argument name
</div>

## Zadanie 6

Rozszerzenie poprzedniego zadania:

W klasie `Car` dodaj konstruktor bezparametrowy oraz settery.

W konfiguracji XML utwórz bean tego typu i sparametryzuj jego pola wybranymi wartościami (wykorzystując
wstrzykiwanie zależności przez settery).




## Zadanie 7



Utwórz w XML bean typu `String` o nazwie `name` zawierający Twoje imię, a następnie w kodzie Java pobierz 
i wypisz wartość tego beana.


## Zadanie 8

Rozszerzenie poprzedniego zadania:

* Utwórz interfejs `HelloService` z metodą `String hello(String name)` i utwórz jego implementację
która będzie zwracała przywitanie wskazanego użytkownika.

* Utwórz w XML bean z tą klasą, i w kodzie Java użyj go do wygenerowania pozdrowienia.

 
 
## Zadanie 9

Rozszerzenie poprzedniego zadania:

Dostosuj kod klasy tak, aby `name` stało się właściwością klasy i przekaż tą wartość bezpośrednio
w konfiguracji XML.

  
 
## Zadanie 10

Zmodyfikuj konfigurację beana klasy `MyRandom` (bez modyfikowania samej klasy) tak, aby 
za każdym użyciem był to inny obiekt (czyli będzie zwracał inną wartość).

Wypisz kilka wartości w kodzie Java.

 