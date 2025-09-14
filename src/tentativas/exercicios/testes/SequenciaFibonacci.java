package tentativas.exercicios.testes;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        long aux = 0L;
        long nf = 0L;
        long aux2 = 1L;

        for (int i = 0; i <= 100; i++) {
            aux = nf;
            System.out.println(nf);
            nf = aux2;
            aux2 = aux2 + aux;
        }
    }
}
