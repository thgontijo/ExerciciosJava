package introducao.metodos.domain;

//3. Classe Produto (sobrecarga de construtores)
//
//Crie a classe Produto com os atributos privados:
//
//nome (String)
//
//preco (double)
//
//quantidade (int)
//
//Implemente:
//
//Construtor sem parâmetros (atribui valores padrão).
//
//Construtor que recebe apenas nome e preco.
//
//Construtor que recebe nome, preco e quantidade.
//
//        No main, crie objetos com cada construtor e exiba os valores.
public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos() {
        this("Sem nome", 0, 0);
    }

    public Produtos(String nome, double preco) {
        this(nome, preco, 0);
    }

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }

}

