package functional_programming.invincible;

public class Hilo extends Thread {

    private Hilo() {
    }

    public static Hilo createHilo() {
        return new Hilo();
    }

    public void run() {
		System.out.println("Hilo ejecutandose con clasa Thread");
	}
}