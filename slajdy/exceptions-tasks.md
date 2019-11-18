% Exceptions - Zadania 


## Zadanie 1

_Fail gracefully_

Napisz program, który:

 - wypełni pięcioelementową tablicę/listę liczbami od 1 do 5

 - dokona dziesięciu losowań liczb z przedziału `[0, 10]` i wypisze liczbę znajdującą na tej wylosowanej pozycji 
 w tablicy/liście. 
 
Zapewnij <quote>"wdzięczną"</quote> obsługę błędów - wypisując 0 jeśli pozycja będzie nieprawidłowa.

Typ danych - w wybranym wariancie:
(1) tablica
(2) lista

## Zadanie 2

Z danych trzech odcinków o długości `a`, `b` i `c` można zbudować trójkąt, jeżeli:

* `a < b + c`
* `b < a + c`
* `c < b + a` 

Napisz klasę trójkąta, która w konstruktorze będzie wymagała 
prawidłowych dla trójkąta wartości `a`, `b` i `c`.

<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">

* `throws ...`
* `throw new ...`
</div>  

## Zadanie 3 


Napisz program, który spróbuje odczytać zawartość pliku, i przed zakończeniem pożegna się z użytkownikiem.
Pożegnanie powinno zostać wypisane nawet jeśli wystąpi błąd w dostępie do pliku. 


<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">

* Skorzystaj z klasy `FileReader`: `FileReader fileReader = new FileReader("plik.txt");`
* `finally`
</div>  
 
