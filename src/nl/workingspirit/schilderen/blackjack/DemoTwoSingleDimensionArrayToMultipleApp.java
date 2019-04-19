package nl.workingspirit.schilderen.blackjack;

import java.util.Random;

class Card {
    String beeld;
    int number;

    public int getPoints() {
        switch (this.number) {
            case 13:
                return 11;
            case 12:
                return 10;

            default: {
                return this.number;
            }
        }
    }
}

public class DemoTwoSingleDimensionArrayToMultipleApp {

    public static void main(String[] args) {
        String[] beelden = new String[]{"Harten", "Ruiten", "Schoppen", "Klaveren"};
        int[] nummers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        String[][] deck = new String[4][13];

        Card[] cards = new Card[52];

        for (int i = 0; i < beelden.length; i++) {
            for (int j = 0; j < nummers.length; j++) {
                deck[i][j] = beelden[i] + " " + nummers[j];
                Card card = new Card();
                card.beeld = beelden[i];
                card.number = nummers[j];

                System.out.println("Card with number:" + card.number + " has points: " + card.getPoints());

//                System.out.println(card.getPoints());

                System.out.println(deck[i][j]);
                String value = deck[i][j];
                value = value.replace("Harten", "")
                        .replace("Ruiten", "")
                        .replace("Schoppen", "")
                        .replace("Klaveren", "");
                int waarde = Integer.parseInt(value.trim());
                System.out.println("De waarde is: " + waarde + " en de kaart is nog steeds: " + deck[i][j]);

            }
        }


        // print the deck
        for (String[] first : deck) {
            for (String kaart : first) {
                System.out.println(kaart);

            }
        }

        // shuffle the deck
        Random random = new Random();
        for (int i = 0; i < beelden.length; i++) {
            for (int j = 0; j < nummers.length; j++) {
                deck[i][j] = deck[random.nextInt(beelden.length)][random.nextInt(nummers.length)];
            }
        }

        System.out.println();
        // print the deck
        for (String[] first : deck) {
            for (String kaart : first) {
                System.out.println(kaart);

            }
        }
    }
}
