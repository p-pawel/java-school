% Building tools - zadania 

## Zadanie 1

1) Ze strony [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
pobierz paczkę z programem Maven, np. `apache-maven-3.6.2-bin.zip`

2) Rozpakuj paczkę w wybranym katalogu, np. `C:\opt\`

3) Dodaj podkatalog `bin` z tego katalogu do zmiennej środowiskowej `PATH`.

4) Zweryfikuj instalację uruchamiając `mvn --version`
<small>(aby sprawdzić poprawnośc ustawień zmiennej środowiskowej `PATH` Upewnij się, że jesteś w innym katalogu niże)</small>

## Zadanie 2

Wygeneruj prosty projekt korzystając z archetypu Maven 

<div style="font-size: 85%">
```
mvn archetype:generate \
-DarchetypeGroupId=org.apache.maven.archetypes \
-DarchetypeArtifactId=maven-archetype-quickstart
```
</div>

Przeanalizuj strukturę plików.   

## Zadanie 3

Wygeneruj prosty projekt korzystając z archetypu Maven, jednocześnie wskazując w parametrach z linii poleceń
nazwę grupy, nazwę artefaktu i numer wersji. 

<div style="font-size: 85%">
```
mvn -B archetype:generate \
-DarchetypeGroupId=org.apache.maven.archetypes \
-DarchetypeArtifactId=maven-archetype-quickstart
```
</div>

Przeanalizuj strukturę plików.   


## Zadanie 4

Skompiluj program z poprzedniego zadania.

Przeanalizuj strukturę plików.   



## Zadanie 5

Zbuduj paczkę z programem z poprzednich zadań.

Przeanalizuj strukturę plików.   



## Zadanie 6

Zainstaluj paczkę z programem z poprzednich zadań do lokalnego repozytorium.

Przeanalizuj strukturę plików.   


## Zadanie 7

Wyczyść dane budowania z poprzednich zadań.

Przeanalizuj strukturę plików.   


## Zadanie 8

Dla plików z poprzednich zadań wykonaj jednym poleceniem poniższe kroki:
 
* wyczyszczenie danych budowania 
* kompilacja programu
* zbudowanie paczki
* instalacja paczki do lokalnego repozytorium.


Przeanalizuj strukturę plików.   



## Zadanie 9

Zmodyfikuj aplikację tak, aby wyświetlała tekst `Hello Maven`.

Z linii poleceń zbuduj paczkę z programem i uruchom program. 



### Zadanie 10
 
Utwórz projekt Maven w IDE

### Zadanie 11
Projekt z zależnościami

### Zadanie 12
Dwa moduły - zależne od siebie.


### Zadanie 13
Projekt wielomodułowy




## Zadanie 14

1) Ze strony [https://gradle.org/releases/](https://gradle.org/releases/)
pobierz paczkę z programem Gradle odpowiednią dla Twojego systemu operacyjnego.

2) Rozpakuj paczkę w wybranym katalogu, np. `C:\opt\`

3) Dodaj podkatalog `bin` z tego katalogu do zmiennej środowiskowej `PATH`.

4) Zweryfikuj instalację uruchamiając `gradle -version` lub `gradle --version`
<small>(aby sprawdzić poprawnośc ustawień zmiennej środowiskowej `PATH` Upewnij się, że jesteś w innym katalogu niże)</small>



## Zadanie 15 

Utwórz 
