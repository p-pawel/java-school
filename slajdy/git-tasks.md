% Git - Zadania 


## Zadanie 1

Pobierz ze strony <a href="https://git-scm.com/downloads" target="_blank">https://git-scm.com/downloads</a>
instalator odpowiedni dla Twojego systemu operacyjnego, i zainstaluj Git.

Następnie zweryfikuj poprawność instalacji wykonując z linii poleceń komendę:
```
git --version
```

Po poprawnej instalacji polecenie powinno zwrócić aktualną wersję Gita, np.
```
git version 2.17.1
```


## Zadanie 2

Utwórz nowy folder, i zainicjalizuj w nim nowe repozytorium Git.

<div class="clicker" tabindex="1"></div>
<div class="hiddendiv">
`git init`
</div>  
  
Po inicjalizacji powinien wyświetlić się komunikat:
```
Initialized empty Git repository in <twoj-katalog>
```

Sprawdź co wyświetli `git status`



## Zadanie 3

W katalogu z zainicjalizowanym repozytorium utwórz plik `PIERWSZY.md`
i sprawdź status repozytorium.

<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
`git status`

```
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	PIERWSZY.md
```
</div>  

## Zadanie 4

W tym samym katalogu utwórz plik `DRUGI.md`,
i dodaj go do plików śledzonych przez repozytorium. Sprawdź status.

<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
* `git add DRUGI.md`
* `git status`

```
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

	new file:   DRUGI.md

Untracked files:
  (use "git add <file>..." to include in what will be committed)

	PIERWSZY.md
```
</div>  

## Zadanie 5

W tym samym katalogu utwórz plik `TRZECI.md`,
i dodaj go do plików śledzonych przez repozytorium,
a następnie zatwierdź zmiany zapisując je w repozytorium 
z opisem `Add third file`. 

<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
* `git add TRZECI.md`
* `git commit -m "Add third file" `
</div>  

Obserwuj jak zmienia się status pomiędzy kolejnymi operacjami.

Po zakończeniu sprawdź jakie pliki zostały zatwierdzone. Dlaczego tak się stało?



## Zadanie 6

Usuń plik `PIERWSZY.md` z repozytorium, i zatwierdź zmiany.

Sprawdź status i historię operacji.

## Zadanie 7


Zmień nazwę pliku `DRUGI.md` w repozytorium na `SECOND.md`, i zatwierdź zmiany.

Sprawdź status i historię operacji.

## Zadanie 8

Sprawdź dzinnik Gita.



## Zadanie 9

_Po zaimportowaniu projektu do IntelliJ, IDEA utworzyła kilka plików w katalogu `.idea`,
a niekoniecznie pliki konfiguracyjne IDE są tymi, które chcemy trzymać w repozytorium._ 

Oznacz pliki z katalogu `.idea` jako ignorowane. 

Zmiany te zapisz z komunikatem `Ignoruję pliki`.

Po operacji sprawdź status, i zobacz historię zmian.

## Zadanie 9a

Oznacz plik `SECOND.md` jako ignorowany. 

Zmiany te zapisz z komunikatem `Ignoruję jakiś plik`.

Po operacji sprawdź status, i zobacz historię zmian.



## Zadanie 10

Popraw wiadomość z ostatniego zadania, tak aby bardziej precyzyjnie określała co zostało
zmienione, np. `Ignoruję pierwszy plik`.


<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
* `git commit --amend -m "Ignoruję pierwszy plik" `
</div>  

Po operacji sprawdź status, i zobacz historię zmian.

## Zadanie 10a

Zmodyfikuj ostatni commit w ten sposób, żeby obejmował również nowo utworzony plik `ZAPOMNIANY.md`.

<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
* `touch ZAPOMNIANY.md`
* `git add`
* `git commit --amend` 
</div>  

Po operacji sprawdź status, i zobacz historię zmian.

## Zadanie 11

Dodanie pliku `ZAPOMNIANY.md` i usunięcie `SECOND.md` było pomyłką. 

Cofnij poprzednią operację. Po operacji sprawdź status.

<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
`git revert <commit-id>`, np. `git revert cdd5117`
</div>  



## Zadanie 12

Utwórz plik `NOWY.md`, i dodaj do śledzonych plików. 
Wycofaj dodany plik z indeksu.

<div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
<div class="hiddendiv">
 * `git reset HEAD NOWY.md`
</div>



## Zadanie 13

Najpierw wprowadź zmiany `NOWY.txt` (bez zatwierdzania), a potem wycofaj zmiany w pliku `NOWY.txt`.

 <div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
 <div class="hiddendiv">
 * `git checkout -- SECOND.md`
 </div>
 
 

## Zadanie 14

Utwórz nową gałąź `hotfix-1` (z aktualnego `master`). W tej gałęzi utwórz zmianę (commit) dodającą plik `FIX.md`.

 <div class="clicker" tabindex="1" onclick="window.dispatchEvent(new Event('resize'))"></div>
 <div class="hiddendiv">
 * `git checkout -b hotfix-1`
 * `touch FIX.md`
 * `git add FIX.md`
 * `git commit -m "HOTFIX-1 Fix the bug..."`
 </div>

Przeanalizuj aktualne drzewo zmian w repozytorium.



## Zadanie 15

Scal gałąź `hotfix-1` do gałęzi `master`.

## Zadanie 16

* Utwórz nową gałąź `hotfix-2` z aktualnej `master`.
* W gałęzi `hotfix-2` utwórz i zatwierdź zmianę, która w pliku `FIX2.md` umieści tekst `16 listopada`.
* W gałęzi `master` utwórz i zatwierdź zmianę, która w pliku `FIX3.md` umieści tekst `17 listopada`.

Przeanalizuj aktualne drzewo zmian w repozytorium.

## Zadanie 17
* Scal gałąź `hotfix-2` do gałęzi `master`.

Przeanalizuj aktualne drzewo zmian w repozytorium.

## Zadanie 18

* Utwórz nową gałąź `hotfix-3` z aktualnej `master`.
* W gałęzi `hotfix-3` utwórz i zatwierdź zmianę, która w pliku `FIX3.md` umieści tekst `18 listopada 2019`.
* W gałęzi `master` utwórz i zatwierdź zmianę, która w pliku `FIX3.md` umieści tekst `19 listopada 2019`.

Przeanalizuj aktualne drzewo zmian w repozytorium.


## Zadanie 19
* Scal gałąź `hotfix-3` do gałęzi `master`.

Przeanalizuj aktualne drzewo zmian w repozytorium.


## Zadanie 20

Zad.16 - rebase

## Zadanie 21

Zad.17 - rebase



## Zadanie 22

Przejdź do nowego katalogu - poza dotychczasowym repozytorium.

Sklonuj istniejące zdalne repozytorium `https://github.com/p-pawel/the-project.git`

Sprawdź status. Zaimportuj do IDE.

## Zadanie 23

[Poczekaj na zdalne zmiany]

Pobierz dane o zmianch ze zdalnego repozytorium.

## Zadanie 24

Wyślij swoje zmiany do zdalnego repozytorium.


## Zadanie 25

Wprowadź zmiany na innej gałęzi `issue-1` i wyślij te zmiany do zdalnego repozytorium.



