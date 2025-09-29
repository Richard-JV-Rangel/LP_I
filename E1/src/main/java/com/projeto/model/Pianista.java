package com.projeto.model;

public class Pianista {
    private String nome = "Ludovico";

    public String tocarMusica() {
        return nome + " está tocando uma música com habilidade incrível.";
    }

    public String improvisar() {
        return nome + " está improvisando.";
    }

    public String virarDeCostas() {
        return nome + " virou de costas.";
    }
}