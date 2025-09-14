package exercicios.introducaoclasses.test;

import exercicios.introducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Captiva";
        carro1.ano = 2010;
        carro1.modelo = "Sedan";

        carro2.nome = "S10";
        carro2.ano = 1999;
        carro2.modelo = "Pick-Up";

        System.out.println(carro1.nome);
        System.out.println(carro1.ano);
        System.out.println(carro1.modelo);

        System.out.println("------------------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.ano);
        System.out.println(carro2.modelo);
    }
}
