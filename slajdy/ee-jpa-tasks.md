% JPA - zadania 


## Zadanie 1


* Korzystając z innego narzędzia utwórz nową pustą bazę danych.

* Utwórz projekt w Mavenie (bez żadnego artefaktu) z następującymi zależnościami:
  * `javax.persistence:javax.persistence-api:2.2`
  * `org.eclipse.persistence:eclipselink:2.7.5`
  * dodaj również zależność do sterownika do bazy danych

* Skonfiguruj połączenie ze swoją bazą danych tworząc odpowiedni plik `persistence.xml`.

* Sprawdź czy aplikacja uruchamia się poprawnie. 

## Zadanie 2

Korzystając z JPA, zamodeluj klasę faktury (`Invoice`) tak aby użyta została tabela `INVOICE`.

W klasie dodaj pole tekstowe `invoiceNumber`.

Pozwól JPA na wygenerowanie schematu bazy danych.

Uruchom program i  korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy tabela została utworzona.


## Zadanie 3

W klasie `Invoice` dodaj pole identyfikatora faktury (`id`). Zapewnij aby wartość tego pola była automatycznie generowana.

* Uruchom program i pozwól JPA na zaktualizowanie schematu bazy danych.

* Korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy **struktura** tabeli została zmieniona. 
Spróbuj dodać nowy wiersz do tabeli.


## Zadanie 4

W klasie `Invoice` dodaj pole typu faktury o wartościach: `VAT` (faktura VAT), `PRO_FORMA`  (faktura pro-forma), `ADVANCE`  (faktura zaliczkowa).


1) Zamodeluj encję korzystając domyślnego sposobu zapisu wartości (jako liczby porządkowe).

* Uruchom program i pozwól JPA na zaktualizowanie schematu bazy danych.

* Korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy **struktura** tabeli została zmieniona.


## Zadanie 4.b 

2) Zmień sposób zapisu wartości typu wyliczeniowego na etykiety tekstowe.

* Uruchom program i pozwól JPA na zaktualizowanie schematu bazy danych.

* Korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy **struktura** tabeli została zmieniona.

Jakie problemy wystąpiły?


## Zadanie 5

W klasie `Invoice` dodaj pole logiczne `accountable` którego wartość 
będzie ustawiana na `true` dla typów faktury innych niż pro-forma.

Zapewnij aby to pole nie by mapowane przez JPA na kolumnę w bazie danych.

* Uruchom program i pozwól JPA na zaktualizowanie schematu bazy danych.

* Korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy **struktura** tabeli została zmieniona.



## Zadanie 6

W klasie `Invoice` dodaj pole tesktowe z uwagami, które pozwoli na wpisywanie długich tekstów (które mogą być dłuższe niż 255 znaków).

* Uruchom program i pozwól JPA na zaktualizowanie schematu bazy danych.

* Korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy **struktura** tabeli została zmieniona.




## Zadanie 7

W programie utwórz nowy obiekt klasy `Invoice` i zapisz go w bazie danych.  

Korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy **zawartość** tabeli została zmieniona.


## Zadanie 8


Zmodyfikuj program tak, aby pobrał fakturę o `id` równym `1` z bazy danych i wypisał jej numer.
  
## Zadanie 9

Zmodyfikuj program tak, aby dla faktury o `id` równym `1` ustawił jej numer na aktualny timestamp :)

## Zadanie 10

Zmodyfikuj program tak, aby usunął fakturę o `id` równym `2`.

Sprawdź jak zmieni się zachowanie programu przy kolejnych uruchomieniach.


## Zadanie 11


Przyjmijmy, że na potrzeby sklepu internetowego chcemy przechowywać dane klientów i ich adresy w osobnych tabelach.
 
* Zamodeluj relację Klient - Adres typu 1:1 w postaci klas encji (JPA z adnotacjami), 
* napisz kod, który po uruchomieniu programu utworzy obiekty obu typów połączone ze sobą i zapisze oba w bazie danych
* korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy obie instance zostały zapisane  

(i) jeszcze bez kaskad


## Zadanie 12


Przyjmijmy, że na potrzeby sklepu internetowego chcemy przechowywać dane produktów i pozycji zamówień odnoszących się
 do tych produktów.
 
* Zamodeluj relację Produkt - Pozycja Zamówienia typu n:1 w postaci klas encji (JPA z adnotacjami), 
* napisz kod, który po uruchomieniu programu utworzy obiekty obu typów połączone ze sobą i zapisze oba w bazie danych
* korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy obie instance zostały zapisane  

(i) jeszcze bez kaskad

## Zadanie 13


Przyjmijmy, że na potrzeby sklepu internetowego chcemy przechowywać dane **zamówień** i **pozycji zamówień** będących
składową tych zamówień.
 
* Zamodeluj relację **Zamówienie** - **Pozycja Zamówienia** typu `1:n` w postaci klas encji (JPA z adnotacjami), 
* napisz kod, który po uruchomieniu programu utworzy obiekty obu typów połączone ze sobą i zapisze oba w bazie danych
* korzystając z narzędzia do przeglądania bazy danych (np. DBeaver) sprawdź czy obie instance zostały zapisane  

(i) jeszcze bez kaskad

# Zadanie 14




## Zadanie 15


Zmodyfikuj program z zadań 2-10 tak, aby pobrał za pomocą zapytania JPQL wszystkie faktury i wypisał ich numery.