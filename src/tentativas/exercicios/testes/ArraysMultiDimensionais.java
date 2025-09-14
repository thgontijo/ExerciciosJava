package tentativas.exercicios.testes;

public class ArraysMultiDimensionais {
    public static void main(String[] args) {
        int[][] array = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + 1;
                System.out.println(array[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("------------------------------------");
        //foreach

        for (int[] arrayBase : array) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
            System.out.println(" ");
        }
    }
}
