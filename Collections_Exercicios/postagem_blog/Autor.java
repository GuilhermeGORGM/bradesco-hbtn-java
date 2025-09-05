
public class Autor implements  Comparable<Autor>{
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public int compareTo(Autor o) {
        int nomeComp = this.nome.compareToIgnoreCase(o.nome);
        if (nomeComp != 0) {
            return nomeComp;
        }
        return this.sobrenome.compareToIgnoreCase(o.sobrenome);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Autor)) return false;
        Autor autor = (Autor) o;
        return nome.equalsIgnoreCase(autor.nome) &&
                sobrenome.equalsIgnoreCase(autor.sobrenome);
    }
}
