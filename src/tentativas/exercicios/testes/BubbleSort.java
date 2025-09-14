package tentativas.exercicios.testes;

public class BubbleSort {
    public static void main(String[] args) {

        int[] numeros = {20, 23, 14, 11, 3};
        int aux;
        int n = numeros.length;

        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - j - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
            System.out.println();

        }
    }
}
