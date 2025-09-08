public class Simbolo {
    private String nome;
    private String formato;
    private String cor;

    public Simbolo(String nome, String formato, String cor) {
        this.nome = nome;
        this.formato = formato;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void animar() {
        System.out.println("O símbolo " + nome + " está animando.");
    }

    public void mudarCor() {
        System.out.println("A cor do símbolo foi alterada.");
    }

    public void representarMarca() {
        System.out.println("O símbolo " + nome + " representa a marca.");
    }
}