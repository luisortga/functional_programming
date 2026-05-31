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

    public boolean isOverclocked() {
        return false;
    }

    @Override
    public boolean locationIsValid() {
        return false;
    }

    @Override
    public String toString() {
        return "mobile with snapdragon Gen 8 " + this.name;
    }
}
