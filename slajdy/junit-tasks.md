% JUnit - zadania


## Zadanie 1

Napisz klasę która pozwoli na zamianę liczb od 0 do 10 na ich postać słowną (po polsku), np. 0 - `zero`, 10 - `dziesięć`.

Napisz testy jednostkowe weryfikujące implementację.

*Opcjonalnie rozszerz klasę tak, aby działała poprawnie dla liczb o 1 do 30. 

*Opcjonalnie rozszerz klasę tak, aby działała poprawnie dla liczb o 1 do 100. 


## Zadanie 2

Dopisz testy potwierdzające poprawność implemetacji zadania:

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

Parameters from annotation - task

## Zadanie 4

Parameters from annotation - task

## Zadanie 5

Parameters from annotation - task



## Zadanie 6

<div style="font-size: 80%">
* Od 1 marca 2018 obowiązuje zakaz handlu w niedziele. Od tej daty w 2018 zakupy robiliśmy tylko w pierwszą i ostatnią niedzielę miesiąca. 

* W 2019 roku zakaz został zaostrzony i sklepy mogą być otwarte tylko w ostatnią niedzielę miesiąca.

* Od 2020 zakaz handlu nie obowiązuje w ostatnią niedzielę przypadającą w styczniu,
 kwietniu, czerwcu i sierpniu.

* We wszystkich latach od 2018 zakaz nie obowiązuje w:

  * kolejne dwie niedziele poprzedzające pierwszy dzień Bożego Narodzenia;

  * niedzielę bezpośrednio poprzedzającą pierwszy dzień Wielkiej Nocy;

* Przyjmijmy, że przed marcem 2018 roku wszystkie niedziele były handlowe.

Stosując wytwarzanie sterowane testami zaimplementuj metodę `isSundayShopping(LocalDate)` zwracającą `TRUE`/`FALSE` dla podanej daty zgodnie 
z powyższym opisem (dla innych dni tygodnia metoda powinna zgłosić wyjątek).
</div>
<style>
.slides {
  width: 90% !important;
}</style>