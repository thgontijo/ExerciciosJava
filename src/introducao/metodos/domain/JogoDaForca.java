package introducao.metodos.domain;

public class JogoDaForca {
    private String palavra;
    public String[] letras;
    public String tentativa;

    public String getPalavra() {
        return palavra;
    }

    public int setPalavra(String palavra) {
        this.palavra = palavra;
        letras = new String[palavra.length()];
        for (int i = 0; i < palavra.length(); i++) {
            letras[i] = String.valueOf(palavra.charAt(i));
        }
        return palavra.length();
    }


}
