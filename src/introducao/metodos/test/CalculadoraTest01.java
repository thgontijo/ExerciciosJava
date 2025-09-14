package introducao.metodos.test;

import introducao.metodos.domain.Calculadora01;

public class CalculadoraTest01 {
    public static void main (String[]args){
        Calculadora01 calculadora = new Calculadora01();

        calculadora.SomaDoisNumeros();
        System.out.println("--------");
        calculadora.SubtraiDoisNumeros();
    }
}
