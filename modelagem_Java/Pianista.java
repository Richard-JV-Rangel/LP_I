public class Pianista {
    private String nome;
    private String roupa;
    private String habilidade;

    public Pianista(String nome, String roupa, String habilidade) {
        this.nome = nome;
        this.roupa = roupa;
        this.habilidade = habilidade;
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

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public void tocarMusica() {
        System.out.println(nome + " está tocando uma música com habilidade " + habilidade + ".");
    }

    public void improvisar() {
        System.out.println(nome + " está improvisando.");
    }

    public void virarDeCostas() {
        System.out.println(nome + " virou de costas.");
    }
}