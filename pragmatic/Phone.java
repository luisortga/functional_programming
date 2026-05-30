package functional_programming.pragmatic;

public class Phone implements Locatable {

    String name;
    public Phone(String name) {
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
