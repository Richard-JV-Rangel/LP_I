package com.projeto.model;

public class PessoaMusica {
    private String nome = "Freddie Mercury";
    private String sentimento = "Drama";

    public String cantar() {
        return nome + " está cantando com o sentimento de " + sentimento + ".";
    }
}