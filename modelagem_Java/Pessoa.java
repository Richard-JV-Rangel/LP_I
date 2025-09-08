public class Pessoa {
    private String nome;
    private String roupa;
    private String posicao;

    public Pessoa(String nome, String roupa, String posicao) {
        this.nome = nome;
        this.roupa = roupa;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRoupa() {
        return roupa;
    }

    public void setRoupa(String roupa) {
        this.roupa = roupa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void interagir() {
        System.out.println(nome + " está interagindo.");
    }
}