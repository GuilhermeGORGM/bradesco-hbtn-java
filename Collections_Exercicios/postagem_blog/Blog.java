
import java.util.*;
import java.util.stream.Collectors;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) throws Exception {
        if (posts.stream().anyMatch(p -> p.getAutor().equals(post.getAutor()) && p.getTitulo().equals(post.getTitulo()))) {
            throw new Exception("Postagem jah existente");
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> todosAutores = new TreeSet<>();
        for (Post post : posts) {
            todosAutores.add(post.getAutor());
        }

        return todosAutores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagemPorCategoria = new HashMap<>();

        for (Post post : posts) {
            if (contagemPorCategoria.containsKey(post.getCategoria())) {
                contagemPorCategoria.replace(post.getCategoria(), contagemPorCategoria.get(post.getCategoria()) + 1);
            } else {
                contagemPorCategoria.put(post.getCategoria(), 1);
            }
        }
        return contagemPorCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsPorAutor = new TreeSet<>();
        for (Post post : posts) {
            if (post.getAutor().equals(autor)) {
                postsPorAutor.add(post);
            }
        }

        return postsPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsPorCategoria = new TreeSet<>();
        for (Post post : posts) {
            if (post.getCategoria().equals(categoria)) {
                postsPorCategoria.add(post);
            }
        }
        //postsPorCategoria = posts.stream().filter(p -> p.getCategoria().equals(categoria)).collect(Collectors.toSet());

        return postsPorCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> todosPostsPorCategorias = new HashMap<>();
        for (Categorias categoria : Categorias.values()) {
            todosPostsPorCategorias.put(categoria, obterPostsPorCategoria(categoria));
        }

        return todosPostsPorCategorias;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPostsPorAutor = new TreeMap<>();

        for (Autor autor : obterTodosAutores()) {
            todosPostsPorAutor.put(autor, obterPostsPorAutor(autor));
        }

        return todosPostsPorAutor;
    }
}
