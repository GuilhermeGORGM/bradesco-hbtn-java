
import java.util.LinkedList;

public class Fila {
	private int capacidade;
	private LinkedList<Integer> fila = new LinkedList<>();

	public Fila(int capacidade) {
		super();
		this.capacidade = capacidade;
	}

	public synchronized void adicionar(int item) throws InterruptedException {
		while (this.fila.size() >= capacidade) {
			wait();
		}
		this.fila.add(item);
		System.out.println("Produtor produziu: " + fila);

		notifyAll();
	}

	public synchronized int retirar() throws InterruptedException {
		while (this.fila.size() == 0) {
			wait();
		}
		int consumido = this.fila.removeLast();
		System.out.println("Consumidor consumiu: " + consumido);

		notifyAll();

		return consumido;
	}
}
