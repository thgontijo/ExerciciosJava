package introducao.metodos.domain;

public class MediaFinal {
    private String nomeAluno;
    private double notaFinal;
    private double pesoSete;
    private double pesoNove;
    private double atitudinal;

    public double getAtitudinal() {
        return atitudinal;
    }

    public void setAtitudinal(double atitudinal) {
        this.atitudinal = atitudinal;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double getPesoSete() {
        return pesoSete;
    }

    public void setPesoSete(double pesoSete) {
        this.pesoSete = pesoSete;
    }

    public double getPesoNove() {
        return pesoNove;
    }

    public void setPesoNove(double pesoNove) {
        this.pesoNove = pesoNove;
    }

    public double mediaFinal(double pesoSete, double pesoNove, double atitudinal){
        this.notaFinal = (((pesoSete + pesoNove)/2) + atitudinal);
        return notaFinal;
    }

    public void imprime() {
        System.out.println("Nome: " + this.nomeAluno);
        System.out.println("Media final: " + this.notaFinal);
    }
}
