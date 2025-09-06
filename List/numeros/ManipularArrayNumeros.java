
import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> lista, int numeroBusca) {
        return lista.indexOf(numeroBusca);
    }

    public static void adicionarNumero(List<Integer> lista, int numeroBusca) throws Exception {
        int posicao = buscarPosicaoNumero(lista, numeroBusca);
        if (posicao == -1) {
            lista.add(numeroBusca);
        } else {
            throw new Exception("Numero jah contido na lista");
        }
    }

    public static void removerNumero(List<Integer> lista, int numeroBusca) throws Exception {
        int posicao = buscarPosicaoNumero(lista, numeroBusca);
        if (posicao == -1)
            throw new Exception("Numero nao encontrado na lista");
        lista.remove(posicao);
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        int posicao = buscarPosicaoNumero(lista, numeroSubstituir);
        if (posicao == -1) {
            lista.add(numeroSubstituto);
        } else {
            lista.set(posicao, numeroSubstituto);
        }
    }
}
