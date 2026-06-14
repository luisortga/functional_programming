package functional_programming.invincible;

public class LogicSurf {

    public LogicSurf() {}

    public LogicSurf(Hilo hilo) {
        Hilo.count();

        //
    }

    public void basic_structure() {
        Hilo.count();
    }

    public void model(int key) {
        //
        if (key >= 0) {
            Hilo.count();
            System.out.println("Successful");
        } else {
            // pending
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Course of logics";
    }
}
