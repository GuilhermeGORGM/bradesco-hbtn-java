
import java.util.HashMap;
import java.util.Map;

public abstract class Armazem<T> implements Armazenavel {
    Map<String, T> itensArmazenados = new HashMap<>();

    @Override
    public void adicionarAoInventario(String nome, Object valor) {
        itensArmazenados.put(nome, (T) valor);
    }

    @Override
    public T obterDoInventario(String nome) {
        return itensArmazenados.get(nome);
    }
}
