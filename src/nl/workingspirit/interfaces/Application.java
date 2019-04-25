package nl.workingspirit.interfaces;

public class Application {

    public static void main(String[] args) {
        Television myTelevision = new Samsung();

        myTelevision.on();
        myTelevision.switchChannel(3);

        System.out.println(myTelevision.getCurrentChannel());
        myTelevision.off();

        System.out.println("The price of myTelevision is: "+myTelevision.getPrice());

    }
}
