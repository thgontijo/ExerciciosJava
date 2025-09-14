package introducao.metodos.test;

import introducao.metodos.domain.EstudanteNome;
import introducao.metodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args){
        EstudanteNome estudante1 = new EstudanteNome();
        EstudanteNome estudante2 = new EstudanteNome();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Thyago S. Gontijo";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Fulano R. Silva";
        estudante2.idade = 22;
        estudante2.sexo = 'M';

        impressora.imprime(estudante1);

        impressora.imprime(estudante2);
    }
}
