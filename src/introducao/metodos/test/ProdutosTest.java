package introducao.metodos.test;

import introducao.metodos.domain.Produtos;

public class ProdutosTest {
    public static void main(String[] args) {
        Produtos produtos1 = new Produtos();
        Produtos produtos2 = new Produtos("sabao", 19.90);
        Produtos produtos3 = new Produtos("Leite-condensado", 8.75, 150);

        produtos1.imprimir();
        System.out.println("-------------------");
        produtos2.imprimir();
        System.out.println("-------------------");
        produtos3.imprimir();

    }
}
