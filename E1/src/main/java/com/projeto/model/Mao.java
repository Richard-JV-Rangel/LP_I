package com.projeto.model;

public class Mao {
    private String objeto = "Mouse";

    public String clicar() {
        return "A mão clicou no objeto " + objeto + ".";
    }

    public String curtir() {
        return "A mão curtiu o conteúdo.";
    }

    public String digitar() {
        return "A mão está digitando.";
    }
}