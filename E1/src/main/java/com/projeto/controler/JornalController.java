package com.projeto.controler;

import com.projeto.model.Cidade;
import com.projeto.model.CorpoDeAgua;
import com.projeto.model.Jornal;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class JornalController {
    @FXML
    private TextArea outputArea;

    private Jornal jornal = new Jornal();
    private Cidade cidade = new Cidade();
    private CorpoDeAgua corpoDeAgua = new CorpoDeAgua();

    @FXML
    public void initialize() {
        outputArea.setText("Painel 'Jornal' inicializado.\n\n");
    }

    @FXML void handleFlutuar() { outputArea.appendText("▶ Jornal: " + jornal.flutuar() + "\n"); }
    @FXML void handleSerTuristica() { outputArea.appendText("▶ Cidade: " + cidade.serTuristica() + "\n"); }
    @FXML void handleMovimentarAgua() { outputArea.appendText("▶ Água: " + corpoDeAgua.movimentar() + "\n"); }
}