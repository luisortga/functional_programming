package functional_programming.pragmatic;

public class Car implements Locatable{
    public String name;
    public Car(String name) {
        this.name = name;
    }

    @Override
    public Coordinate getLocation() {
        return null;
    }

    @Override
    public boolean locationIsValid() {
        return false;
    }
}
