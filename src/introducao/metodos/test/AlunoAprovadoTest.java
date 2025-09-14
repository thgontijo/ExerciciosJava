package introducao.metodos.test;

import introducao.metodos.domain.AlunoAprovado;

public class AlunoAprovadoTest {
    public static void main(String[]args){
        AlunoAprovado aluno1 = new AlunoAprovado("Thyago");
        AlunoAprovado aluno2 = new AlunoAprovado("Fulano");

        aluno1.setNota1(10);
        aluno1.setNota2(9);

        aluno2.setNota1(7);
        aluno2.setNota2(5);

        double resultado = aluno1.calcularMedia();
        if(resultado >= 7){
            aluno1.foiAprovado();
        }else{
            aluno1.foiReprovado();
        }

        System.out.println("------------------------");

        double resultado2 = aluno2.calcularMedia();
        if(resultado2 >= 7){
            aluno2.foiAprovado();
        }else{
            aluno2.foiReprovado();
        }
    }
}
