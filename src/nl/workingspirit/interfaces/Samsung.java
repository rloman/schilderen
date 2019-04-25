package nl.workingspirit.interfaces;

public class Samsung implements Television {

    private boolean on;
    private int currentChannel;
    private double price = 750.00;

    @Override
    public void on() {

        this.on = true;
        System.out.println("The Samsung Television is now on!");

    }

    @Override
    public void off() {
        this.on = false;
        System.out.println("The Samsung Television is now off!");

    }

    @Override
    public int switchChannel(int newChannel) {
        this.currentChannel = newChannel;

        return this.currentChannel;
    }

    @Override
    public int getCurrentChannel() {
        return this.currentChannel;
    }

    public double getPrice() {
        return this.price + this.price * Television.VAT_PERCENTAGE;
    }
}
