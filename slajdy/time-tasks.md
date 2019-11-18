% `java.time `- zadania 


## Zadanie 1

Wypisz aktualną datę/godzinę wskazaną przez poznane typy z pakietu `java.time`
i przeanalizuj różnice pomiędzy nimi.


<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">
`now()`
</div>  

## Zadanie 2

Zbuduj datę/godzinę wskazaną przez poznane typy z pakietu `java.time`
i przeanalizuj różnice pomiędzy nimi.


<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">
`now()`
</div>  

## Zadanie 3

30 października 2019 r. trener wystawił fakturę z 21 dniowym terminem płatności. 
Korzystając z możliwości pakietu `java.time` wyznacz, którego dnia najpóźniej faktura powinna zostać opłacona. 



## Zadanie 4

Pewna karta kredytowa ma okres rozliczeniowy kończący się 18 dnia każdego miesiąca.
Termin bezodsetkowej spłaty zadłużenia to 25 dni. Wyznacz terminy bezodsetkowych spłat 
dla okresów rozliczeniowych kończących
 się w każdym z miesięcy 2019 roku.
 
 
## Zadanie 5

Wypisz w jakich dniach tygodnia (tylko liczby od 1 do 7) będzie obchodzone następnych dziesięć Barbórek.    

<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">
* 4 grudnia
* `.getDayOfWeek()`
</div>  






## Zadanie 6

Kota należy karmić 5 razy dziennie (średnio 5 razy na dobę).

Napisz program który będzie mógł posłużyć do wyznacznia godzin wydawania karmy z automatycznego karmidełka dla kota w regularnych odstępach czasu.

Wypisz 10 dat i godzin kolejnych pór karmienia, zaczynajac od pierwszego karmienia 16 listopada 2019 r. o godz. 06:00.




## Zadanie 7

Ostatnia pełnia księżyca miała miejsce 12 listopada.
 
Korzystając z możliwości pakietu `java.time` wyznacz daty następnych 5 pełni.

Na potrzeby zadania przyjmijmy że pełnia występuje co 29 dni.  


<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">
`Period`
</div>  

 
## Zadanie 8

Dużego psa należy karmić 2 razy dziennie.

Dostosuj kod z zadania z karmidełkiem dla kota tak, aby tego samego programu do wyznaczania pór karmienia można było użyć
do karmidełek zarówno dla psa jak i kota.

Wypisz 10 dat i godzin kolejnych pór karmienia, zaczynajac od pierwszego karmienia 16 listopada 2019 r. o godz. 06:00.


<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">
`Duration`
</div>  




## Zadanie 9

Java 1.0 została wydana 23.01.1996. Warsztaty w Javie rozpoczęły się 14 września 2019r.  

Oblicz ile miesięcy upłynęło pomiędzy tymi datami.

<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">
* `ChronoUnit.between`
</div>  



## Zadanie 10

_Once in a blue moon_

<quote>Niebieski księżyc</quote> – określenie drugiej pełni Księżyca w ciągu jednego miesiąca kalendarzowego.


Ostatnia pełnia księżyca miała miejsce 12 listopada o godzinie 14:34.

Korzystając z możliwości pakietu `java.time` wyznacz daty kolejnych <quote>niebieskich księżyców</quote> do roku 2029 (włącznie). 


Na potrzeby zadania przyjmijmy że pełnia występuje co 29.5 dnia.  
 




## Zadanie 11


Wypisz jaka jest teraz godzina:

* w Londynie

* w Tokyo
 
 
## Zadanie 12


Kolejna pełnia księżyca wystąpi 12 grudnia 2019 r. o godz. `06:14` naszego czasu. 

Wyznacz jaka będzie wtedy godzina w:

* w Moskwie

* w Nowym Jorku
 
 
## Zadanie 13

Programista z Katowic umawia się z kolegą z zespołu z Kalkuty na rozmowę w najbliższy poniedziałek.
Programista z Kalkuty proponuje aby rozmowę odbyć  o godzinie 10:00. Posługuje się on czasem lokalnym dla Kalkuty.

Jaka będzie wtedy data/godzina w Katowicach? 

<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">

`with(TemporalAdjuster)`

`Asia/Kolkata`
</div>  



## Zadanie 14

W weekend 26-27 października 2019, warsztaty rozpoczynały sie o godzinie 9:00. 

Oblicz ile godzin minęło pomiędzy rozpoczęciem zajęć w sobotę a rozpoczęciem zajęć w niedzielę.

<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">
* `ZonedDateTime.of`
* Period/Duration?
</div>  


## Zadanie 15
Oblicz która godzina była w Polsce w dniu 27 października jedną godzinę po godzinie 2:30. 

## Zadanie 16
Wypisz wszystkie strefy czasowe dostępne aktualnie w Javie. 

## Zadanie 17
Wypisz aktualny czas w innych dostępnych systemach kalendarzowych. 