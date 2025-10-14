
public class Principal {

	public static void main(String[] args) {
		Contador count = new Contador();
		ThreadContador thread1 = new ThreadContador(count);
		ThreadContador thread2 = new ThreadContador(count);

		thread1.run();
		thread2.run();

		System.out.println("Valor final do contador: " + count.getContagem());
	}

}
