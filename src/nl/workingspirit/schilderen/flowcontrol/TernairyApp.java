package nl.workingspirit.schilderen.flowcontrol;

public class TernairyApp {

    public static void main(String[] args) {

        // category Junior / Senior based on age 0..40..80

        // normal if else
        {
            int age = 45;
            String label = null;
            if (age < 40) {
                label = "Junior";
            } else {
                label = "Senior";
            }
        }

        // terniary // be aware of making this code too complex
        {
            int age = 45;
            String label = age < 45 ? "Junior" : age < 80 ? "Senior" : "Bejaard";
        }

    }
}
