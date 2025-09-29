package com.projeto.model;

public class Video {
    private String titulo = "Nuvole Bianche";

    public String reproduzir() {
        return "O vídeo '" + titulo + "' está sendo reproduzido.";
    }

    public String pausar() {
        return "O vídeo '" + titulo + "' foi pausado.";
    }

    public String avancar() {
        return "O vídeo '" + titulo + "' está avançando.";
    }
}