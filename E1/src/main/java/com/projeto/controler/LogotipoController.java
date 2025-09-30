package com.projeto.controler;

import com.projeto.model.Mao;
import com.projeto.model.Notificacao;
import com.projeto.model.Simbolo;
import com.projeto.service.CsvService;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class LogotipoController {
    @FXML
    private TextArea outputArea;

    private final CsvService csvService = new CsvService();
    private final String nomeArquivoCsv = "logotipos.csv";
    private final String[] cabecalhoCsv = { "Classe", "Metodo", "Resultado" };

    private Simbolo simbolo = new Simbolo();
    private Mao mao = new Mao();
    private Notificacao notificacao = new Notificacao();

    @FXML
    public void initialize() {
        outputArea.setText("Painel 'Logotipo' inicializado. Ações serão salvas em " + nomeArquivoCsv + "\n\n");
    }

    //Classe Simbolo
    @FXML
    void handleAnimarSimbolo() {
        String resultado = simbolo.animar();
        outputArea.appendText("▶ Simbolo: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Simbolo", "animar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleMudarCorSimbolo() {
        String resultado = simbolo.mudarCor();
        outputArea.appendText("▶ Simbolo: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Simbolo", "mudarCor()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleRepresentarMarca() {
        String resultado = simbolo.representarMarca();
        outputArea.appendText("▶ Simbolo: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Simbolo", "representarMarca()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    //Classe Mão
    @FXML
    void handleClicarMao() {
        String resultado = mao.clicar();
        outputArea.appendText("▶ Mão: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Mao", "clicar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleCurtirMao() {
        String resultado = mao.curtir();
        outputArea.appendText("▶ Mão: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Mao", "curtir()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleDigitarMao() {
        String resultado = mao.digitar();
        outputArea.appendText("▶ Mão: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Mao", "digitar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    //Classe Notificação
    @FXML
    void handleExibirContador() {
        String resultado = notificacao.exibirContador();
        outputArea.appendText("▶ Notificação: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Notificacao", "exibirContador()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handlePiscarNotificacao() {
        String resultado = notificacao.piscar();
        outputArea.appendText("▶ Notificação: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Notificacao", "piscar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleSumirNotificacao() {
        String resultado = notificacao.sumir();
        outputArea.appendText("▶ Notificação: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Notificacao", "sumir()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }
}