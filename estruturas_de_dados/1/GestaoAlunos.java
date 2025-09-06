package estrutura_dados.list;

import java.util.ArrayList;
import java.util.List;

public class GestaoAlunos {
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void excluirAluno(String nome) {
        List<Aluno> alunoStream = alunos.stream().filter(aluno1 -> aluno1.getNome().equals(nome)).toList();
        if (!alunoStream.isEmpty())
            alunos.remove(alunoStream.get(0));
    }

    public void buscarAluno(String nome) {
        List<Aluno> alunoStream = alunos.stream().filter(aluno1 -> aluno1.getNome().equals(nome)).toList();
        if (!alunoStream.isEmpty())
            System.out.println(alunoStream.get(0).toString());
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.toString());
        }
    }
}
