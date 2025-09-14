package sobrecargametodos.test;

import sobrecargametodos.domain.Aluno;
import sobrecargametodos.domain.Local;
import sobrecargametodos.domain.Professor;
import sobrecargametodos.domain.Seminario;

import java.util.Scanner;

public class GerenciamentoTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Seminario seminario = new Seminario("algo");
        Professor professor = new Professor();
        Local local = new Local("ITB BELVAL");

        Seminario[] seminariosDisponiveis = {seminario};

        aluno.setSeminario(seminario);
        professor.setSeminario(seminariosDisponiveis);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[]{aluno});

        System.out.println("Digite o nome do aluno: ");
        aluno.setNome(entrada.nextLine());
        System.out.println("Digite a idade do aluno: ");
        aluno.setIdade(entrada.nextInt());
        entrada.nextLine();

        System.out.println("Digite o titulo do seminario: ");
        seminario.setTitulo(entrada.nextLine());

        System.out.println("Digite o nome do professor: ");
        professor.setNome(entrada.nextLine());

        System.out.println("Digite a especialidade do professor: ");
        professor.setEspecialidade(entrada.nextLine());

        aluno.imprime();
        System.out.println("--------------------------");
        seminario.imprime();
        System.out.println("--------------------------");
        professor.imprime();
        System.out.println("--------------------------");

        entrada.close();
    }
}
