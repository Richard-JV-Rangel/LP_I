package com.projeto.controler;

import com.projeto.model.Pianista;
import com.projeto.model.Piano;
import com.projeto.model.Video;
import com.projeto.service.CsvService;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class VideoController {
    @FXML
    private TextArea outputArea;

    private final CsvService csvService = new CsvService();
    private final String nomeArquivoCsv = "videos.csv";
    private final String[] cabecalhoCsv = { "Classe", "Metodo", "Resultado" };

    private Pianista pianista = new Pianista();
    private Piano piano = new Piano();
    private Video video = new Video();

    @FXML
    public void initialize() {
        outputArea.setText("Painel 'Vídeo' inicializado. Ações serão salvas em " + nomeArquivoCsv + "\n\n");
    }

    //Classe Pianista
    @FXML
    void handleTocarMusica() {
        String resultado = pianista.tocarMusica();
        outputArea.appendText("▶ Pianista: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Pianista", "tocarMusica()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleImprovisar() {
        String resultado = pianista.improvisar();
        outputArea.appendText("▶ Pianista: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Pianista", "improvisar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleVirarDeCostas() {
        String resultado = pianista.virarDeCostas();
        outputArea.appendText("▶ Pianista: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Pianista", "virarDeCostas()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    //Classe Piano
    @FXML
    void handleEmitirSom() {
        String resultado = piano.emitirSom();
        outputArea.appendText("▶ Piano: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Piano", "emitirSom()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleAbrirTampa() {
        String resultado = piano.abrirTampa();
        outputArea.appendText("▶ Piano: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Piano", "abrirTampa()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleSuportarPeso() {
        String resultado = piano.suportarPeso();
        outputArea.appendText("▶ Piano: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Piano", "suportarPeso()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    //Classe Video
    @FXML
    void handleReproduzir() {
        String resultado = video.reproduzir();
        outputArea.appendText("▶ Vídeo: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Video", "reproduzir()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handlePausar() {
        String resultado = video.pausar();
        outputArea.appendText("▶ Vídeo: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Video", "pausar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleAvancar() {
        String resultado = video.avancar();
        outputArea.appendText("▶ Vídeo: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Video", "avancar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }
}