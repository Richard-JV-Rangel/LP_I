package com.projeto.service;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CsvService {

    private final String diretorio = "data";

    public CsvService() {
        try {
            Files.createDirectories(Paths.get(diretorio));
        } catch (IOException e) {
            System.err.println("Falha ao criar o diretório de dados: " + e.getMessage());
        }
    }

    /** Parametros:
     * @param nomeArquivo
     * @param cabecalho
     * @param dados
     */
    public void salvarRegistro(String nomeArquivo, String[] cabecalho, String... dados) {
        String caminhoCompleto = diretorio + File.separator + nomeArquivo;
        File arquivo = new File(caminhoCompleto);
        boolean arquivoNovo = !arquivo.exists();

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String[] dadosComTimestamp = new String[dados.length + 1];
        dadosComTimestamp[0] = timestamp;
        System.arraycopy(dados, 0, dadosComTimestamp, 1, dados.length);

        String[] cabecalhoComTimestamp = new String[cabecalho.length + 1];
        cabecalhoComTimestamp[0] = "Timestamp";
        System.arraycopy(cabecalho, 0, cabecalhoComTimestamp, 1, cabecalho.length);

        CSVFormat formato = CSVFormat.DEFAULT.builder()
                .setHeader(cabecalhoComTimestamp)
                .build();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoCompleto, true));
                CSVPrinter csvPrinter = new CSVPrinter(writer, arquivoNovo ? formato : CSVFormat.DEFAULT)) {

            csvPrinter.printRecord((Object[]) dadosComTimestamp);
            csvPrinter.flush();

        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo CSV: " + e.getMessage());
        }
    }
}