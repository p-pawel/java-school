% Databases - JDBC - zadania

## Zadanie 1

Utwórz projekt typu Maven, dodaj zależność do sterownika do bazy danych Postgres na podstawie danych [stąd](https://mvnrepository.com/artifact/org.postgresql/postgresql) 

W programie utwórz obiekt typu `java.sql.Connection`, który połączy się z Twoją lokalną bazą danych PostgreSQL. 


## Zadanie 2

Napisz aplikację, pytającą użytkownika o szczegóły zamówienia (`new Scanner(System.in).readLine()`):

- id zamawianego produktu
- id klienta
- liczbę sztuk

i wpisującą te dane do bazy danych. 

**Kryteria akceptacji (Acceptance Criteria):**

Jako Użytkownik mogę złożyć zamówienia (wprowadzając 3 powyższe parametry).
Wprowadzone zamówienie jest widoczne w tabeli zamówień w bazie danych.


## Zadanie 2*

_Separation of concerns_

Zrefaktorujemy aplikację.
<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
DTO, Repo
</div>  


## Zadanie 3

Zabezpiecz poprzednią aplikację przed podatnością na wstrzykiwanie kodu SQL.

## Zadanie 4

Zmodyfikuj poprzednią aplikację tak, aby po uruchomieniu (przed rozpoczęciem interakcji z użytkownikiem),
wypisała 3 ostatnie zamówienia. 


## Zadanie 5

* Zmodyfikuj strukturę tabeli z zamówieniami, tak
aby zawierała również datę i godzinę złożenia zamówienia
`placed_at`.

* Dodaj kilka nowych wierszy w tabeli zamówień.

* Z poziomu aplikacji Java pobierz zamówienia złożone w
ciągu ostatnich 24 godzin.

* *Zaprojektuj tabelę tak, aby kolumna `placed_at` domyślnie
zawierała datę i godzinę utworzenia wiersza tego zamówienia
 w bazie (bez potrzeby wskazywania tej daty i godziny ręcznie)
<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
`    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP`
</div>  

 
 
## Zadanie 6

Napisz fragment kodu, który wywoła wyjątek `SQLException`.
Przeanalizuj jakie wyniki zwrócą metody z tego wyjątku:
ie
* `getMessage()`
* `getSQLState()`
* `getErrorCode()`
* `getNextException()`



## Zadanie 7

* W bazie danych utwórz widok, który zagreguje w jednym miejscu: nr zamówienia, czas złożenia zamówienia,
nazwę klienta, nazwę produktu, liczbę sztuk.

* Zmodyfikuj aplikację tak, aby do wypisania zamówień z ostatnich 24h skorzystała z danych dostarczanych 
przez ten widok.