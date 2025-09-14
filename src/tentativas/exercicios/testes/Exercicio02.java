package tentativas.exercicios.testes;

public class Exercicio02 {
    public static void main(String[] args) {
        double salarioAnualEmEuros = 38000;
        double impostoMenor = (salarioAnualEmEuros * (9.70 / 100));
        double impostoMedio = (salarioAnualEmEuros * (37.35 / 100));
        double impostoMaior = (salarioAnualEmEuros * (49.50 / 100));

        String mensagemValorImpostoMenor = "Voce tera que pagar 9.70% de imposto sobre seu salario anual, o que equivale a : " + (impostoMenor);
        String mensagemValorImpostoMedio = "Voce tera que pagar 37.35% de imposto sobre seu salario anual, o que equivale a : " + (impostoMedio);
        String mensagemValorImpostoMaior = "Voce tera que pagar 49.50% de imposto sobre seu salario anual, o que equivale a : " + (impostoMaior);

        if (salarioAnualEmEuros >= 0 && salarioAnualEmEuros <= 34712) {
            System.out.println(mensagemValorImpostoMenor);
        } else if (salarioAnualEmEuros > 34712 && salarioAnualEmEuros <= 68507) {
            System.out.println(mensagemValorImpostoMedio);
        } else {
            System.out.println(mensagemValorImpostoMaior);
        }

    }
}
