package nl.workingspirit.schilderen.equality;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        Car c = new Car("AABBCC");

        Car d = new Car("AABBCC");

        if(c.equals(d)) {
            System.out.println("Ze zijn gelijk!");
        }
        else {
            System.out.println("Ze zijn NIET gelijk!");
        }


        // dit is stom!, tenzij je de referenties (leash) met elkaar wilt
        // vergelijken!
        if(c == d) {
            System.out.println("De leash is ongelijk!");
        }
        else {
            System.out.println("natuurlijk is de leash niet gelijk!");
        }

        ArrayList<Car> autootjes = new ArrayList<>();
        autootjes.addAll(Arrays.asList(c,d));

        Car victim = new Car("AABBCCffdfdfdf");

        System.out.println(autootjes);

        autootjes.remove(victim);

        System.out.println(autootjes);

    }
}
