package nl.workingspirit.schilderen.interfaces.exam;

import java.util.ArrayList;



public class App {

    public static void main(String[] args) {

        Interviewer i;
//        i = new Interviewer(); // fout. You cannot instantiate an interface
        i = new EvaJinek();

        Interviewer[] kletsers = new Interviewer[] { // OK. We are creating an Interviewer ARRAY here!
                i,
                new EvaJinek(),
        };

        ArrayList l;

        String voornaam;

        Exception e;

    }
}


class EvaJinek implements Interviewer {

    @Override
    public String talk() {
        return "Gelul in de ruimte ...";
    }
}