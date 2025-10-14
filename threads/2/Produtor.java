
import java.util.Random;

public class Produtor extends Thread {
	private Fila fila;

	public Produtor(Fila fila) {
		this.fila = fila;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 20; i++) {
				int rand = new Random().nextInt(101);
				fila.adicionar(rand);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}