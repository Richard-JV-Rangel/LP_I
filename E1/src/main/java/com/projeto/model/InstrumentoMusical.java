package com.projeto.model;

public class InstrumentoMusical {
    private String tipo = "Guitarra";

    public String tocar() {
        return "O instrumento do tipo " + tipo + " está sendo tocado.";
    }
}