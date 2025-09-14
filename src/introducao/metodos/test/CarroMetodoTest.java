package introducao.metodos.test;

import introducao.metodos.domain.CarroMetodo;

import java.util.Scanner;

public class CarroMetodoTest {
    public static void main(String[] args){
        CarroMetodo carro = new CarroMetodo("Mercedes", "320i", 2019);
        Scanner entrada = new Scanner(System.in);

        carro.exibirDados();
        System.out.println("Digite o ano do carro: ");
        carro.setAno(entrada.nextInt());
        entrada.nextLine();

        entrada.close();
    }
}
