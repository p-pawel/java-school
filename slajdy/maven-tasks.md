% Maven - zadania 

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

Zmodyfikuj aplikację tak, aby wyświetlała tekst `Hello Maven`.

Z linii poleceń zbuduj paczkę z programem i uruchom program. 



### Zadanie 7
 
Utwórz projekt Maven w IDE

### Zadanie 8
Projekt z zależnościami

### Zadanie 9
Dwa projekty - zależne od siebie 
`mvn install`

### Zadanie 10
Projekt wielomodułowy