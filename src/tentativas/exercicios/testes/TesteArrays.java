package tentativas.exercicios.testes;

public class TesteArrays {
    public static void main(String[] args){
        int[] teste = new int[3];

        //opção 1

        for(int i = 0; i < teste.length; i++){
            teste[i] = (i * 823);
           System.out.println(teste[i]);
        }
        // Ou entao

        //opção 2

        for(int j:teste){
            System.out.println(j);
        }
    }
}

