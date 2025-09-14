package introducao.metodos.domain;

public class FuncionarioDados {
    public void ImprimeDados(Funcionario01 funcionarioDados) {
        System.out.println(funcionarioDados.nome);
        System.out.println(funcionarioDados.idade);

        for (int i = 0; i < 3; i++) {
            int b = 1 + i;
            System.out.println("Valor do " + b + " mês de salário: " + funcionarioDados.salario[i]);
        }
    }

    public void MediaSalarios(Funcionario01 funcionarioDados) {
        double mediaSalarios = ((funcionarioDados.salario[0] + funcionarioDados.salario[1] + funcionarioDados.salario[2]) / 3);
        System.out.printf("A média dos três meses de salários é de: %.2f\n" , mediaSalarios);
    }
}