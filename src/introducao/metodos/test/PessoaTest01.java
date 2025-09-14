package introducao.metodos.test;

import introducao.metodos.domain.Pessoa01;

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Pessoa01 pessoa = new Pessoa01();

        System.out.println("Digite seu nome: ");
        pessoa.setNome(entrada.nextLine());

        System.out.println("Digite sua idade: ");
        pessoa.setIdade(entrada.nextInt());
        entrada.nextLine();

        System.out.println("-------------------------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        entrada.close();
    }
}
