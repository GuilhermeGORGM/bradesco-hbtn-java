
public class Numero {
    public static void dividir(int a, int b) {
        int total = 0;
        try {
            total = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Nao eh possivel dividir por zero");
        } finally {
            System.out.println(a + " / " + b + " = " + total);
        }
    }
}
