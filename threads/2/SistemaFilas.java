
public class SistemaFilas {
	public static void main(String[] args) {
		Fila fila = new Fila(10);

		// Criar e iniciar as threads do produtor e consumidor
		Produtor producer = new Produtor(fila);
		Consumidor consumer = new Consumidor(fila);
		Produtor producer2 = new Produtor(fila);
		Consumidor consumer2 = new Consumidor(fila);

		producer.start();
		consumer.start();
		producer2.start();
		consumer2.start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}
}
