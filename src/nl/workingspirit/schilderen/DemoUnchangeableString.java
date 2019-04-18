package nl.workingspirit.schilderen;

public class DemoUnchangeableString {


    public static void main(String[] args) {

        String s = "     Deventer     ";

        s = s.toUpperCase();

        System.out.println(s);


        System.out.println(s.charAt(5));


        s = s.trim();

        System.out.println(">"+s+"<");

        String city = "Amersfoort";

        String sub = city.substring(0, 5);

        System.out.println(sub);

        System.out.println(city.substring(0, 5));

        System.out.println(city.substring(5, 8));
    }
}
