public class PessoaMusica {
    private String nome;
    private int idade;
    private String sentimento;

    public PessoaMusica(String nome, int idade, String sentimento) {
        this.nome = nome;
        this.idade = idade;
        this.sentimento = sentimento;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getSentimento() { return sentimento; }
    public void setSentimento(String sentimento) { this.sentimento = sentimento; }

    public void cantar() {
        System.out.println(nome + " está cantando com o sentimento de " + sentimento + ".");
    }
}