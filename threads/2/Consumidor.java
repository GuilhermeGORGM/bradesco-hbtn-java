
public class Consumidor extends Thread {
	private Fila fila;

	public Consumidor(Fila fila) {
		this.fila = fila;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 20; i++) {
				fila.retirar();
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}