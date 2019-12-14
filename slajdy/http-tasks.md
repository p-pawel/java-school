% Web application fundamentals

# HTTP - Zadania 

## Zadanie 1

Pobierz i zainstaluj aplikację <a href="https://www.getpostman.com/" target="_blank">Postman</a>.
 


<a href="https://github.com/public-apis/public-apis" target="_blank">https://github.com/public-apis/public-apis</a>

## Zadanie 2

Utwórz serwer, który na żądanie adresu `/hello` odpowie `hi`.

Sprawdź zachowanie w przeglądarce internetowej.

Korzystając z aplikacji Postman wyślij żądanie `GET` do uruchomionego serwera REST.


## Zadanie 3

Zmodyfikuj serwer tak, aby obsługiwał również adres `cars`, pod którym zwróci kolekcję obiektów typu `Car` w formacie JSON.

Klasa `Car` może zawierać np. dwa pola: `long id` i `String name`.

## Zadanie 4

Zmodyfikuj serwer tak, aby obsługiwał również adres `cars/:id`, pod którym zwróci pojedynczy obiekt typu `Car` w formacie JSON,
który będzie zawierać `id` zgodny z żądaniem.

Klasa `Car` może zawierać np. dwa pola: `long id` i `String name`.

 
## Zadanie 5

Zmodyfikuj serwer tak, aby nawiązywał połączenie z Twoją bazą danych.

Serwer powinien nadać bez problemu obsługiwać poprzednie żądania.


## Zadanie 6

Zmodyfikuj serwer tak, aby pod adresem `orders` zwracał wszystkie zamówienia dostępne w bazie danych.

Skorzystaj z napisanych wcześniej klas `OrderRepository`, `OrderTO`. 

## Zadanie 7

Zmodyfikuj serwer tak, aby pod adresem `orders/:number` (np. `orders/1`) zwracał szczegóły zamówienia 
o odpowiednim `id`.


## Zadanie 8

Zmodyfikuj serwer tak, aby pod adres `orders` możliwe było przesłanie zapytania typu `POST`
zawierającego obiekt typu `OrderTO` w formacie JSON i zapisanie tego zamówienia w bazie danych. 
 

## Zadanie 9

4. update existing fully

## Zadanie 10

5. update existing partially

## Zadanie 11

6. delete


## Zadanie 12

Skonfiguruj aplikację tak, aby umożliwiała testowanie serwera.

Za pomocą testów sprawdź czy aplikacja zwraca poprawne statusy HTTP dla żądań `GET` do zasobu `orders`: 
`200` `OK` - dla istniejącego zamówienia, `404` `Not Found` dla zamówienia o nieistniejącym id.



## Zadanie 13
GET all joint

## Zadanie 14
GET one joint

## Zadanie 15
POST joint

## Zadanie 16
PUT joint

## Zadanie 17
PATCH joint

## Zadanie 18
Filtrowanie 

## Zadanie 19
HETEOAS



7. extend 1+2 with joins

