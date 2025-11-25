package com.atividade.e2.model;

public class PessoaMusica {
    private int id;
    private String nome;
    private String sentimento;
    private String papel; // Ex: Vocalista, Baterista

    // Construtor vazio (obrigatório para algumas libs)
    public PessoaMusica() {}

    // Construtor para criar novo (sem ID)
    public PessoaMusica(String nome, String sentimento, String papel) {
        this.nome = nome;
        this.sentimento = sentimento;
        this.papel = papel;
    }

    // Construtor completo (com ID, vindo do banco)
    public PessoaMusica(int id, String nome, String sentimento, String papel) {
        this.id = id;
        this.nome = nome;
        this.sentimento = sentimento;
        this.papel = papel;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSentimento() { return sentimento; }
    public void setSentimento(String sentimento) { this.sentimento = sentimento; }

    public String getPapel() { return papel; }
    public void setPapel(String papel) { this.papel = papel; }

    @Override
    public String toString() { return nome + " (" + papel + ")"; }

    // Método da E1
    public String cantar() {
        return this.nome + " está cantando com muito " + this.sentimento + " como " + this.papel + "!";
    }
}