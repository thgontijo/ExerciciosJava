package sobrecargametodos.domain;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public void imprime(){
        System.out.println("Aluno: " + nome);
        System.out.println("Seminario: " + this.seminario.getTitulo());

    }
}
