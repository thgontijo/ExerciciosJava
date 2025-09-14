package sobrecargametodos.domain;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("Seminário: " + titulo);
        System.out.println("Local: " + local.getEndereco());
        if (alunos == null) {
            return;
        }
        for (Aluno aluno : alunos) {
            System.out.println("Alunos: " + aluno.getNome());
        }
    }
}
