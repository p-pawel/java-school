% Spring Framework (Core) - zadania 




## Zadanie 1

Pobierz i rozpakuj kontener servletów "Tomcat" z <a href="https://tomcat.apache.org/download-90.cgi" target="_blank">https://tomcat.apache.org/download-90.cgi</a>

Sprawdź czy serwer uruchamia się wywołując skrypt `startup` (`bat` lub `sh`) z podkatalogu `bin` serwera,
i czy jest dostępny, np. przy domyślnym porcie 8080 pod adresem <a target="_blank" href="http://localhost:8080">http://localhost:8080</a>. 

## Zadanie 2

Wyłącz uruchomiony serwer skryptem `shutdown`.

Sprawdź czy przestał odpowiadać na porcie 8080.

 



## Zadanie 3

Utwórz klasę `Car` o polach `id`, `year`, `name`.

Utwórz klasę `CarRepository`, która będzie obsługiwała "bazę" samochodów - udostępniając metody:
* `findAll` - zwracającą wszystkie samochody
* `findOne(long)` - wyszukującą samochód wg `id`
* `save(Car)` - zapisującą nowy samochód

"Bazę" zaimplementuj jako kolekcję, która będzie mogła przechowywać obiekty typu `Car`.

Zaimplemenetuj kontroler, tak aby pod adresem 
`http://localhost:8080/api/cars` zwracana była lista wszystkich samochodów. 

## Zadanie 4


Rozszerz aplikację, tak aby pod adresem 
typu `http://localhost:8080/api/cars/123` zwracany był jeden samochód o odpowiednim `id`.

*W razie żądania nieistniejącego samochodu powinien zostać zwrócony status 404.  


## Zadanie 5


Dostosuj API wystawiające listę samochodów o możliwość wyszukiwania samochodów według roku - poprzez użycie
parametru żądania `year`


## Zadanie 6

Rozszerz aplikację o możliwość dodawania nowych samochodów poprzez przesłanie żądania `POST`
pod adres `/api/cars`

