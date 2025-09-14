package tentativas.exercicios.testes;

public class ArraysMultidimencionais {
    public static void main(String[] args){
        int[][] teste = new int[3][3];

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                teste[i][j] = (j * 12);
            }
        }
        for(int[] num:teste) {
            for (int linha : num) {
                System.out.println(linha + " ");
            }
            System.out.println();
        }
    }
}
