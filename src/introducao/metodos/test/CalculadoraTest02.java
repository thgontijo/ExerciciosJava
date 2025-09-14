package introducao.metodos.test;

import introducao.metodos.domain.Calculadora01;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora01 calculadora = new Calculadora01();

        calculadora.MultiplicaDoisNumeros(20, 30);

     int   result = calculadora.SomaValor(20, 30);
     System.out.println(result);
    }
}
