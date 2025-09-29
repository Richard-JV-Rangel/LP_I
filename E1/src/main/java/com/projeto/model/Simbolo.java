package com.projeto.model;

public class Simbolo {
    private String nome = "Logo Empresa";

    public String animar() {
        return "O símbolo " + nome + " está animando.";
    }

    public String mudarCor() {
        return "A cor do símbolo foi alterada.";
    }

    public String representarMarca() {
        return "O símbolo " + nome + " representa a marca.";
    }
}