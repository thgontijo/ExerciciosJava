package introducao.metodos.domain;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void imprime() {
        System.out.println(nome);
        if (time != null) {
            System.out.println(time.getNome());
        }
    }
}
