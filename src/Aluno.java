import java.util.ArrayList;

public class Aluno {
    private String nome;
    private int matricula;
    private ArrayList<Float> notas;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }

    public boolean cadastrarNota(float nota) {
        if (notas.size() < 4) {
            notas.add(nota);
            return true;
        }
        return false;
    }

    public float calcularMedia() {
        if (notas.isEmpty()) return 0;

        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}
