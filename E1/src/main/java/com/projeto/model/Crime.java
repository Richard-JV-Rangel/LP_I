package com.projeto.model;

public class Crime {
    private String tipo = "Assalto";
    private String local = "Banco";

    public String cometer() {
        return "Um crime do tipo " + tipo + " foi cometido no " + local + ".";
    }
}