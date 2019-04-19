package nl.workingspirit.schilderen.flowcontrol;

import javax.sound.midi.Soundbank;

public class IfElseTrainerApp {

    public static void main(String[] args) {

        int age = 51;

        if (age == 50) {
            System.out.println("Vlucht ...");
        } else {
            if (age == 52) {
                System.out.println("En drink bier ...");
            }
        }


    }
}
