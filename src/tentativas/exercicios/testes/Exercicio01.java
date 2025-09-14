package tentativas.exercicios.testes;

public class Exercicio01 {
    public static void main(String[] args) {
        double salario = 4900;
        double valorDaDoacao = 600;
        double dezpPorcentoSalario = (salario / 10);
        boolean issalarioQuePossaDoar = (dezpPorcentoSalario >= valorDaDoacao);
        if (issalarioQuePossaDoar) {
            System.out.println("Com o salario que voce tem, voce consegue fazer essa doação.");
        } else {
            System.out.println("Com o salario que voce tem, voce nao consegue fazer essa doação.");
        }
        //Outra forma de fazer isso usando operador ternario

        double salario1 = 4900;
        double valorDoacao1 = 600;
        double dezPorcentosalario1 = (salario1 / 10);
        String mensagemNaoDoar = "Infelizmente voce nao tem condiçoes para realizar a doaçao.";
        String mensagemDoar = "Muito obrigado! Voce realizou a doação.";
        String doaOuNaoDoa = (dezPorcentosalario1 >= valorDoacao1) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(doaOuNaoDoa);
    }
}
