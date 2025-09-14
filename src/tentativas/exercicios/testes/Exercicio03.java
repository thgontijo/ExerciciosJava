package tentativas.exercicios.testes;

public class Exercicio03 {
    public static void main(String[] args) {
        byte numeroDoDia = 1;
        //domingo == 1;
        switch (numeroDoDia) {
            case 1:
                System.out.println("Domingo, não é dia útil.");
                break;
            case 2:
                System.out.println("Segunda-feria, é um dia útil.");
                break;
            case 3:
                System.out.println("Terça-feira, é um dia útil.");
                break;
            case 4:
                System.out.println("Quarta-feira, é um dia útil.");
                break;
            case 5:
                System.out.println("Quinta-feira, é um dia útil.");
                break;
            case 6:
                System.out.println("Sexta-feira, é um dia útil.");
                break;
            case 7:
                System.out.println("Sábado, não é um dia útil.");
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
