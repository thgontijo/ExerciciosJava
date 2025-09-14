package sobrecargametodos.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("Professor: " + nome);
        System.out.println("Especialiade: " + especialidade);

        for (Seminario seminarios : seminario) {
            System.out.println("Seminarios: " + seminarios.getTitulo());
        }

    }
}
