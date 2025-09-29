package com.projeto.model;

public class Notificacao {
    private int numero = 5;

    public String exibirContador() {
        return "Exibindo contador de notificação: " + numero;
    }

    public String piscar() {
        return "O ícone da notificação está piscando.";
    }

    public String sumir() {
        return "A notificação sumiu da tela.";
    }
}