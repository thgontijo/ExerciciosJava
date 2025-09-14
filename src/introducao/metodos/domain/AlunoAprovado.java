package introducao.metodos.domain;

public class AlunoAprovado {
    private String nome;
    private double nota1;
    private double nota2;

    public AlunoAprovado(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return ((nota1 + nota2) / 2);
    }

    public boolean foiAprovado() {
        System.out.println("Parabéns " + this.nome + ", voce foi aprovado!");
        return true;
    }

    public void foiReprovado() {
        System.out.println("Infelizmente " + this.nome + ", foi reprovado.");
    }
}
