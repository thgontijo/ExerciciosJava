package introducao.metodos.test;

import introducao.metodos.domain.ContaBancaria02;

import java.util.Scanner;

public class PainelBancarioTest {
    public static void main(String[] args) {
        ContaBancaria02 banco = new ContaBancaria02("26102009", 2000);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma opção: ");
        System.out.println("1. depósito.");
        System.out.println("2. saque.");
        System.out.println("3. consultar saldo.");

        int choice = entrada.nextInt();
        entrada.nextLine();

        switch (choice) {

            case 1:
                System.out.println("Digite o valor que deseja depositar: ");
                banco.depositar(entrada.nextDouble());
                entrada.nextLine();
                banco.imprimir();;
                break;

            case 2:
                System.out.println("Digite o valor que deseja sacar: ");
                banco.sacar(entrada.nextDouble());
                entrada.nextLine();
                banco.imprimir();
                break;

            case 3:
                System.out.println("Seu saldo: " + banco.getSaldo());
                break;

            default:
                System.out.println("Valor inválido!");
        }
        entrada.close();
    }
}
