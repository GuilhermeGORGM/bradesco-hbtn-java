
import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> todosAutores = new TreeSet<>();
        for (Post post : posts) {
            todosAutores.add(post.getAutor());
        }

        return todosAutores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagemPorCategoria = new TreeMap<>();

        for (Post post : posts) {
            if (contagemPorCategoria.containsKey(post.getCategoria())) {
                contagemPorCategoria.replace(post.getCategoria(), contagemPorCategoria.get(post.getCategoria()) + 1);
            } else {
                contagemPorCategoria.put(post.getCategoria(), 1);
            }
        }
        return contagemPorCategoria;
    }
}
