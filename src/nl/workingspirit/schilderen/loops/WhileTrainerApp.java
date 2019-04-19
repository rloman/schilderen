package nl.workingspirit.schilderen.loops;

public class WhileTrainerApp {

    public static void main(String[] args) {
        // 2 versies
        // while   => 0 of vaker
        // do while => 1 of vaker


        System.out.println("Eerst de while");

        int aantalKwasten = 0;

        while (aantalKwasten++ < 15) {

            System.out.println("Ik heb nu " + aantalKwasten + " kwasten.");
            if (aantalKwasten == 13) {
                continue;
            }
            aantalKwasten++;

        }


        System.out.println("Nu de do while ... ");

        aantalKwasten = 100;
        kwast:
//        int a =3 ; // Compile error, unable to declare a variable JUST after a label
        System.out.println(3);
        do {
            System.out.println("Ik heb nu " + aantalKwasten + " kwasten.");
            aantalKwasten++;
        }
        while (aantalKwasten < 15);
    }
}
