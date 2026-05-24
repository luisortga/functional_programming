package functional_programming.invincible;

public class Hilo extends Thread {
    public static int iterador = 0;
    private Hilo() {
    }

    public static Hilo createHilo() {
        return new Hilo();
    }

    public void run() {
		System.out.println("Hilo ejecutandose con clasa Thread");

		// class Runnable
	}

    public static int count() {
        Hilo hilo = Hilo.createHilo();
        Hilo.iterador += 1;
        return Hilo.iterador;
    }

	@Override
	public String toString() {
		return super.toString();
	}
}