
public class Principal {

	public static void main(String[] args) {
		Contador count = new Contador();
		ThreadContador thread1 = new ThreadContador(count);
		ThreadContador thread2 = new ThreadContador(count);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Valor final do contador: " + count.getContagem());
	}

}
