package nl.workingspirit.schilderen.arraylist;

import sun.misc.ClassLoaderUtil;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{1,2,3};


        ArrayList<Integer> getallenLijst = new ArrayList<>();

        getallenLijst.add(3);
        getallenLijst.add(5);
        getallenLijst.add(10);

        getallenLijst.addAll(Arrays.asList(numbers));
        getallenLijst.add(0, 15);

//        getallenLijst.add("Poedel"); // => vout

        for(int element: getallenLijst) {
            System.out.println(element);
        }

        getallenLijst.remove(1); // => removes element at index 1

        getallenLijst.remove(new Integer(3)); // => trick to remove the number 3 out of the getallenlijst
        System.out.println(getallenLijst);


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mark", "Eline", "Mark"));

        while(names.contains("Mark")) {
            names.remove("Mark");
        }



        System.out.println(names);

        System.out.println(names.size());
        System.out.println(names.isEmpty());
        names.remove("Eline");
        System.out.println(names.isEmpty());

        names.addAll(Arrays.asList("Poedel", "Boxer", "Herder"));

        System.out.println(names);
        ArrayList<String> victims = new ArrayList<>();
        victims.add("Poedel");
        victims.add("Herder");
        names.removeAll(victims);

        names.clear();

    }
}
