package introducao.metodos.domain;

public class Escola {
    private String nome;
    Professor[] professor;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    public void imprime() {
        System.out.println("Escola: " + nome);
        if (professor == null) return;

        System.out.println("Professores:");
        for (Professor prof : professor) {
            if (prof != null) {
                System.out.println("- " + prof.getNome());
            }
        }
    }
}