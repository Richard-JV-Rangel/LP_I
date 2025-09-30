package com.projeto.controler;

import com.projeto.model.Crime;
import com.projeto.model.InstrumentoMusical;
import com.projeto.model.PessoaMusica;
import com.projeto.service.CsvService;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MusicaController {
    @FXML
    private TextArea outputArea;

    private final CsvService csvService = new CsvService();
    private final String nomeArquivoCsv = "musicas.csv";
    private final String[] cabecalhoCsv = { "Classe", "Metodo", "Resultado" };

    private PessoaMusica pessoaMusica = new PessoaMusica();
    private Crime crime = new Crime();
    private InstrumentoMusical instrumentoMusical = new InstrumentoMusical();

    @FXML
    public void initialize() {
        outputArea.setText("Painel 'Música' inicializado. Ações serão salvas em " + nomeArquivoCsv + "\n\n");
    }

    @FXML
    void handleCantar() {
        String resultado = pessoaMusica.cantar();
        outputArea.appendText("▶ Pessoa: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "PessoaMusica", "cantar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleCometerCrime() {
        String resultado = crime.cometer();
        outputArea.appendText("▶ Crime: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "Crime", "cometer()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }

    @FXML
    void handleTocarInstrumento() {
        String resultado = instrumentoMusical.tocar();
        outputArea.appendText("▶ Instrumento: " + resultado + "\n");
        csvService.salvarRegistro(nomeArquivoCsv, cabecalhoCsv, "InstrumentoMusical", "tocar()", resultado);
        outputArea.appendText("   [CSV] Registro salvo.\n");
    }
}