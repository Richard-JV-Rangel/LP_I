public class Cidade {
    private String nome;
    private String pais;
    private int populacao;

    public Cidade(String nome, String pais, int populacao) {
        this.nome = nome;
        this.pais = pais;
        this.populacao = populacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void serTuristica() {
        System.out.println("A cidade de " + nome + " é um local turístico.");
    }
}