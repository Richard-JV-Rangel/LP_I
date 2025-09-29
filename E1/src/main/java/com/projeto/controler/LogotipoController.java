package com.projeto.controler;

import com.projeto.model.Mao;
import com.projeto.model.Simbolo;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class LogotipoController {
    @FXML
    private TextArea outputArea;

    private Simbolo simbolo = new Simbolo();
    private Mao mao = new Mao();

    @FXML
    public void initialize() {
        outputArea.setText("Painel 'Logotipo' inicializado.\n\n");
    }

    @FXML
    void handleAnimarSimbolo() {
        outputArea.appendText("▶ Simbolo: " + simbolo.animar() + "\n");
    }

    @FXML
    void handleMudarCorSimbolo() {
        outputArea.appendText("▶ Simbolo: " + simbolo.mudarCor() + "\n");
    }

    @FXML
    void handleRepresentarMarca() {
        outputArea.appendText("▶ Simbolo: " + simbolo.representarMarca() + "\n");
    }

    @FXML
    void handleClicarMao() {
        outputArea.appendText("▶ Mão: " + mao.clicar() + "\n");
    }

    @FXML
    void handleCurtirMao() {
        outputArea.appendText("▶ Mão: " + mao.curtir() + "\n");
    }

    @FXML
    void handleDigitarMao() {
        outputArea.appendText("▶ Mão: " + mao.digitar() + "\n");
    }
}