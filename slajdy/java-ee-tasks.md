% Java EE - zadania


## Zadanie 1

Pobierz i rozpakuj serwer aplikacji 
"WildFly" w wersji "Java EE Full & Web Distribution" <a href="https://wildfly.org/downloads/" target="_blank">https://wildfly.org/downloads/</a>

## Zadanie 2

Korzystając z Mavena wygeneruj nowy projekt z `<packaging>war</packaging>` 

## Zadanie 3

Dostosuj servlet tak, aby zwrócił tekst `Hello World!`.


## Zadanie 4

Dostosuj servlet tak, aby dla żądania `POST` z parametrem `name` odpowiedział tekstem `Hello {name}`.



## Zadanie 5

Dostosuje aplikację tak, aby tekst pozdrowienia z poprzedniego zadania generowany był w metodzie
z odrębnej klasy serwisowej, która zostanie wstrzyknięta do klasy servletu.


## Zadanie 6

Dostosuj usługę REST tak, aby dla żądania `GET` została zwrócona lista klientów.

Na potrzeby tego zadania nie potrzebujemy łączyć się z bazą danych, wystarczy lokalna lista. 

```
class Customer {
  private long id;
  private String name;  
}
```

*Wydziel operacje związane z obsługą listy do odrębnej klasy serwisowej typu "repozytorium", które będzie
enkapsulować listę. 