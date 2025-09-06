
public class Post implements Comparable<Post> {
    @Override
    public int compareTo(Post o) {
        int tituloComp = this.titulo.compareToIgnoreCase(o.titulo);
        if (tituloComp != 0) {
            return tituloComp;
        }
        return this.categoria.toString().compareToIgnoreCase(o.categoria.toString());
    }

    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}
