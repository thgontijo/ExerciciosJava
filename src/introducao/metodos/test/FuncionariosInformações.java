package introducao.metodos.test;

import introducao.metodos.domain.Funcionario01;
import introducao.metodos.domain.FuncionarioDados;

import java.util.Scanner;

public class FuncionariosInformações {
    public static void main(String[] args) {
        FuncionarioDados funcao = new FuncionarioDados();
        Funcionario01 funcionarioDados = new Funcionario01();
        Scanner entrada = new Scanner(System.in);
        int[] salarioArray = new int[3];
        int i;
        int b = 1;

        System.out.println("Digite o nome do funcionário: ");
        funcionarioDados.nome = entrada.nextLine();

        System.out.println("Digite a idade do funcionário: ");
        funcionarioDados.idade = entrada.nextInt();
        entrada.nextLine();
        for (i = 0; i < 3; i++) {
            b = 1 + i;
            System.out.println("Digite o valor do " + b + " mês de salário: ");
            funcionarioDados.salario[i] = entrada.nextDouble();
            entrada.nextLine();
        }
        funcao.ImprimeDados(funcionarioDados);
        System.out.println("---------------------");
        funcao.MediaSalarios(funcionarioDados);
        entrada.close();
    }
}