package part09;

/**
 * Konwencja JavaBeans:
 *
 * 1. Pola są prywatne
 *
 * 2. Gettery - metody pobierające wartość z pól typu "boolean" zaczynają się od "is".
 *    Metoda zwraca typ boolean.
 *
 * 3. Gettery - metody pobierające wartość z pól innych typów zaczynają się od "get".
 *    Metoda zwraca typ zgodny z typem pola.
 *
 * 4. Setter - nazwa metody ustawiającej wartość pola zaczyna się od "set".
 *    Metoda wymaga jednego parametru zgodnego typem z polem.
 *
 * 5. Po get/set/is używamy nazwy pola z wielkiej litery.
 */
public class SomeJavaBean {
    private int x;
    private int y;
    private boolean favourite;

    public boolean isFavourite() {
        return favourite;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public int getZ() {
        return doSth("GET http://");
    }

    public void setZ(int x) {
        doSth("POST http://");
    }

    private int doSth(String s) {
        // to tylko przykład ;)
        return 0;
    }


}