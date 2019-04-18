package nl.workingspirit.schilderen.equality;

public class Car {

    private String licensePlate;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }


    @Override
    public boolean equals(Object o) {

        Car d = (Car) o;

        if(this.licensePlate.equals(d.licensePlate)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return licensePlate != null ? licensePlate.hashCode() : 0;
    }
}
