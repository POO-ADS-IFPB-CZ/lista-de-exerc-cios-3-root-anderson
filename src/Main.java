public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma();

        Aluno a1 = new Aluno("Maria", 1001);
        a1.cadastrarNota(8.0f);
        a1.cadastrarNota(7.5f);
        a1.cadastrarNota(9.0f);

        Aluno a2 = new Aluno("João", 1002);
        a2.cadastrarNota(5.0f);
        a2.cadastrarNota(6.0f);
        a2.cadastrarNota(6.5f);

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        turma.listarAprovados();
        turma.listarReprovados();
    }
}
