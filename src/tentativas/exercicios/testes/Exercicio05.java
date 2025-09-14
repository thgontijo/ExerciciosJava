package tentativas.exercicios.testes;

public class Exercicio05 {
    public static void main(String[] args) {
        double valorDoCarro = 45300;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorDaParcela = valorDoCarro / parcela;
            if (valorDaParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$ " + valorDaParcela);
            }
        }

    }
}

