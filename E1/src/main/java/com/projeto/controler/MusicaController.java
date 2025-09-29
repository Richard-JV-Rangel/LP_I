package com.projeto.controler;

import com.projeto.model.Crime;
import com.projeto.model.InstrumentoMusical;
import com.projeto.model.PessoaMusica;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MusicaController {
    @FXML
    private TextArea outputArea;

    private PessoaMusica pessoaMusica = new PessoaMusica();
    private Crime crime = new Crime();
    private InstrumentoMusical instrumentoMusical = new InstrumentoMusical();

    @FXML
    public void initialize() {
        outputArea.setText("Painel 'Música' inicializado.\n\n");
    }

    @FXML
    void handleCantar() {
        outputArea.appendText("▶ Pessoa: " + pessoaMusica.cantar() + "\n");
    }

    @FXML
    void handleCometerCrime() {
        outputArea.appendText("▶ Crime: " + crime.cometer() + "\n");
    }

    @FXML
    void handleTocarInstrumento() {
        outputArea.appendText("▶ Instrumento: " + instrumentoMusical.tocar() + "\n");
    }
}