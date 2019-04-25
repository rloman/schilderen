package nl.workingspirit.schilderen.zoo;

public abstract class Animal {

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void eat();

}
