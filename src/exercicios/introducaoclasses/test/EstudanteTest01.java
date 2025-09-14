package exercicios.introducaoclasses.test;

import exercicios.introducaoclasses.domain.Estudante01;

public class EstudanteTest01 {
    public static void main (String[]args){
        Estudante01 estudante = new Estudante01();
        estudante.nome = "Thyago";
        estudante.idade = 15;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
