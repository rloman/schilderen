package nl.workingspirit.schilderen.flowcontrol;

public class SwitchTrainerApp {


    public static int getDaysOfMonth(int monthNumber) {

        switch (monthNumber){ // byte, short, (char), Wrappers(Integer, Double, ...)  int, String of (OCP) enum
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
              return 31;
            }
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11: {
                return 30;
            }
            default: {
               return -1;
            }
        }
    }

    public static void main(String[] args) {


       int r =  getDaysOfMonth(3);
        System.out.println(r);
        System.out.println();

        int age =10;

        final int testcase = 101;
        age = 120;

        switch (age) {
            default: {
                System.out.println("Onbekende leeftijd maar prima zo!");
            }
            case 10:{
                System.out.println("U bent 10");
                break;
            }
            case 11: {
                System.out.println("U bent 11");
                break;
            }
            case 12:
            case 13:
            case 14:
            case 15: {
                System.out.println("U bent lastig!");
                break;
            }
            case 65:
            case 66:
            case 67:
                System.out.println("U moet nog werken");
                break;
            case 68:
            case 69:
            case 70: {
                System.out.println("U hebt nu wel pensioen verdiend!");
                break;
            }
            case testcase :
                System.out.println("Testcase");
                break;


        }

    }
}
