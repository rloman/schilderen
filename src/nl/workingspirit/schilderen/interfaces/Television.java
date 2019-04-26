package nl.workingspirit.schilderen.interfaces;

public interface Television {

    /*  impliciet: public static final */ double VAT_PERCENTAGE = 0.21;

    public abstract void on(); // public abstract mag hier weg. is impliciet.
    void off();
    int switchChannel(int newChannel);
    int getCurrentChannel();
    double getPrice();

    default String getCountry() {
        return "NL";
    }

    default String getCurrency() {
        return "$";
    }
}
