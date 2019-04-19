package nl.workingspirit.schilderen.blackjack;

public class ShowHowToAddSomeToHand {

    public static void main(String[] args) {

        String[] kaarten = {"HartenBoer"};

        Hand h = new Hand();

        h.voegKaartenToe(kaarten);

        h.voegPoedelToe(new Poedel());

        System.out.println(h.poedel.name);


    }
}


class Hand {

    String[] mijnKaarten;
     Poedel poedel;

    public void voegKaartenToe(String[] kaarten) {
        this.mijnKaarten = kaarten;
    }

    public void voegPoedelToe(Poedel poedel) {
        this.poedel = poedel;
    }
}

class Poedel {

    String name = "Wodan";
}