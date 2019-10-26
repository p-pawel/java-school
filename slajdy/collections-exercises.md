% Zadania


## Zadanie 1 

_Przypomnienie tablic_

Napisz program, który utworzy tablicę o długości 20 i wypełni ją liczbami całkowitymi od 1 do 20, a następnie wypisze zawartość tablicy.

```
public class Exercise1 {

    ...

}
```

Efektem działania programu powinno być wypisanie ciągu znaków:
```
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
```



## Zadanie 2

_Wprowadzenie do list_


Napisz program, który utworzy listę (ArrayList) wypełnioną liczbami całkowitymi od 1 do 20, a następnie wypisze zawartość listy.

```
public class Exercise1 {

    ...

}
```

Efektem działania programu powinno być wypisanie ciągu znaków:
```
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
```



## Zadanie 3

_Nieznana długość kolekcji_

Stwórz kolekcję składającą się z liczb odpowiadających reszcie z dzielenia przez `7` tych liczb z przedziału `[1, 30]` które są podzielne przez `3`. 

---
`[3, 6, 2, 5, 1, 4, 0, 3, 6]`
---


## Zadanie 4

_Liczby bez duplikatów_

Stwórz kolekcję składającą się z liczb odpowiadających reszcie z dzielenia przez `7` tych liczb z przedziału `[1, 30]` które są podzielne przez `3`. 

Zapewnij żeby liczby nie powtarzały się.


## Zadanie 4 - wynik

`[0, 1, 2, 3, 4, 5, 6]`


## Zadanie 5

_Liczby bez duplikatów z zachowaniem kolejności_

Stwórz kolekcję składającą się z liczb odpowiadających reszcie z dzielenia przez `7` tych liczb z przedziału `[1, 30]` które są podzielne przez `3`. 

Zapewnij żeby liczby nie powtarzały się i pojawiły się w takiej kolejności, w jakiej były obliczane.


## Zadanie 5 - wynik

`[3, 6, 2, 5, 1, 4, 0]`



## Zadanie 6

_Liczby bez duplikatów w kolejności malejącej_

Stwórz kolekcję składającą się z liczb odpowiadających reszcie z dzielenia przez `7` tych liczb z przedziału `[1, 30]` 
które są podzielne przez `3`. 

Zapewnij żeby liczby nie powtarzały się i pojawiły się w kolejności malejącej.


## Zadanie 6 - wynik

`[6, 5, 4, 3, 2, 1, 0]`








## Zadanie 7

Napisz klasę, która będzie mogła służyć jako `Comparator` do porównywnia długości napisów.



## Zadanie 8

_Mapa klucz-wartość_

Napisz program, który utworzy mapę zawierającą liczbę wystąpień poszczególnych znaków w łańcuchu tekstowym `HashMap`,
ignorując przy tym wielkość liter (tzn. `H` i `h` będą liczone jako 2x `H`) 

## Zadanie 8 - wynik

```
{P=1, A=2, S=1, H=2, M=1}
```


## Zadanie 9

_Mapa klucz-wartość w kolejności wstawiania_

Napisz program, który utworzy mapę zawierającą liczbę wystąpień poszczególnych znaków w łańcuchu tekstowym `HashMap`,
ignorując przy tym wielkość liter (tzn. `H` i `h` będą liczone jako 2x `H`).

Klucze mapy powinny zachować kolejność znaków w jakiej te występowały w łańcuchu tekstowym.

## Zadanie 9 - wynik

```
{H=2, A=2, S=1, M=1, P=1}
```

## Zadanie 10

_Mapa klucz-wartość w kolejności naturalnej_

Napisz program, który utworzy mapę zawierającą liczbę wystąpień poszczególnych znaków w łańcuchu tekstowym `HashMap`,
ignorując przy tym wielkość liter (tzn. `H` i `h` będą liczone jako 2x `H`).

Klucze mapy powinny zachować kolejność alfabetyczną.

## Zadanie 10 - wynik

```
{A=2, H=2, M=1, P=1, S=1}
```



## Zadanie 11
Skopiuj do swojego projektu pliki:

*  <a href="Person.java" target="_blank"><code>Person.java</code></a>
*  <a href="PersonArrayFactory.java" target="_blank"><code>PersonArrayFactory.java</code></a>

oraz utwórz klasę `Task11` o następującej zawartości:

```
public class Task11 {

	private static PersonArrayFactory personArrayFactory = new PersonArrayFactory();

	public static void main(String[] args) {
		Person[] personArray = personArrayFactory.createArray();

        ...		
		
	}
}

```
c.d.n

## Zadanie 11 - c.d.

_Kolekcje: wszystkie elementy, więcej odczytów niż modyfikacji_

