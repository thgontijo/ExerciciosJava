package introducao.metodos.test;

import introducao.metodos.domain.CalculadoraMetodos;

public class CalculadoraMetodoTest {
    public static void main(String[]args){
        CalculadoraMetodos calculadora = new CalculadoraMetodos();

        System.out.println(calculadora.somar(20, 30));
        System.out.println("---------------------");
        System.out.println(calculadora.somar(20.7, 30.22));
        System.out.println("---------------------");
        System.out.println(calculadora.somar(20, 40, 25));

    }
}
