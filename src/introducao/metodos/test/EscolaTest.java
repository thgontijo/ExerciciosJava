package introducao.metodos.test;

import introducao.metodos.domain.Escola;
import introducao.metodos.domain.Professor;

public class EscolaTest {
    public static void main(String[] args){
        Professor professor1 = new Professor("Girafalis");
        Professor professor2 = new Professor("Fulano");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("ITB", professores);

        escola.imprime();
    }
}
