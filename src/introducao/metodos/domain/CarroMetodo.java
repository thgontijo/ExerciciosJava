package introducao.metodos.domain;

public class CarroMetodo {
    private String marca;
    private String modelo;
    private int ano;

    public CarroMetodo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 2000) {
            System.out.println("O carro deve ser anos 2000 para frente!");
        } else {
            this.ano = ano;
        }
    }
}
