import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos;

    public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAprovados() {
        System.out.println("Alunos Aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.estaAprovado()) {
                System.out.println(aluno.getNome() + " - Média: " + aluno.calcularMedia());
            }
        }
    }

    public void listarReprovados() {
        System.out.println("Alunos Reprovados:");
        for (Aluno aluno : alunos) {
            if (!aluno.estaAprovado()) {
                System.out.println(aluno.getNome() + " - Média: " + aluno.calcularMedia());
            }
        }
    }
}
