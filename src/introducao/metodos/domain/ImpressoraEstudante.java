package introducao.metodos.domain;

public class ImpressoraEstudante {
    public void imprime(EstudanteNome estudante){
        System.out.println("----------------------");
        System.out.println("Nome estudante: "+ estudante.nome);
        System.out.println("Idade estudante: "+ estudante.idade);
        System.out.println("Sexo estudante: "+ estudante.sexo);
    }
}