Utwórz kolekcję obiektów typu `Person`, która będzie zawierała wszytkie elementy z tablicy `personArray`, 
tak aby były one w takiej samej kolejności w jakiej wystąpiły one w tablicy.

Wypisz zawartość kolekcji oraz jej rozmiar.

_Z analizy biznesowej wynika, że kolekcja będzie później bardzo często odczytywana 
(elementy będą pobierane z różnych losowych miejsc), zaś dużo rzadziej będzie ona modyfikowana 
(przez dodawanie lub usuwanie elementów z kolekcji)._    
  
_Wybierz taki rodzaj kolekcji, który zapewni najlepszą wydajność w tym przypadku._



## Zadanie 12

_Kolekcje: wszystkie elementy, więcej modyfikacji niż odczytów_

Stwórz klasę `Task12` na wzór tej z poprzedniego zadania.

Utwórz kolekcję obiektów typu `Person`, która będzie zawierała wszytkie elementy z tablicy `personArray`, 
tak aby były one w takiej samej kolejności w jakiej wystąpiły one w tablicy.

Wypisz zawartość kolekcji oraz jej rozmiar.

_Z analizy biznesowej wynika, że kolekcja ta będzie później bardzo często modyfikowana 
(do kolekcji będą często dodawane lub usuwane elementy), zaś dużo rzadziej będzie ona 
odczytywana (poprzez pobieranie elementów z różnych losowych miejsc z kolekcji.)_    
  
_Wybierz taki rodzaj kolekcji, który zapewni najlepszą wydajność w tym przypadku._



## Zadanie 13

_Kolekcje: wszystkie bez duplikatów_

Stwórz klasę `Task13` na wzór tej z poprzedniego zadania.

Utwórz kolekcję obiektów typu `Person`, która będzie zawierała wszytkie elementy z tablicy `personArray`,
zapewnij jednak żeby ta sama osoba nie pojawiła się więcej niż jeden raz.   

Wypisz zawartość kolekcji oraz jej rozmiar.

_Z analizy biznesowej wynika, że kolejność elementów nie ma znaczenia._    


## Zadanie 14

_Kolekcje: wszystkie bez duplikatów, w kolejności wstawiania_

Stwórz klasę `Task13` na wzór tej z poprzedniego zadania.

Utwórz kolekcję obiektów typu `Person`, która będzie zawierała wszytkie elementy z tablicy `personArray`,
zapewnij jednak żeby ta sama osoba nie pojawiła się więcej niż jeden raz.   

Wypisz zawartość kolekcji oraz jej rozmiar.

_Z analizy biznesowej wynika, że kolejność występowania elementów powinna zostać zachowana._    


## Zadanie 15

_Kolekcje: wszystkie bez duplikatów, w kolejności lat urodzenia_

Stwórz klasę `Task13` na wzór tej z poprzedniego zadania.

Utwórz kolekcję obiektów typu `Person`, która będzie zawierała wszytkie elementy z tablicy `personArray`,
zapewnij jednak żeby ta sama osoba nie pojawiła się więcej niż jeden raz.   

Wypisz zawartość kolekcji oraz jej rozmiar.

_Z analizy biznesowej wynika, że elementy powinny być posortowane rosnąco wg lat urodzenia.    


## Zadanie 16
_Kolekcje: grupowanie wg miast_


_Z analizy biznesowej wynika, że kolejność elementów nie ma znaczenia._    


## Zadanie 17
_Kolekcje: grupowanie wg miast w kolejności występowania_

## Zadanie 18
_Kolekcje: grupowanie wg miast w kolejności alfabetycznej_

<style>
.slide{text-align: left}.slide *{font-size: 90%;}
.reveal code {
    font-family: monospace;
    text-transform: none;
    /* font-weight: 700; */
    /* border: solid 1px #888; */
    background: #333;
    color: #ffff80;
}

section.level2 {
text-align:left;
}
section.level2 h2{
/*text-align:center;*/
}
</style>
<style>
    a[target=_blank]::after {
        display: inline-block;
        font-style: normal;
        font-variant: normal;
        text-rendering: auto;
        -webkit-font-smoothing: antialiased;

        margin-left: 0.3em;
        font-family: "Font Awesome 5 Free"; font-weight: 900; content: "\f35d";
    }
</style>


<script>
document.querySelector('head').innerHTML += '<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.min.css" />';
</script>
<script>
h2 = document.querySelector('h2');

h2.addEventListener('click', function (e) {
    console.log("h2");
    if (e.offsetX > h2.offsetWidth) {
        console.log("close");
        window.close();
    } 
});</script>
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-41987357-2"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());
  gtag('config', 'UA-41987357-2');
</script>
