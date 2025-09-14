package tentativas.exercicios.testes;

public class Arrays {
    public static void main(String[] args){
        int [] numeros = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}
