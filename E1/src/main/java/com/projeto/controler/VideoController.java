package com.projeto.controler;

import com.projeto.model.Pianista;
import com.projeto.model.Piano;
import com.projeto.model.Video;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class VideoController {
    @FXML
    private TextArea outputArea;

    private Pianista pianista = new Pianista();
    private Piano piano = new Piano();
    private Video video = new Video();

    @FXML
    public void initialize() {
        outputArea.setText("Painel 'Vídeo' inicializado.\n\n");
    }

    @FXML void handleTocarMusica() { outputArea.appendText("▶ Pianista: " + pianista.tocarMusica() + "\n"); }
    @FXML void handleImprovisar() { outputArea.appendText("▶ Pianista: " + pianista.improvisar() + "\n"); }
    @FXML void handleVirarDeCostas() { outputArea.appendText("▶ Pianista: " + pianista.virarDeCostas() + "\n"); }

    @FXML void handleEmitirSom() { outputArea.appendText("▶ Piano: " + piano.emitirSom() + "\n"); }
    @FXML void handleAbrirTampa() { outputArea.appendText("▶ Piano: " + piano.abrirTampa() + "\n"); }
    @FXML void handleSuportarPeso() { outputArea.appendText("▶ Piano: " + piano.suportarPeso() + "\n"); }

    @FXML void handleReproduzir() { outputArea.appendText("▶ Vídeo: " + video.reproduzir() + "\n"); }
    @FXML void handlePausar() { outputArea.appendText("▶ Vídeo: " + video.pausar() + "\n"); }
    @FXML void handleAvancar() { outputArea.appendText("▶ Vídeo: " + video.avancar() + "\n"); }
}