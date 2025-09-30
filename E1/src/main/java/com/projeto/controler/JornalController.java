package com.projeto.controler;

import com.projeto.model.Cidade;
import com.projeto.model.CorpoDeAgua;
import com.projeto.model.Jornal;
import com.projeto.service.CsvService;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class JornalController {
    @FXML
    private TextArea outputArea;

    private final CsvService csvService = new CsvService();
    private final String nomeArquivoCsv = "jornal.csv";
    private final String[] cabecalhoCsv = { "Classe", "Metodo", "Resultado" };

    private Jornal jornal = new Jornal();
    private Cidade cidade = new Cidade();
    private CorpoDeAgua corpoDeAgua = new CorpoDeAgua();

    @FXML
    public void initialize() {
        outputArea.setText("Painel 'Jornal' inicializado. Ações serão salvas em " + nomeArquivoCsv + "\n\n");
    }

    @FXML
    void handleFlutuar() {
        String resultado = jornal.flutuar();
        outputArea.appendText("▶ Jornal: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Jornal", "flutuar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleSerTuristica() {
        String resultado = cidade.serTuristica();
        outputArea.appendText("▶ Cidade: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Cidade", "serTuristica()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleMovimentarAgua() {
        String resultado = corpoDeAgua.movimentar();
        outputArea.appendText("▶ Água: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "CorpoDeAgua", "movimentar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }
}