package com.projeto.model;

public class Piano {

    private String cor = "Preto";
    private int teclas = 9;
    public String emitirSom() {
        return "O piano de cor "+cor+" está emitindo som da nota "+teclas+".";
    }

    public String abrirTampa() {
        return "A tampa do piano tem sua cor "+cor+" foi aberta.";
    }

    public String suportarPeso() {
        return "O piano suporta um certo peso.";
    }
}