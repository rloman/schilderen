package nl.workingspirit.schilderen.loops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicLoopApp {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (i == 1) {
                break;
            }
            System.out.println(numbers[i]);
        }


        pietersen:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ( j == 5) {
                    break pietersen;
                }
                System.out.println("Het produkt van " + i + " en " + j + "=" + i * j);
            }
        }

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(Arrays.asList(0,1,1,2,3,5));
        for(int element: numberList) {
            System.out.println(element);
            if(element == 3) {
//                numberList.remove(6); // vout
            }
        }
    };
}
