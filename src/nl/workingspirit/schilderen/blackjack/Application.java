package nl.workingspirit.schilderen.blackjack;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Kaart> stock = new ArrayList<>();
        stock.add(new Kaart(1));

        stock.add(new Kaart(2));

        System.out.println(stock);

        Kaart newKaart = new Kaart(2);
        if(!stock.contains(newKaart)) {
            stock.add(newKaart);
        }
        else {
            System.out.println("Deze kaart zit al in de stock!");
        }

    }
}


class Kaart {

    int nr;

    public Kaart(int nr) {
        this.nr = nr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kaart kaart = (Kaart) o;

        return nr == kaart.nr;
    }

    @Override
    public String toString() {
        return "Kaart{" +
                "nr=" + nr +
                '}';
    }

    @Override
    public int hashCode() {
        return nr;
    }
}