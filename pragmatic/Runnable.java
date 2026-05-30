package functional_programming.pragmatic;

import java.util.ArrayList;
import java.util.List;

public class Runnable {

    public static void main(String[] args) {

        List<Locatable> items = new ArrayList<>();
        items.add(new Car("rimac"));
        items.add(new Phone("Samsung"));
    }
}
